package main.java.org.example;

import java.util.ArrayList;

public class GrandChildren {
    private String name;
    private String middleNaam;
    private String lastNaam;
    private int age;
    private String sex;
    private String father;
    private String mother;
    private ArrayList<String> children;
    private ArrayList<String> pets;
    private ArrayList<String> siblings;

    // Constructor with specified parameters
    public GrandChildren(String name, String middleNaam, String lastNaam, int age, String sex, String father, String mother) {
        this.name = name;
        this.middleNaam = middleNaam;
        this.lastNaam = lastNaam;
        this.age = age;
        this.sex = sex;
        this.father = father;
        this.mother = mother;

    }

    // Default constructor
    public GrandChildren() {
        this.children = new ArrayList<>();
        this.pets = new ArrayList<>();
        this.siblings = new ArrayList<>();
    }

    // Methods to add details
    public void addParents(String father, String mother) {
        this.father = father;
        this.mother = mother;
    }

    public void addChild(String child) {
        this.children.add(child);
    }

    public void addSiblings(String sibling) {
        this.siblings.add(sibling);
    }

    public void addPet(String pet) {
        this.pets.add(pet);
    }

    public void getGrandChildren() {
        System.out.println("Grandchildren: " + this.children);
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

    public String getlastname() {
        return lastNaam;
    }

    public void setLastNaam(String lastNaam) {
        this.lastNaam = lastNaam;
    }

    public String getMiddleName() {
        return middleNaam;
    }

    public void setMiddleNaam(String middleNaam) {
        this.middleNaam = middleNaam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
