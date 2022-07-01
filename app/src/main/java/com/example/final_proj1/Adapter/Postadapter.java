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
import com.example.final_proj1.Models.Food;
import com.example.final_proj1.Models.Post;
import com.example.final_proj1.R;
import com.example.final_proj1.databinding.ItemPostLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class Postadapter extends RecyclerView.Adapter<Postadapter.postviewholder> {
    List<Post> postList;
    Context context;
    MyViewModel mvm;

    public Postadapter(List<Post> postList, Context context, MyViewModel mvm) {
        this.postList = postList;
        this.context = context;
        this.mvm = mvm;
    }

    public Postadapter(List<Post> postList, Context context) {
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public postviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post_layout, parent, false);
        return new postviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull postviewholder holder, int position) {

        Post p = postList.get(position);
        holder.data1(p,mvm);

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    class postviewholder extends RecyclerView.ViewHolder {
        ItemPostLayoutBinding binding;
        Post p;
        private Object Context;

        public postviewholder(@NonNull View itemView) {
            super(itemView);
            binding = ItemPostLayoutBinding.bind(itemView);

        }
        void data1(Post post, MyViewModel mvm){
            binding.tvNameDoctor.setText(post.getName_doctor());
            binding.tvLikePost.setText(post.getLike_post());
            binding.tvBodyPost.setText(post.getBody_post());
            binding.tvDatePublication.setText(post.getDate_publication());
            binding.tvCommentPost.setText(post.getComment_post());
            Glide.with((Activity) Context).load(post.getImg_content()).into
                    (binding.imgContentPost);
        }
    }
}
