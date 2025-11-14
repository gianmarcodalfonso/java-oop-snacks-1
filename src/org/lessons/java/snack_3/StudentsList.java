package org.lessons.java.snack_3;

public class StudentsList {
  String[] students;

  public StudentsList(){
    this.students = new String[0];
  }

  public void setNewStudent(String newStudent){
    String[] updatedStudents = new String[this.students.length + 1];
    for(int i = 0; i < this.students.length; i++){
      updatedStudents[i] = this.students[i];
    }
    updatedStudents[this.students.length] = newStudent;
    this.students = updatedStudents;
  }

  public void printStudents(){
    for(int i = 0; i < this.students.length; i++){
      System.out.println(students[i].toString());
    }
  }
}
