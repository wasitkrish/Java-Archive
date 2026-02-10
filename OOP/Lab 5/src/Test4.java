class Book{
    int id;
    String title;
    Book(){
        id=0;
        title="Not Assigned";
    }
    Book(int i, String t) {
        id = i;
        title = t;
    }
    void display(){
        System.out.println(id+" "+title);
    }
}
public class Test4{
    public static void main(String[] test4){
        Book b1 = new Book();
        Book b2 = new Book(201,"Java Basics");
        b1.display();
        b2.display();
    }
}


/**Constructor overloading is a concept in Java where more than one constructor is defined in the same class with different parameter lists.
 This allows objects of a class to be initialized in different ways, depending on the arguments passed during object creation.
 In this program, the class Book demonstrates constructor overloading by defining two constructors:
 A default constructor with no parameters, which initializes id to 0 and title to "Not Assigned".
 A parameterized constructor that takes an integer and a string as parameters and initializes id and title with the given values.
 When the object b1 is created without passing any arguments, the default constructor is invoked.
 When the object b2 is created by passing arguments, the parameterized constructor is invoked.
 Thus, the same class uses different constructors to initialize objects in multiple ways, which is known as constructor overloading.

Here we create a class Book with two class constructors, the first constructor assigns values 0 for id and Not Assigned for title when object is created
The second constructor takes int i and String t as parameters and assigns it to id and title, Then the display method displays the id and title
 In the main function Object b1 is created with values 0 and Not Assigned because no argument is passed on object creation
The object b2 is created with values 201 and Java Basics, both the objects values are printed by calling display method.**/
