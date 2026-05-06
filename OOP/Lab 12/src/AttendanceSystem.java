import java.util.*;
class Student2{
    String name;
    boolean present;
    Student2(String name){
        this.name=name;
        present=false;
    }
    String getName(){
        return name;
    }
    void markPresent(){
        present=true;
    }
    void markaAbsent(){
        present=false;
    }
    boolean isPresent(){
        return present;
    }
}
class AttendanceSystem{
    ArrayList<Student2> students = new ArrayList<>();
    void addStudent(Student2 s){
        students.add(s);
    }
    void showStudents(){
        for(Student2 t : students){
            System.out.println(t.getName());
        }
    }
    void markPresent(Student2 name){
        for(Student2 t : students){
            if(t.getName().equals(name)){
                t.markPresent();
            }
        }
    }
    void showPrsentStudents(){
        for(Student2 std : students){
            if(std.isPresent()){
                System.out.println(std.getName());
            }
        }
    }
}
