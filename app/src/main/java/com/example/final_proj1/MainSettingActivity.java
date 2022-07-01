package com.example.final_proj1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.final_proj1.Dialog.DialogEmail;
import com.example.final_proj1.Dialog.DialogPassword;
import com.example.final_proj1.Dialog.DialogSignOut;
import com.example.final_proj1.databinding.ActivityMainSettingBinding;

public class MainSettingActivity extends AppCompatActivity implements  DialogPassword.OnNegativePassord , DialogPassword.OnPositivePassord
        , DialogEmail.OnNegativeEmail , DialogEmail.OnPositiveEmail , DialogSignOut.OnNegativeSignOut , DialogSignOut.OnPositiveSignOut{
    ActivityMainSettingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainSettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.settingsImgArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainSettingActivity.this
                        ,MainActivity.class);
                startActivity(intent);
            }
        });

        binding.settingsBtnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainSettingActivity.this, "language", Toast.LENGTH_SHORT).show();
            }
        });

        binding.settingsBtnPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogPassword fragment = DialogPassword.newInstance();
                fragment.show(getSupportFragmentManager() , null);
            }
        });

        binding.settingsBtnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogEmail fragment = DialogEmail.newInstance();
                fragment.show(getSupportFragmentManager() , null);
            }
        });
    }

            @Override
            public void onPositiveButtonPassword(String oldPassword, String newPassword, String returnPassword) {
                if(!oldPassword.isEmpty() && !newPassword.isEmpty() && !returnPassword.isEmpty()){
                    if(newPassword.length() >= 6){
                        Toast.makeText(this, " :: تمت عملية تغيير كلمة المرور بنجاح :: " + newPassword, Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "يجب ان تكون كلمة المرور اكثر من 6 ارقام " , Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(this, "الرجاء التأكد من تعبئة جميع الحقول " , Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onNegativeButtonPassword() {
                Toast.makeText(this, "تم الغاء عملية اعادة كلمة المرور" , Toast.LENGTH_SHORT).show();

            }

    @Override
    public void onPositiveButtonEmail(String newEmail, String oldEmail) {
        if (!newEmail.isEmpty() && !oldEmail.isEmpty()) {
            Toast.makeText(this, "New Email : " + newEmail, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "الرجاء ادخال الحقول المطلوبة"  ,Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNegativeButtonEmail() {
        Toast.makeText(this, "تم الغاء العملية", Toast.LENGTH_SHORT).show();

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