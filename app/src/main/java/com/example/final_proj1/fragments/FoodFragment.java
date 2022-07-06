package com.example.final_proj1.fragments;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.final_proj1.Adapter.ListFoodadapter;
import com.example.final_proj1.Interface.OnRVitemclicklistenarListFood;
import com.example.final_proj1.DetailsFood;
import com.example.final_proj1.Entity.Food;
import com.example.final_proj1.databinding.FragmentFoodBinding;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    FragmentFoodBinding binding ;
    ArrayList<Food> foodArrayList=new ArrayList<>();
    ListFoodadapter foodadapter ;
    public static final String FOOD_KEY = "FOOD";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFoodBinding.inflate(inflater , container , false);


        return binding.getRoot();

    }

    ActivityResultLauncher<Intent> arl = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                }
            }
    );

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        foodadapter = new ListFoodadapter();
        binding.rvListfood.setAdapter(foodadapter);
        binding.rvListfood.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rvListfood.setHasFixedSize(true);

        startActivity(new Intent(getContext(), DetailsFood.class));
        foodadapter=new ListFoodadapter(foodArrayList, getContext(), new OnRVitemclicklistenarListFood() {
            @Override
            public void onItemClicked(Food listFood) {

            }

        });

    }
}