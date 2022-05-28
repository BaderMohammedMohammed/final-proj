package com.example.final_proj1.Dialog;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.final_proj1.R;
import com.example.final_proj1.databinding.CustomDialogPasswordBinding;

public class DialogPassword extends DialogFragment {

    private OnPositivePassord positivePassword;
    private OnNegativePassord negativePassword;
    CustomDialogPasswordBinding binding ;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnPositivePassord){
            positivePassword = (OnPositivePassord) context;
        } else
            throw new RuntimeException("Please implement listener positive Password");

        if (context instanceof OnNegativePassord){
            negativePassword = (OnNegativePassord) context;
        } else
            throw new RuntimeException("Please implement listener Negative Password");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        positivePassword = null ;
        negativePassword = null ;
    }

    public DialogPassword() {
        // Required empty public constructor
    }

    public static DialogPassword newInstance() {
        DialogPassword fragment = new DialogPassword();
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
        binding = CustomDialogPasswordBinding.inflate(inflater , container , false);
        return binding.getRoot() ;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnYsePass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                positivePassword.onPositiveButtonPassword(binding.etOldPass.getText().toString(), binding.etNewPass.getText().toString()
                        , binding.etReturnPass.getText().toString());
                dismiss();
            }
        });

        binding.btnNoPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                negativePassword.onNegativeButtonPassword();
                dismiss();

            }
        });

        binding.imgArrowPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    // لارسال البيانات من ال DialogFragment الى ال Activity
    public interface OnPositivePassord{
        void onPositiveButtonPassword(String oldPassword , String newPassword , String returnPassword);
    }
    public interface OnNegativePassord{
        void onNegativeButtonPassword();
    }
}