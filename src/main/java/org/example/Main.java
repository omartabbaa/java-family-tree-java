package main.java.org.example;

public class Main {
    public static void main(String[] args) {
        // Create an instance of Grandchildren
        GrandChildren grandchild = new GrandChildren("John", "Michael", "Doe", 10, "Male", "Peter", "Mary");

        // Create an instance of Children
        Child kid = new Child("Alice", 12, "Mary", "Smith", "John", "Jane", "None");

        // Create an instance of Parents
        Parents parent = new Parents("Robert", 45, "Male", "James", "Brown", "George", "Helen");

        // Example output for Grandchildren
        System.out.println("Grandchild Info:");
        System.out.println("Name: " + grandchild.getName());
        System.out.println("Middle Name: " + grandchild.getMiddleName()); // Corrected method name
        System.out.println("Last Name: " + grandchild.getlastname()); // Corrected method name
        System.out.println("Age: " + grandchild.getAge());
        System.out.println("Sex: " + grandchild.getSex());
        System.out.println("Father: " + grandchild.getFather());
        System.out.println("Mother: " + grandchild.getMother());
        System.out.println();

        // Example output for Children
        System.out.println("Child Info:");
        System.out.println("Name: " + kid.getName());
        System.out.println("Age: " + kid.getAge());
        System.out.println("Middle Name: " + kid.getMiddleName());
        System.out.println("Last Name: " + kid.getLastName());
        System.out.println("Father: " + kid.getFather());
        System.out.println("Mother: " + kid.getMother());
        System.out.println("Children: " + kid.getChildren());
        System.out.println();

        // Example output for Parents
        System.out.println("Parent Info:");
        System.out.println("Name: " + parent.getName());
        System.out.println("Age: " + parent.getAge());
        System.out.println("Sex: " + parent.getSex());
        System.out.println("Middle Name: " + parent.getMiddleName());
        System.out.println("Last Name: " + parent.getLastName());
        System.out.println("Father: " + parent.getFather());
        System.out.println("Mother: " + parent.getMother());
    }
}
