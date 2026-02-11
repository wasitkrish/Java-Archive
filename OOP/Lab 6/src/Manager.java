class Manager extends Employee{
    String department;
    Manager(int id, String n, String dept){
        department=dept;
        System.out.println(("Manager constructor executed"));
    }
    public static void main(String[] args){
        Manager m1 = new Manager(101,"Ravi","HR");
        Manager m2 = new Manager(102,"Rohit","IT");
    }
}

