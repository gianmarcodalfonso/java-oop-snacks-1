package org.lessons.java.snack_1;

public class Student {

  private String name;
  private String lastName;
  private int age;

  public Student(String name, String lastName, int age){
    this.name = name;
    this.lastName = lastName;
    this.age = age;
  }

  public String getData(){
    return "Lo studente è: " + this.name + " " + this.lastName + ", " + this.age + " anni.";
  }

}
