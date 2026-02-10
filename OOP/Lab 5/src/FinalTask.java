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

/**
 * The class LibraryBook represents a book with mandatory and optional attributes.
 * It contains three instance variables: bookId, title, and availability.
 *
 * A private default constructor is defined to prevent the creation of a LibraryBook
 * object without mandatory information such as bookId and title.
 * This ensures that objects cannot be instantiated using new LibraryBook()
 * from outside the class.
 *
 * Parameterized constructors are provided to enforce initialization of the
 * mandatory fields at the time of object creation, while allowing flexibility
 * for optional fields like availability.
 *
 * As a result, every LibraryBook object is created in a valid and consistent state,
 * ensuring data integrity and controlled object creation.
 */


