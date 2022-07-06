package com.example.final_proj1.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.final_proj1.Entity.Topics;
import com.example.final_proj1.Interface.OnRVitemclicklistenar;
import com.example.final_proj1.R;
import com.example.final_proj1.databinding.ItemRvtopicsBinding;

import java.util.List;

public class Topicsadapter extends RecyclerView.Adapter<Topicsadapter.topicsviewholder> {
    List<Topics> topicsList;
    Context context;
    OnRVitemclicklistenar listenar;

    public Topicsadapter(List<Topics> topicsList, Context context, OnRVitemclicklistenar listenar) {
        this.topicsList = topicsList;
        this.context = context;
        this.listenar = listenar;
    }

    public List<Topics> getTopicsList() {
        return topicsList;
    }

    public void setTopicsList(List<Topics> topicsList) {
        this.topicsList = topicsList;
    }

    @NonNull
    @Override
    public topicsviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rvtopics, parent, false);
        return new topicsviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull topicsviewholder holder, int position) {
        Topics t = topicsList.get(position);
        holder.data1(t);


    }

    @Override
    public int getItemCount() {
        return topicsList.size();
    }

    class topicsviewholder extends RecyclerView.ViewHolder {
        ItemRvtopicsBinding binding;
        Topics t;
        private Object Context;

        public topicsviewholder(@NonNull View itemView) {
            super(itemView);
            binding = ItemRvtopicsBinding.bind(itemView);

        }
        void data1(Topics t){
//            binding.imgTopics.setImageURI(t.getImg_topics());
            binding.tvNameTopics.setText(t.getName_topics());
            binding.tvNumTopics.setText(t.getNumtopics());
            Glide.with((Activity) Context).load(t.getImg_topics()).into
                    (binding.imgTopics);

        }
    }
}
