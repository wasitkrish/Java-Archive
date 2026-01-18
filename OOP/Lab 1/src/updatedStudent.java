class updatedStudent{
    int id;
    String name;
    int age;

    updatedStudent(int i,String n, int a){
        id=i;
        name=n;
        age=a;
    }

    void display(){
        System.out.println("Student Id : "+id);
        System.out.println("Student name : "+name);
        System.out.println("Student age : "+age);
    }


}
class StudentDemo{
    public static void main(String[] args){
        updatedStudent s1 = new updatedStudent(25072, "Krish", 20);
        updatedStudent s2 = new updatedStudent(25068, "vastav", 19);

        s1.display();
        s2.display();
    }
}