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


/** **/