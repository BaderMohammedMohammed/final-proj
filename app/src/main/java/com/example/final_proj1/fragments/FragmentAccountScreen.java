package com.example.final_proj1.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.final_proj1.Dialog.DialogSignOut;
import com.example.final_proj1.MainSettingActivity;
import com.example.final_proj1.PersonalInformationScreenActivity;
import com.example.final_proj1.R;
import com.example.final_proj1.SigninActivity;
import com.example.final_proj1.TopicsActivity;
import com.example.final_proj1.databinding.FragmentAccountScreenBinding;


public class FragmentAccountScreen extends Fragment {

    FragmentAccountScreenBinding binding ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAccountScreenBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AppCompatActivity activity = (AppCompatActivity) getActivity() ;
        activity.setSupportActionBar(binding.toolbar);
        activity.getSupportActionBar().setTitle("شاشة الملف الشخصي");

        binding.SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "عملية نقل من fragment الى fragment", Toast.LENGTH_SHORT).show();
//                DialogSignOut fragment = DialogSignOut.newInstance();
//                fragment.show(getSupportFragmentManager() , null);
            }
        });

        binding.Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainSettingActivity.class);
                startActivity(intent);
            }
        });

        binding.Personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , PersonalInformationScreenActivity.class);
                startActivity(intent);
            }
        });

        binding.SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , SigninActivity.class);
                startActivity(intent);
            }
        });

    }
}