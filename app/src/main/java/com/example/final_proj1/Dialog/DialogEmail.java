package com.example.final_proj1.Dialog;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.final_proj1.MainSettingActivity;
import com.example.final_proj1.R;
import com.example.final_proj1.databinding.CustomDialogEmailBinding;
import com.example.final_proj1.databinding.CustomDialogPasswordBinding;


public class DialogEmail extends DialogFragment {

    private OnPositiveEmail positiveEmail;
    private OnNegativeEmail negativeEmail;
    CustomDialogEmailBinding binding ;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnPositiveEmail){
            positiveEmail = (OnPositiveEmail) context;
        } else
            throw new RuntimeException("Please implement listener positive");

        if (context instanceof OnNegativeEmail){
            negativeEmail = (OnNegativeEmail) context;
        } else
            throw new RuntimeException("Please implement listener Negative");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        positiveEmail = null ;
        negativeEmail = null ;
    }

    public DialogEmail() {
        // Required empty public constructor
    }

    public static DialogEmail newInstance() {
        DialogEmail fragment = new DialogEmail();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
    }
    // لانشاء تصميم ال Dialog الخاص لنفسي
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = CustomDialogEmailBinding.inflate(inflater , container , false);

        return binding.getRoot() ;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnYseEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (binding.etNewEmail != null && binding.etOldEmail != null) {
                    positiveEmail.onPositiveButtonEmail(binding.etNewEmail.getText().toString(),  binding.etOldEmail.getText().toString());
                }
                dismiss();


            }
        });

        binding.btnNoEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                negativeEmail.onNegativeButtonEmail();
                dismiss();

            }
        });

        binding.imgArrowEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    // لارسال البيانات من ال DialogFragment الى ال Activity
    public interface OnPositiveEmail{
        void onPositiveButtonEmail(String newEmail , String oldEmail);
    }
    public interface OnNegativeEmail{
        void onNegativeButtonEmail();
    }
}