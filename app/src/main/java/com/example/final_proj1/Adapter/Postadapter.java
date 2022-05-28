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


import com.example.final_proj1.Models.Post;
import com.example.final_proj1.R;

import java.util.ArrayList;

public class Postadapter extends RecyclerView.Adapter<Postadapter.postviewholder> {
    ArrayList<Post> postArrayList;
    Context context;

    public Postadapter(ArrayList<Post> postArrayList, Context context) {
        this.postArrayList = postArrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public postviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_layout, parent, false);
        return new postviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull postviewholder holder, int position) {

        Post p = postArrayList.get(position);
        holder.p = p;
        holder.comment_post.setText(p.getComment_post()+" comment");
        holder.like_post.setText(p.getLike_post()+" like");
        holder.name_doctor.setText(p.getName_doctor());
        holder.body_post.setText(p.getBody_post());
        holder.date_publication.setText(p.getDate_publication()+"h ago");
        holder.img_doctor.setImageURI(Uri.parse(p.getImg_doctor()));
        holder.img_content_post.setImageURI(Uri.parse(p.getImg_content()));

    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    class postviewholder extends RecyclerView.ViewHolder {

        Post p;
        ImageView img_doctor,img_content_post;
        TextView comment_post,like_post,name_doctor,body_post,date_publication;


        public postviewholder(@NonNull View itemView) {
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
