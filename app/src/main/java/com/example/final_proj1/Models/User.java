package com.example.final_proj1.Models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "UserTable")
public class User {
    @PrimaryKey
    private int id;
    @NonNull
    private String FirstName;
    @NonNull
    private String LastName;
    @NonNull
    private String Email;
    @NonNull
    private String  password;
    @NonNull
    private String image;
    @Nullable
    private double Weight;
    @Nullable
    private double Length;
    @Nullable
    private String CurrentIllness;
    @Nullable
    private double Age;
    @Nullable
    private String FormerIllness;
    @Nullable
    private String Gender ;
    @Nullable
    private String smoked ;

    public User() {
    }

    public User(int id, @NonNull String firstName, @NonNull String lastName, @NonNull String email, @NonNull String password, @NonNull String image, double weight, double length, @Nullable String currentIllness, double age, @Nullable String formerIllness, @Nullable String gender, @Nullable String smoked) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        this.password = password;
        this.image = image;
        Weight = weight;
        Length = length;
        CurrentIllness = currentIllness;
        Age = age;
        FormerIllness = formerIllness;
        Gender = gender;
        this.smoked = smoked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(@NonNull String firstName) {
        FirstName = firstName;
    }

    @NonNull
    public String getLastName() {
        return LastName;
    }

    public void setLastName(@NonNull String lastName) {
        LastName = lastName;
    }

    @NonNull
    public String getEmail() {
        return Email;
    }

    public void setEmail(@NonNull String email) {
        Email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getImage() {
        return image;
    }

    public void setImage(@NonNull String image) {
        this.image = image;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    @Nullable
    public String getCurrentIllness() {
        return CurrentIllness;
    }

    public void setCurrentIllness(@Nullable String currentIllness) {
        CurrentIllness = currentIllness;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {
        Age = age;
    }

    @Nullable
    public String getFormerIllness() {
        return FormerIllness;
    }

    public void setFormerIllness(@Nullable String formerIllness) {
        FormerIllness = formerIllness;
    }

    @Nullable
    public String getGender() {
        return Gender;
    }

    public void setGender(@Nullable String gender) {
        Gender = gender;
    }

    @Nullable
    public String getSmoked() {
        return smoked;
    }

    public void setSmoked(@Nullable String smoked) {
        this.smoked = smoked;
    }
}
