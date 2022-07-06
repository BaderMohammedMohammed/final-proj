package com.example.final_proj1.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.final_proj1.fragments.ConsultionFragment;
import com.example.final_proj1.fragments.FoodFragment;
import com.example.final_proj1.fragments.FragmentAccountScreen;
import com.example.final_proj1.fragments.HomeFragment;

public class BottomNavigationAdapter extends FragmentStateAdapter {


    public BottomNavigationAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new ConsultionFragment();
            default:
                return new FragmentAccountScreen();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
