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

import com.example.final_proj1.Models.Food;
import com.example.final_proj1.Models.ListTopic;
import com.example.final_proj1.R;

import java.util.ArrayList;

public class ListFoodadapter extends RecyclerView.Adapter<ListFoodadapter.listtopicviewholder> {
    ArrayList<Food> listFoodArrayList;
    Context context;
    OnRVitemclicklistenarListFood listenar;

    public ListFoodadapter(ArrayList<Food> listFoodArrayList, Context context, OnRVitemclicklistenarListFood listenar) {
        this.listFoodArrayList = listFoodArrayList;
        this.context = context;
        this.listenar = listenar;
    }

    @NonNull
    @Override
    public listtopicviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_food, parent, false);
        return new listtopicviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull listtopicviewholder holder, int position) {

        Food f = listFoodArrayList.get(position);
        holder.f = f;
        holder.numPerson.setText(f.getNumPerson());
        holder.nameFood.setText(f.getNameFood());
        holder.ImageFood.setImageURI(Uri.parse(f.getImageFood()));
        holder.namePublisher.setText(f.getNamePublisher());
        holder.timePrepare.setText(f.getTimePrepare());
        holder.datePublisher.setText(f.getDatePublisher());
        holder.numLike.setText(f.getNumLike());



    }

    @Override
    public int getItemCount() {
        return listFoodArrayList.size();
    }

    class listtopicviewholder extends RecyclerView.ViewHolder {

        Food f;
        ImageView ImageFood;
        TextView nameFood,numPerson,namePublisher,timePrepare,datePublisher,numLike;

        public listtopicviewholder(@NonNull View itemView) {
            super(itemView);
            ImageFood = itemView.findViewById(R.id.img_itemfood);
            nameFood = itemView.findViewById(R.id.tv_name_food);
            numPerson = itemView.findViewById(R.id.tv_numof_people_eat);
            namePublisher = itemView.findViewById(R.id.tv_name_publisher);
            timePrepare = itemView.findViewById(R.id.tv_time_prepare);
            datePublisher = itemView.findViewById(R.id.tv_date_publisher);
            numLike = itemView.findViewById(R.id.tv_num_like_to_eat);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listenar.onItemClicked(f);

                }
            });

        }
    }
}
