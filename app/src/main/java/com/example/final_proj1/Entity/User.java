package com.example.final_proj1.Entity;


public class User {
    private String id;
    private String FirstName;
    private String LastName;
    private String Email;
    private String  password;
    private String image;
    private double Weight;
    private double Length;
    private String CurrentIllness;
    private double Age;
    private String FormerIllness;
    private String Gender ;
    private String smoked ;

    public User() {
    }

    public User(String id, String firstName, String lastName, String email, String password, String image, double weight, double length, String currentIllness, double age, String formerIllness, String gender, String smoked) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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

    public String getCurrentIllness() {
        return CurrentIllness;
    }

    public void setCurrentIllness(String currentIllness) {
        CurrentIllness = currentIllness;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {
        Age = age;
    }

    public String getFormerIllness() {
        return FormerIllness;
    }

    public void setFormerIllness(String formerIllness) {
        FormerIllness = formerIllness;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getSmoked() {
        return smoked;
    }

    public void setSmoked(String smoked) {
        this.smoked = smoked;
    }
}
