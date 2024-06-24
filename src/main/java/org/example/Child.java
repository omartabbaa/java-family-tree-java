package main.java.org.example;

import java.util.ArrayList;

public class Child {
    private String name;
    private int age;
    private String sex;
    private String middleName;
    private String lastName;
    private String father;
    private String mother;
    private ArrayList<String> children;
    private ArrayList<String> pets;
    private ArrayList<String> siblings;

    // Constructor with specified parameters
    public Child(String name, int age, String sex, String middleName, String lastName, String father, String mother) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.middleName = middleName;
        this.lastName = lastName;
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.siblings = new ArrayList<>();
    }

    // Default constructor
    public Child() {
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.siblings = new ArrayList<>();
    }

    // Getters and Setters
    public ArrayList<String> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<String> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<String> getPets() {
        return pets;
    }

    public void setPets(ArrayList<String> pets) {
        this.pets = pets;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
