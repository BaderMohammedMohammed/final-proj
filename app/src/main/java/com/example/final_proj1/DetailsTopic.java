package com.example.final_proj1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.final_proj1.databinding.ActivityDetailsTopicBinding;


public class DetailsTopic extends AppCompatActivity {
ActivityDetailsTopicBinding binding;
int num =0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailsTopicBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.imgBackDetailstopics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        binding.imgAddlikeDetailstopics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.imgAddlikeDetailstopics.setImageResource(R.drawable.like_true);

//                int number = Integer.parseInt(binding.tvCountlikeDetailstopics.getText().toString());
//                num = number+1 ;
//                binding.tvCountlikeDetailstopics.setText(num);

            }
        });
    }
}