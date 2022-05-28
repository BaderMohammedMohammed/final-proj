package com.example.final_proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.final_proj1.databinding.ActivityPersonalInformationScreenBinding;

public class PersonalInformationScreenActivity extends AppCompatActivity {
    ActivityPersonalInformationScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPersonalInformationScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.personalInformationImgArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PersonalInformationScreenActivity.this, "arrow", Toast.LENGTH_SHORT).show();
            }
        });

        binding.personalInformationBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PersonalInformationScreenActivity.this, "save", Toast.LENGTH_SHORT).show();
            }
        });
    }
}