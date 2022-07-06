package com.example.final_proj1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_proj1.Adapter.ListFoodadapter;
import com.example.final_proj1.Entity.Food;
import com.example.final_proj1.databinding.ActivityDetailsFoodBinding;

import java.util.ArrayList;
import java.util.List;


public class DetailsFood extends AppCompatActivity {
ActivityDetailsFoodBinding binding;
    ListFoodadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailsFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        adapter = new ListFoodadapter();
        binding.imgBackDetailstopics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}