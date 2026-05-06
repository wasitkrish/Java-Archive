import java.util.*;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
class StudentSystem{
    ArrayList<Student> students = new ArrayList<>();
    void addStudent(Student s){
        students.add(s);
    }
    void showStudents(){
        for(Student s : students){
            System.out.println(s.getName());
        }
    }
}