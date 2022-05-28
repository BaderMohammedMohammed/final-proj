package com.example.final_proj1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.final_proj1.Adapter.BottomNavigationAdapter;
import com.example.final_proj1.Adapter.Postadapter;
import com.example.final_proj1.Dialog.DialogSignOut;
import com.example.final_proj1.Models.Post;
import com.example.final_proj1.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements DialogSignOut.OnNegativeSignOut , DialogSignOut.OnPositiveSignOut {
    ActivityMainBinding binding;
    BottomNavigationAdapter bottomNavigationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        bottomNavigationAdapter = new BottomNavigationAdapter(this);
        String ss = "jj";

        binding.vp.setAdapter(bottomNavigationAdapter);
        binding.vp.setUserInputEnabled(false);

        binding.BottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.mehome: {
                        binding.vp.setCurrentItem(0);
                        binding.BottomNavigationView.getMenu().getItem(0).setChecked(true);
                    }
                    break;
                    case R.id.merestaurant: {
                        binding.vp.setCurrentItem(1);
                        binding.BottomNavigationView.getMenu().getItem(1).setChecked(true);

                    }
                    break;
                    case R.id.mesheet: {
                        binding.vp.setCurrentItem(2);
                        binding.BottomNavigationView.getMenu().getItem(3).setChecked(true);

                    }
                    break;
                    case R.id.meacount: {
                        binding.vp.setCurrentItem(3);
                        binding.BottomNavigationView.getMenu().getItem(4).setChecked(true);

                    }
                }
                return false;
            }
        });

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottom_sheet_DialogFragment psdf = new bottom_sheet_DialogFragment();
                psdf.show(getSupportFragmentManager(), null);
            }
        });
    }


    @Override
    public void onPositiveButtonSignOut() {
        Toast.makeText(this, "تم تسجيل الخروج" , Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNegativeButtonSignOut() {
        Toast.makeText(this, "تم الغاء تسجيل الخروج" , Toast.LENGTH_SHORT).show();

    }
}