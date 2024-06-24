package test.java.org.example;

import java.util.ArrayList;

import main.java.org.example.Child;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ChildTest {
    @Test
    public void getSettersSiblings() {
Child child = new Child();
//Given
ArrayList<String> siblings = child.getSiblings();
siblings.add("Jullia");
siblings.add("Mark");

// When
child.setSiblings(siblings);


// Then
assertEquals(siblings, child.getSiblings());
    }


    @Test
    public void getSettersPets() {
        Child child = new Child();
//Given
        ArrayList<String> Pets = child.getPets();
        Pets.add("Bear");
        Pets.add("Rocky");

// When
        child.setPets(Pets);


// Then
        assertEquals(Pets, child.getPets());
    }

    @Test
    public void getSettersChildren () {

        Child child = new Child();
//Given
        ArrayList<String> Children = child.getChildren();
        Children.add("Kariem");
        Children.add("Noera");

// When
        child.setChildren(Children);


// Then
        assertEquals(Children, child.getChildren());
    }



    ///

    @Test
    public void testDefaultConstructorAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // Then: Ensure default constructor initializes lists
        assertNotNull(child.getChildren());
        assertNotNull(child.getPets());
        assertNotNull(child.getSiblings());
    }


    @Test
    public void testParameterizedConstructorAndGetters() {
        // Given: Parameters for a new child
        String name = "John";
        int age = 10;
        String sex = "Male";
        String middleName = "Middle";
        String lastName = "Doe";
        String father = "Father";
        String mother = "Mother";

        // When: Creating a child with these parameters
        Child child = new Child(name, age, sex, middleName, lastName, father, mother);

        // Then: Ensure the fields are initialized correctly
        assertEquals(name, child.getName());
        assertEquals(age, child.getAge());
        assertEquals(sex, child.getSex());
        assertEquals(middleName, child.getMiddleName());
        assertEquals(lastName, child.getLastName());
        assertEquals(father, child.getFather());
        assertEquals(mother, child.getMother());
        assertNotNull(child.getChildren());
        assertNotNull(child.getPets());
        assertNotNull(child.getSiblings());
    }

    @Test
    public void testSetNameAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // When: Setting name using setName() method
        String name = "Jane";
        child.setName(name);

        // Then: Ensure getName() returns the correct name
        assertEquals(name, child.getName());
    }

    @Test
    public void testSetAgeAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // When: Setting age using setAge() method
        int age = 8;
        child.setAge(age);

        // Then: Ensure getAge() returns the correct age
        assertEquals(age, child.getAge());
    }

    @Test
    public void testSetSexAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // When: Setting sex using setSex() method
        String sex = "Female";
        child.setSex(sex);

        // Then: Ensure getSex() returns the correct sex
        assertEquals(sex, child.getSex());
    }

    @Test
    public void testSetMiddleNameAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // When: Setting middle name using setMiddleName() method
        String middleName = "Middle";
        child.setMiddleName(middleName);

        // Then: Ensure getMiddleName() returns the correct middle name
        assertEquals(middleName, child.getMiddleName());
    }


    @Test
    public void testSetLastNameAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // When: Setting last name using setLastName() method
        String lastName = "Smith";
        child.setLastName(lastName);

        // Then: Ensure getLastName() returns the correct last name
        assertEquals(lastName, child.getLastName());
    }


    @Test
    public void testSetFatherAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // When: Setting father using setFather() method
        String father = "Father";
        child.setFather(father);

        // Then: Ensure getFather() returns the correct father
        assertEquals(father, child.getFather());
    }


    @Test
    public void testSetMotherAndGetters() {
        // Given: A new child with default constructor
        Child child = new Child();

        // When: Setting mother using setMother() method
        String mother = "Mother";
        child.setMother(mother);

        // Then: Ensure getMother() returns the correct mother
        assertEquals(mother, child.getMother());
    }








}
