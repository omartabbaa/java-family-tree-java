package test.java.org.example;

import main.java.org.example.Parents;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ParentsTest {

    @Test
    public void testDefaultConstructorAndGetters() {
        // Given: A new Parents object with default constructor
        Parents parents = new Parents();

        // Then: Ensure default constructor initializes lists
        assertNotNull(parents.getChildren());
        assertNotNull(parents.getPets());
        assertNotNull(parents.getSiblings());
    }

    @Test
    public void testParameterizedConstructorAndGetters() {
        // Given: Parameters for a new Parents
        String name = "John";
        String middleName = "Middle";
        String lastName = "Doe";
        int age = 40;
        String sex = "Male";
        String father = "Father";
        String mother = "Mother";


        // When: Creating a Parents with these parameters
        Parents parents = new Parents(name, age, sex, middleName, lastName, father, mother);

        // Then: Ensure the fields are initialized correctly
        assertEquals(name, parents.getName());
        assertEquals(middleName, parents.getMiddleName());
        assertEquals(lastName, parents.getLastName());
        assertEquals(age, parents.getAge());
        assertEquals(sex, parents.getSex());
        assertEquals(father, parents.getFather());
        assertEquals(mother, parents.getMother());

    }

    @Test
    public void testSetNameAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting name using setName() method
        String name = "Jane";
        parents.setName(name);

        // Then: Ensure getName() returns the correct name
        assertEquals(name, parents.getName());
    }

    @Test
    public void testSetMiddleNameAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting middle name using setMiddleName() method
        String middleName = "Middle";
        parents.setMiddleName(middleName);

        // Then: Ensure getMiddleName() returns the correct middle name
        assertEquals(middleName, parents.getMiddleName());
    }

    @Test
    public void testSetLastNameAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting last name using setLastName() method
        String lastName = "Smith";
        parents.setLastName(lastName);

        // Then: Ensure getLastName() returns the correct last name
        assertEquals(lastName, parents.getLastName());
    }

    @Test
    public void testSetAgeAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting age using setAge() method
        int age = 45;
        parents.setAge(age);

        // Then: Ensure getAge() returns the correct age
        assertEquals(age, parents.getAge());
    }

    @Test
    public void testSetSexAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting sex using setSex() method
        String sex = "Female";
        parents.setSex(sex);

        // Then: Ensure getSex() returns the correct sex
        assertEquals(sex, parents.getSex());
    }

    @Test
    public void testSetFatherAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting father using setFather() method
        String father = "Father";
        parents.setFather(father);

        // Then: Ensure getFather() returns the correct father
        assertEquals(father, parents.getFather());
    }

    @Test
    public void testSetMotherAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting mother using setMother() method
        String mother = "Mother";
        parents.setMother(mother);

        // Then: Ensure getMother() returns the correct mother
        assertEquals(mother, parents.getMother());
    }

    @Test
    public void testSetChildrenAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting children using setChildren() method
        ArrayList<String> children = new ArrayList<>();
        children.add("Child1");
        children.add("Child2");
        parents.setChildren(children);

        // Then: Ensure getChildren() returns the correct list of children
        assertEquals(children, parents.getChildren());
    }

    @Test
    public void testSetPetsAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting pets using setPets() method
        ArrayList<String> pets = new ArrayList<>();
        pets.add("Pet1");
        pets.add("Pet2");
        parents.setPets(pets);

        // Then: Ensure getPets() returns the correct list of pets
        assertEquals(pets, parents.getPets());
    }

    @Test
    public void testSetSiblingsAndGetters() {
        // Given: A new Parents object
        Parents parents = new Parents();

        // When: Setting siblings using setSiblings() method
        ArrayList<String> siblings = new ArrayList<>();
        siblings.add("Sibling1");
        siblings.add("Sibling2");
        parents.setSiblings(siblings);

        // Then: Ensure getSiblings() returns the correct list of siblings
        assertEquals(siblings, parents.getSiblings());
    }
}
