package com.example.final_proj1.Adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.final_proj1.Database.MyViewModel;
import com.example.final_proj1.Models.Consultion;
import com.example.final_proj1.Models.Food;
import com.example.final_proj1.Models.Post;
import com.example.final_proj1.R;
import com.example.final_proj1.databinding.ItemPostLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class consultionadapter extends RecyclerView.Adapter<consultionadapter.Consultionviewholder> {
    List<Consultion> consultionlist;
    Context context;
    MyViewModel mvm;
    OnRVitemclicklistenarConsultion listenar;

    public consultionadapter(List<Consultion> consultionlist, Context context, MyViewModel mvm, OnRVitemclicklistenarConsultion listenar) {
        this.consultionlist = consultionlist;
        this.context = context;
        this.mvm = mvm;
        this.listenar = listenar;
    }


    public List<Consultion> getConsultionlist() {
        return consultionlist;
    }

    public void setConsultionlist(List<Consultion> consultionlist) {
        this.consultionlist = consultionlist;
    }

    @NonNull
    @Override
    public Consultionviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_layout, parent, false);
        return new Consultionviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Consultionviewholder holder, int position) {

        Consultion c = consultionlist.get(position);
        holder.data1(c,mvm);

    }

    @Override
    public int getItemCount() {
        return consultionlist.size();
    }

    static class Consultionviewholder extends RecyclerView.ViewHolder {
        ItemPostLayoutBinding binding;
        Consultion c;
        private Object Context;


        public Consultionviewholder(@NonNull View itemView) {
            super(itemView);
            binding = ItemPostLayoutBinding.bind(itemView);
        }

        void data1(Consultion c, MyViewModel mvm){
            binding.tvNameDoctor.setText(c.getName_user());
            binding.tvCommentPost.setText(c.getComment_post());
            binding.tvBodyPost.setText(c.getBody_post());
            binding.tvDatePublication.setText(c.getDate_publication());
            binding.tvLikePost.setText(c.getLike_post());
            Glide.with((Activity) Context).load(c.getImg_consultion()).into
                    (binding.imgContentPost);
        }
    }
}
