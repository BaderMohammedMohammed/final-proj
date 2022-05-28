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

import com.example.final_proj1.Models.Consultion;
import com.example.final_proj1.Models.Post;
import com.example.final_proj1.R;

import java.util.ArrayList;

public class consultionadapter extends RecyclerView.Adapter<consultionadapter.Consultionviewholder> {
    ArrayList<Consultion> consultionArrayList;
    Context context;
    OnRVitemclicklistenarConsultion listenar;

    public consultionadapter(ArrayList<Consultion> consultionArrayList, Context context, OnRVitemclicklistenarConsultion listenar) {
        this.consultionArrayList = consultionArrayList;
        this.context = context;
        this.listenar = listenar;
    }

    @NonNull
    @Override
    public Consultionviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_layout, parent, false);
        return new Consultionviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Consultionviewholder holder, int position) {

        Consultion c = consultionArrayList.get(position);
        holder.c = c;
        holder.comment_post.setText(c.getComment_post()+" comment");
        holder.like_post.setText(c.getLike_post()+" like");
        holder.name_doctor.setText(c.getName_user());
        holder.body_post.setText(c.getBody_post());
        holder.date_publication.setText(c.getDate_publication()+"h ago");
        holder.img_doctor.setImageURI(Uri.parse(c.getImg_user()));
        holder.img_content_post.setImageURI(Uri.parse(c.getImg_consultion()));

    }

    @Override
    public int getItemCount() {
        return consultionArrayList.size();
    }

    class Consultionviewholder extends RecyclerView.ViewHolder {

        Consultion c;
        ImageView img_doctor,img_content_post;
        TextView comment_post,like_post,name_doctor,body_post,date_publication;


        public Consultionviewholder(@NonNull View itemView) {
            super(itemView);
            img_doctor=itemView.findViewById(R.id.profile_image);
            img_content_post=itemView.findViewById(R.id.img_content_post);
            comment_post=itemView.findViewById(R.id.tv_comment_post);
            like_post=itemView.findViewById(R.id.tv_like_post);
            name_doctor=itemView.findViewById(R.id.tv_name_doctor);
            body_post=itemView.findViewById(R.id.tv_body_post);
            date_publication=itemView.findViewById(R.id.tv_date_publication);


        }
    }
}
