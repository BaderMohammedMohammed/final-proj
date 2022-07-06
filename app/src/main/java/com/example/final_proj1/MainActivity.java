package com.example.final_proj1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.final_proj1.Dialog.DialogSignOut;
import com.example.final_proj1.databinding.ActivityMainBinding;
import com.example.final_proj1.fragments.ConsultionFragment;
import com.example.final_proj1.fragments.FoodFragment;
import com.example.final_proj1.fragments.FragmentAccountScreen;
import com.example.final_proj1.fragments.HomeFragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity implements DialogSignOut.OnNegativeSignOut , DialogSignOut.OnPositiveSignOut {
    ActivityMainBinding binding;
//    BottomNavigationAdapter bottomNavigationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        bottomNavigationAdapter = new BottomNavigationAdapter(this);

       // bottomNavigationAdapter = new BottomNavigationAdapter(this);
        String ss = "uhuhu";

        binding.bottomNav.add(new MeowBottomNavigation.Model(1 , R.drawable.ic_home ));
        binding.bottomNav.add(new MeowBottomNavigation.Model(2 , R.drawable.ic_restaurant));
        binding.bottomNav.add(new MeowBottomNavigation.Model(3 , R.drawable.ic_add));
        binding.bottomNav.add(new MeowBottomNavigation.Model(4 , R.drawable.ic_sheet));
        binding.bottomNav.add(new MeowBottomNavigation.Model(5 , R.drawable.ic_acount));

        binding.bottomNav.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment = null ;
                switch (model.getId()){
                    case 1 : {
                        fragment = new HomeFragment() ;
                    }
                    break;
                    case 2 : {
                        fragment = new FoodFragment();
                    }
                    break;
                    case 3 : {
                        bottomSheetDialogFragment psdf = new bottomSheetDialogFragment();
                        psdf.show(getSupportFragmentManager(), null);
                        fragment = psdf ;
                    }
                    break;
                    case 4 : {
                        fragment = new ConsultionFragment();
                    }
                    break;
                    case 5 : {
                        fragment = new FragmentAccountScreen();
                    }
                    break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentMain , fragment , null).commit();

                return null;
            }
        });

        binding.bottomNav.show(1 , true);


//        binding.vp.setAdapter(bottomNavigationAdapter);
//        binding.vp.setUserInputEnabled(false);
//
//        binding.BottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()) {
//                    case R.id.mehome: {
//                        binding.vp.setCurrentItem(0);
//                        binding.BottomNavigationView.getMenu().getItem(0).setChecked(true);
//                    }
//                    break;
//                    case R.id.merestaurant: {
//                        binding.vp.setCurrentItem(1);
//                        binding.BottomNavigationView.getMenu().getItem(1).setChecked(true);
//
//                    }
//                    break;
//                    case R.id.mesheet: {
//                        binding.vp.setCurrentItem(2);
//                        binding.BottomNavigationView.getMenu().getItem(3).setChecked(true);
//
//                    }
//                    break;
//                    case R.id.meacount: {
//                        binding.vp.setCurrentItem(3);
//                        binding.BottomNavigationView.getMenu().getItem(4).setChecked(true);
//
//                    }
//                }
//                return false;
//            }
//        });
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                bottom_sheet_DialogFragment psdf = new bottom_sheet_DialogFragment();
//                psdf.show(getSupportFragmentManager(), null);
//            }
//        });
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