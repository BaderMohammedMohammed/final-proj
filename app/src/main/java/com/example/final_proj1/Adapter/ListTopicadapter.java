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


import com.example.final_proj1.Models.ListTopic;
import com.example.final_proj1.R;

import java.util.ArrayList;

public class ListTopicadapter extends RecyclerView.Adapter<ListTopicadapter.listtopicviewholder> {
    ArrayList<ListTopic> listTopicArrayList;
    Context context;
    OnRVitemclicklistenarListTopic listenar;

    public ListTopicadapter(ArrayList<ListTopic> listTopicArrayList, Context context, OnRVitemclicklistenarListTopic listenar) {
        this.listTopicArrayList = listTopicArrayList;
        this.context = context;
        this.listenar = listenar;
    }

    @NonNull
    @Override
    public listtopicviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_topiclist, parent, false);
        return new listtopicviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull listtopicviewholder holder, int position) {

        ListTopic lt = listTopicArrayList.get(position);
        holder.lt = lt;
        holder.titel_tobiclist.setText(lt.getTitel_tobiclist());
        holder.body_tobiclist.setText(lt.getBody_tobiclist());
        holder.imgtopic.setImageURI(Uri.parse(lt.getImgtopic()));


    }

    @Override
    public int getItemCount() {
        return listTopicArrayList.size();
    }

    class listtopicviewholder extends RecyclerView.ViewHolder {

        ListTopic lt;
        ImageView imgtopic;
        TextView titel_tobiclist,body_tobiclist;

        public listtopicviewholder(@NonNull View itemView) {
            super(itemView);
            imgtopic = itemView.findViewById(R.id.img_topicsin_item);
            titel_tobiclist = itemView.findViewById(R.id.tv_title_topic);
            body_tobiclist = itemView.findViewById(R.id.tv_body_topic);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listenar.onItemClicked(lt);

                }
            });

        }
    }
}
