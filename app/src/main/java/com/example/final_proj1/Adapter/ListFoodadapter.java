package com.example.final_proj1.Adapter;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.final_proj1.Database.MyViewModel;
import com.example.final_proj1.Entity.Food;
import com.example.final_proj1.Interface.OnRVitemclicklistenarListFood;
import com.example.final_proj1.R;
import com.example.final_proj1.databinding.ItemRvFoodBinding;

import java.util.ArrayList;
import java.util.List;

public class ListFoodadapter extends RecyclerView.Adapter<ListFoodadapter.listtopicviewholder> {
    List<Food> listFood;
    Context context;
    MyViewModel mvm;
    OnRVitemclicklistenarListFood listenar;

    public ListFoodadapter(List<Food> listFood, Context context, MyViewModel mvm, OnRVitemclicklistenarListFood listenar) {
        this.listFood = listFood;
        this.context = context;
        this.mvm = mvm;
        this.listenar = listenar;
    }

    public ListFoodadapter() {
    }

    public <E> ListFoodadapter(ArrayList<E> es, MyViewModel myViewModel) {

    }

    public List<Food> getListFood() {
        return listFood;
    }

    public void setListFood(ArrayList<Food> listFoodArrayList) {
        this.listFood = listFoodArrayList;
    }

    @NonNull
    @Override
    public listtopicviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_food, parent, false);
        return new listtopicviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull listtopicviewholder holder, int position) {
        Food f = listFood.get(position);
        holder.data1(f,mvm);

    }

    @Override
    public int getItemCount() {

        return listFood.size();
    }

    static class listtopicviewholder extends RecyclerView.ViewHolder {
        ItemRvFoodBinding binding;
        Food f;
        ImageView ImageFood;
        private Object Context;

        public listtopicviewholder(@NonNull View itemView) {
            super(itemView);
            binding = ItemRvFoodBinding.bind(itemView);
        }
        void data1(Food food, MyViewModel mvm){
            binding.tvNameFood.setText(food.getNameFood());
            binding.tvNamePublisher.setText(food.getNamePublisher());
            binding.tvNumofPeopleEat.setText(food.getNumPerson());
            binding.tvDatePublisher.setText(food.getDatePublisher());
            binding.tvTimePrepare.setText(food.getTimePrepare());
            Glide.with((Activity) Context).load(food.getImageFood()).into
                    (binding.imgItemfood);
        }
    }
}

