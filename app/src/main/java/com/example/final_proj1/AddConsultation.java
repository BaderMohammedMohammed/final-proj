package com.example.final_proj1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_proj1.databinding.ActivityAddConsultationBinding;


public class AddConsultation extends AppCompatActivity {
ActivityAddConsultationBinding binding;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddConsultationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.imgContentAddConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
                startActivityForResult(intent, 1);
            }
        });
        binding.imgBackAddConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                uri = data.getData();
                binding.imgContentAddConsultation.setImageURI(uri);
            }
        }
    }
}