class LibraryBook{
    int bookId;
    String title;
    Boolean availability;
    private LibraryBook(){}

    LibraryBook(int i,String n){
        bookId=i;
        title=n;
        availability=false;
    }
    LibraryBook(int i,String n,Boolean check){
        bookId=i;
        title=n;
        availability=check;
    }
    void display(){
        System.out.println("Book Id: "+bookId+", Book Title: "+title+", Availability: "+availability);
    }
}
public class FinalTask{
    public static void main(String[] finaltask){
        LibraryBook b1 = new LibraryBook(100,"Stephen Hawkins");
        LibraryBook b2 = new LibraryBook(101,"Java Basics for DSA",true);
        b1.display();
        b2.display();
    }
}


/** The class LibraryBook contains three instance variables: bookId, title, and availability.
 A private default constructor is defined, which prevents objects of the class from being created without providing required data.
 Since the default constructor is private, object creation using new LibraryBook() from outside the class is not allowed.
 A parameterized constructor is provided to initialize all instance variables at the time of object creation.
 This ensures that every LibraryBook object is created with a valid bookId and title. **/
