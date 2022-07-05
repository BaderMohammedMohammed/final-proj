package com.example.final_proj1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.example.final_proj1.Adapter.ListTopicadapter;
import com.example.final_proj1.Interface.OnRVitemclicklistenarListTopic;
import com.example.final_proj1.Entity.ListTopic;
import com.example.final_proj1.databinding.ActivityTopicListBinding;

import java.util.ArrayList;

public class TopicList extends AppCompatActivity {
ActivityTopicListBinding binding ;
ArrayList<ListTopic> arrayListtopic=new ArrayList<>();
ListTopicadapter listTopicadapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTopicListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        listTopicadapter=new ListTopicadapter(arrayListtopic, TopicList.this, new OnRVitemclicklistenarListTopic() {
//            @Override
//            public void onItemClicked(ListTopic listTopic) {
//                startActivity(new Intent(TopicList.this,DetailsTopic.class));
//            }
//        });

        arrayListtopic.add(new ListTopic("1","R.drawable.baby", "نصائح هامة لاستحمام الرضيع", "يجب الاهتمام بتحميم رضيعك خلال الاشهر الاولى"));
        arrayListtopic.add(new ListTopic("1","R.drawable.sugar", "استحمام الرضيع", "يجب الاهتمام بتحميم رضيعك خلال الاشهر الاولى"));
        arrayListtopic.add(new ListTopic("1","R.drawable.baby", "نصائح هامة لاستحمام الرضيع", "يجب الاهتمام بتحميم رضيعك خلال الاشهر الاولى"));
        arrayListtopic.add(new ListTopic("1","R.drawable.women", "نصائح هامة لاستحمام الرضيع", "يجب الاهتمام بتحميم رضيعك خلال الاشهر الاولى"));
        arrayListtopic.add(new ListTopic("1","R.drawable.baby", "نصائح هامة لاستحمام الرضيع", "يجب الاهتمام بتحميم رضيعك خلال الاشهر الاولى"));
        binding.rvTopiclist.setAdapter(listTopicadapter);
        binding.rvTopiclist.setLayoutManager(new LinearLayoutManager(TopicList.this));
        binding.rvTopiclist.setHasFixedSize(true);



    }
}