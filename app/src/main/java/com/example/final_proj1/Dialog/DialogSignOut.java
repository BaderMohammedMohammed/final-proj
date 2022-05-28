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

import com.example.final_proj1.R;
import com.example.final_proj1.databinding.CustomDialogSignoutBinding;

public class DialogSignOut extends DialogFragment {

    private OnPositiveSignOut positiveSignOut;
    private OnNegativeSignOut negativeSignOut;
    CustomDialogSignoutBinding binding ;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnPositiveSignOut){
            positiveSignOut = (OnPositiveSignOut) context;
        } else
            throw new RuntimeException("Please implement listener positive SignOut");

        if (context instanceof OnNegativeSignOut){
            negativeSignOut = (OnNegativeSignOut) context;
        } else
            throw new RuntimeException("Please implement listener Negative SignOut");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        positiveSignOut = null ;
        negativeSignOut = null ;
    }

    public DialogSignOut() {
        // Required empty public constructor
    }

    public static DialogSignOut newInstance() {
        DialogSignOut fragment = new DialogSignOut();
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
        View v = inflater.inflate(R.layout.custom_dialog_signout , container , false);
        return v ;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.btnYseSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                positiveSignOut.onPositiveButtonSignOut();
                dismiss();
            }
        });

        binding.btnNoSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                negativeSignOut.onNegativeButtonSignOut();
                dismiss();

            }
        });
    }

    // لارسال البيانات من ال DialogFragment الى ال Activity
    public interface OnPositiveSignOut{
        void onPositiveButtonSignOut();
    }
    public interface OnNegativeSignOut{
        void onNegativeButtonSignOut();
    }
}