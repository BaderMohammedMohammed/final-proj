package com.example.final_proj1.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.final_proj1.Adapter.ListFoodadapter;
import com.example.final_proj1.Adapter.OnRVitemclicklistenarListFood;
import com.example.final_proj1.Database.MyViewModel;
import com.example.final_proj1.DetailsFood;
import com.example.final_proj1.Models.Food;
import com.example.final_proj1.R;
import com.example.final_proj1.databinding.FragmentFoodBinding;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    FragmentFoodBinding binding ;
    ArrayList<Food> foodArrayList=new ArrayList<>();
    ListFoodadapter foodadapter ;
    private Object MyViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFoodBinding.inflate(inflater , container , false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        foodadapter=new ListFoodadapter(foodArrayList, getContext(), (com.example.final_proj1.Database.MyViewModel) MyViewModel, new OnRVitemclicklistenarListFood() {
            @Override
            public void onItemClicked(Food listFood) {
                startActivity(new Intent(getContext(), DetailsFood.class));
            }
        });

        foodArrayList.add(new Food("1","R.drawable.donat","20","Donat","10","mohammed","1 Hour","6/12/2004"));
        foodArrayList.add(new Food("1","R.drawable.donat","20","Donat","10","mohammed","1 Hour","6/12/2004"));
        foodArrayList.add(new Food("1","R.drawable.donat","20","Donat","10","mohammed","1 Hour","6/12/2004"));
        foodArrayList.add(new Food("1","R.drawable.donat","20","Donat","10","mohammed","1 Hour","6/12/2004"));
        foodArrayList.add(new Food("1","R.drawable.donat","20","Donat","10","mohammed","1 Hour","6/12/2004"));
        foodArrayList.add(new Food("1","R.drawable.donat","20","Donat","10","mohammed","1 Hour","6/12/2004"));
        foodArrayList.add(new Food("1","R.drawable.donat","2","Donat","10","mohammed","1 Hour","6/12/2004"));
        binding.rvListfood.setAdapter(foodadapter);
        binding.rvListfood.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvListfood.setHasFixedSize(true);
    }
}