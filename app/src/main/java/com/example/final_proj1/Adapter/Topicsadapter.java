package com.example.final_proj1.Adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_proj1.Models.Topics;
import com.example.final_proj1.R;

import java.util.ArrayList;

public class Topicsadapter extends RecyclerView.Adapter<Topicsadapter.topicsviewholder> {
    ArrayList<Topics> topicsArrayList;
    Context context;
    OnRVitemclicklistenar listenar;

    public Topicsadapter(ArrayList<Topics> topicsArrayList, Context context, OnRVitemclicklistenar listenar) {
        this.topicsArrayList = topicsArrayList;
        this.context = context;
        this.listenar = listenar;
    }

    @NonNull
    @Override
    public topicsviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rvtopics, parent, false);
        return new topicsviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull topicsviewholder holder, int position) {

        Topics t = topicsArrayList.get(position);
        holder.t = t;
        holder.name_topics.setText(t.getName_topics());
        holder.num_topics.setText("موضوع: "+t.getNumtopics());
        holder.img_topics.setImageResource(t.getImg_topics());

    }

    @Override
    public int getItemCount() {
        return topicsArrayList.size();
    }

    class topicsviewholder extends RecyclerView.ViewHolder {

        Topics t;
        ImageView img_topics;
        TextView name_topics, num_topics;


        public topicsviewholder(@NonNull View itemView) {
            super(itemView);
            img_topics = itemView.findViewById(R.id.img_topics);
            name_topics = itemView.findViewById(R.id.tv_name_topics);
            num_topics = itemView.findViewById(R.id.tv_num_topics);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listenar.onItemClicked(t);

                }
            });

        }
    }
}
