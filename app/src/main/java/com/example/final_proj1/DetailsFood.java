package com.example.final_proj1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.final_proj1.databinding.ActivityDetailsFoodBinding;


public class DetailsFood extends AppCompatActivity {
ActivityDetailsFoodBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailsFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.imgBackDetailstopics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}