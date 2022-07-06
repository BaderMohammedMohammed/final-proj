package com.example.final_proj1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;


import com.example.final_proj1.Interface.OnRVitemclicklistenar;
import com.example.final_proj1.Adapter.Topicsadapter;
import com.example.final_proj1.Entity.Topics;
import com.example.final_proj1.databinding.ActivityTopicsBinding;

import java.util.ArrayList;

public class TopicsActivity extends AppCompatActivity {
    ActivityTopicsBinding binding;
    ArrayList<Topics> topicsArrayList = new ArrayList<>();
    private Object MyViewModel;

    Topicsadapter topicsadapter = new Topicsadapter(topicsArrayList, TopicsActivity.this, new OnRVitemclicklistenar() {
        @Override
        public void onItemClicked(Topics topics) {

            startActivity(new Intent(TopicsActivity.this, TopicList.class));

        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTopicsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dame();
        binding.imgBackTopics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }





    private void dame() {
        topicsArrayList.add(new Topics("1",R.drawable.hairdresser, "8", "العناية بالشعر"));
        topicsArrayList.add(new Topics("1",R.drawable.makeup, "9", "العناية بالبشرة"));
        topicsArrayList.add(new Topics("1",R.drawable.eat, "5", "تغذية ورشاقة"));
        topicsArrayList.add(new Topics("1",R.drawable.baby, "2", "تغذية الاطفال"));
        topicsArrayList.add(new Topics("1",R.drawable.sugar, "5", "مرضى الضغط والسكر"));
        topicsArrayList.add(new Topics("1",R.drawable.corona, "4", "كورونا"));
        topicsArrayList.add(new Topics("1",R.drawable.publichealth, "17", "صحة عامة"));
        topicsArrayList.add(new Topics("1",R.drawable.women, "5", "نسائية"));
        binding.rvTopics.setAdapter(topicsadapter);
        binding.rvTopics.setHasFixedSize(true);
        binding.rvTopics.setLayoutManager(new GridLayoutManager(this,2, GridLayoutManager.VERTICAL,false));

    }


}