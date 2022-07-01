package com.example.final_proj1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_proj1.databinding.ActivityAddFoodBinding;


public class AddFood extends AppCompatActivity {
ActivityAddFoodBinding binding;
    public static final String FOOD_KEY = "FOOD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddFoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.imgFoodAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(intent, 1);
            }
        });
        binding.imgBackAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.btnPublichAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameFood = binding.etNamefoodAddfood.getText().toString();
                String componentsAddfood = binding.etEnterComponentsAddfood.getText().toString();
                String prepareFood = binding.etHowtomakeAddfood.getText().toString();
                String ImageFood = binding.imgFoodAddFood.getDrawable().toString();

                if (TextUtils.isEmpty(nameFood) || TextUtils.isEmpty(componentsAddfood) ||
                        TextUtils.isEmpty(prepareFood) || TextUtils.isEmpty(ImageFood)){
                    Toast.makeText(AddFood.this,
                            "please enter a valid data", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                uri = data.getData();
                binding.imgFoodAddFood.setImageURI(uri);
            }
        }
    }

}