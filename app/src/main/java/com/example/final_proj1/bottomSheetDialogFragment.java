package com.example.final_proj1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.final_proj1.databinding.FragmentItemBottomsheetDialogBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class bottomSheetDialogFragment extends BottomSheetDialogFragment {

    private FragmentItemBottomsheetDialogBinding binding;
     BottomSheetListener listener;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        binding = FragmentItemBottomsheetDialogBinding.inflate(inflater, container, false);
        return binding.getRoot();



    }
    public interface  BottomSheetListener {
        void  onButtonClicked();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        binding.btnCloseDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//dismiss();
//            }
//        });
        binding.bsheetitem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),AddConsultation.class));
//                dismiss();
            }
        });
        binding.bsheetitem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "هذه الميزة غير متوفرة", Toast.LENGTH_SHORT).show();
            }
        });
        binding.bsheetitem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),AddFood.class));
//                dismiss();

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}