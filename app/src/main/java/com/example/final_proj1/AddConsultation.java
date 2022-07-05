package com.example.final_proj1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.final_proj1.Entity.Consultion;
import com.example.final_proj1.Entity.Food;
import com.example.final_proj1.databinding.ActivityAddConsultationBinding;
import com.google.firebase.firestore.FirebaseFirestore;


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

        binding.btnPublichTopublic.setOnClickListener(view->{



            addConsultation(new Consultion(),succes->{

            },error->{

            });

        });
    }



    private void addConsultation(Consultion consultion, Listiner<String> successListener, Listiner<Throwable> errorListener){
        FirebaseFirestore.getInstance()
                .collection("Consultion")
                .add(consultion)
                .addOnSuccessListener(documentReference -> {
                    successListener.getData("done!!");
                })
                .addOnFailureListener(errorListener::getData);
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