package com.example.final_proj1.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.final_proj1.Entity.ListTopic;
import com.example.final_proj1.Interface.OnRVitemclicklistenarListTopic;
import com.example.final_proj1.R;
import com.example.final_proj1.databinding.ItemRvTopiclistBinding;

import java.util.List;

public class ListTopicadapter extends RecyclerView.Adapter<ListTopicadapter.listtopicviewholder> {
    List<ListTopic> listTopic;
    Context context;
    OnRVitemclicklistenarListTopic listenar;


    public ListTopicadapter(List<ListTopic> listTopic, Context context, OnRVitemclicklistenarListTopic listenar) {
        this.listTopic = listTopic;
        this.context = context;
        this.listenar = listenar;
    }

    public ListTopicadapter() {
    }

    public List<ListTopic> getListTopic() {
        return listTopic;
    }

    public void setListTopic(List<ListTopic> listTopic) {
        this.listTopic = listTopic;
    }

    @NonNull
    @Override
    public listtopicviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_topiclist, parent, false);
        return new listtopicviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull listtopicviewholder holder, int position) {
        ListTopic lt = listTopic.get(position);
        holder.data1(lt);
    }

    @Override
    public int getItemCount() {
        return listTopic.size();
    }

    class listtopicviewholder extends RecyclerView.ViewHolder {
        ItemRvTopiclistBinding binding;
        ListTopic lt;
        private Object Context;

        public listtopicviewholder(@NonNull View itemView) {
            super(itemView);
            binding = ItemRvTopiclistBinding.bind(itemView);

        }

        void data1(ListTopic lt){
            binding.tvTitleTopic.setText(lt.getTitel_tobiclist());
            binding.tvBodyTopic.setText(lt.getBody_tobiclist());
            Glide.with((Activity) Context).load(lt.getImgtopic()).into
                    (binding.imgTopicsinItem);
        }
    }
}
