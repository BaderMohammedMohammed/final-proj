package com.example.final_proj1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.final_proj1.Entity.User;
import com.example.final_proj1.databinding.ActivitySignupBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignupActivity extends AppCompatActivity {
    ActivitySignupBinding binding;
    FirebaseAuth auth;
    FirebaseFirestore firebaseFirestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        auth = FirebaseAuth.getInstance();
        firebaseFirestore = FirebaseFirestore.getInstance();


        binding.signupBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int id = Integer.parseInt(binding.signupEtId.getText().toString());
                String firstName = binding.signupEtFirstname.getText().toString();
                String lastName = binding.signupEtLastname.getText().toString();
                String email = binding.signupEtEmail.getText().toString();
                String password = binding.signupEtPass.getText().toString();
                String repassword = binding.signupEtRepass.getText().toString();
                User users = new User();
                auth.createUserWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(@NonNull AuthResult authResult) {
                        User users = new User();
                        DocumentReference documentReference = firebaseFirestore.collection("User").document(String.valueOf(id));
                        users.setId(String.valueOf(Integer.parseInt(documentReference.getId())));
                        documentReference.set(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()){
                                    startActivity(new Intent(SignupActivity.this,MainActivity.class));
                                }
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.d("aaa",e.getMessage());
                                Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });


        binding.signupTvSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this,SigninActivity.class);
                startActivity(intent);
            }
        });
    }
}