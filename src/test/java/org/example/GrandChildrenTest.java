package test.java.org.example;

import main.java.org.example.GrandChildren;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GrandChildrenTest {

    @Test
    public void testDefaultConstructorAndGetters() {
        // Given: A new GrandChildren object with default constructor
        GrandChildren grandChildren = new GrandChildren();

        // Then: Ensure default constructor initializes lists
        assertNotNull(grandChildren.getChildren());
        assertNotNull(grandChildren.getPets());
        assertNotNull(grandChildren.getSiblings());
    }

    @Test
    public void testParameterizedConstructorAndGetters() {
        // Given: Parameters for a new GrandChildren
        String name = "John";
        String middleName = "Middle";
        String lastName = "Doe";
        int age = 10;
        String sex = "Male";
        String father = "Father";
        String mother = "Mother";

        // When: Creating a GrandChildren with these parameters
        GrandChildren grandChildren = new GrandChildren(name, middleName, lastName, age, sex, father, mother);

        // Then: Ensure the fields are initialized correctly
        assertEquals(name, grandChildren.getName());
        assertEquals(middleName, grandChildren.getMiddleName());
        assertEquals(lastName, grandChildren.getlastname());
        assertEquals(age, grandChildren.getAge());
        assertEquals(sex, grandChildren.getSex());
        assertEquals(father, grandChildren.getFather());
        assertEquals(mother, grandChildren.getMother());

    }

    @Test
    public void testSetNameAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting name using setName() method
        String name = "Jane";
        grandChildren.setName(name);

        // Then: Ensure getName() returns the correct name
        assertEquals(name, grandChildren.getName());
    }

    @Test
    public void testSetMiddleNaamAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting middle name using setMiddleNaam() method
        String middleName = "Middle";
        grandChildren.setMiddleNaam(middleName);

        // Then: Ensure getMiddleNaam() returns the correct middle name
        assertEquals(middleName, grandChildren.getMiddleName());
    }

    @Test
    public void testSetLastNaamAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting last name using setLastNaam() method
        String lastName = "Smith";
        grandChildren.setLastNaam(lastName);

        // Then: Ensure getLastNaam() returns the correct last name
        assertEquals(lastName, grandChildren.getlastname());
    }

    @Test
    public void testSetAgeAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting age using setAge() method
        int age = 8;
        grandChildren.setAge(age);

        // Then: Ensure getAge() returns the correct age
        assertEquals(age, grandChildren.getAge());
    }

    @Test
    public void testSetSexAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting sex using setSex() method
        String sex = "Female";
        grandChildren.setSex(sex);

        // Then: Ensure getSex() returns the correct sex
        assertEquals(sex, grandChildren.getSex());
    }

    @Test
    public void testSetFatherAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting father using setFather() method
        String father = "Father";
        grandChildren.setFather(father);

        // Then: Ensure getFather() returns the correct father
        assertEquals(father, grandChildren.getFather());
    }

    @Test
    public void testSetMotherAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting mother using setMother() method
        String mother = "Mother";
        grandChildren.setMother(mother);

        // Then: Ensure getMother() returns the correct mother
        assertEquals(mother, grandChildren.getMother());
    }

    @Test
    public void testSetChildrenAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting children using setChildren() method
        ArrayList<String> children = new ArrayList<>();
        children.add("Child1");
        children.add("Child2");
        grandChildren.setChildren(children);

        // Then: Ensure getChildren() returns the correct list of children
        assertEquals(children, grandChildren.getChildren());
    }

    @Test
    public void testSetPetsAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting pets using setPets() method
        ArrayList<String> pets = new ArrayList<>();
        pets.add("Pet1");
        pets.add("Pet2");
        grandChildren.setPets(pets);

        // Then: Ensure getPets() returns the correct list of pets
        assertEquals(pets, grandChildren.getPets());
    }

    @Test
    public void testSetSiblingsAndGetters() {
        // Given: A new GrandChildren object
        GrandChildren grandChildren = new GrandChildren();

        // When: Setting siblings using setSiblings() method
        ArrayList<String> siblings = new ArrayList<>();
        siblings.add("Sibling1");
        siblings.add("Sibling2");
        grandChildren.setSiblings(siblings);

        // Then: Ensure getSiblings() returns the correct list of siblings
        assertEquals(siblings, grandChildren.getSiblings());
    }
}

