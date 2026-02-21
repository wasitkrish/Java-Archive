class LibraryMember{
    private int memberId;
    private String memberName;
    private int numberOfDaysLate;
   LibraryMember(int id,String name,int days){
        memberId=id;
        memberName=name;
        numberOfDaysLate=days;
    }
    public int getDaysLate(){
        return numberOfDaysLate;
    }
    public int getMemberId(){
       return memberId;
    }
    public String getMemberName(){
       return memberName;
    }
    public double calculateFine(){
        return numberOfDaysLate;
    }
    public void displayFine(){
        System.out.println("Member ID: "+memberId);
        System.out.println("Name: "+memberName);
        System.out.println("Fine: "+calculateFine());
    }
}
class Student extends LibraryMember{
    Student(int id,String name,int days){
        super(id,name,days);
    }
    public double calculateFine(){
        if(getDaysLate()>30){
            return 5*getDaysLate()+200;
        }
        else{
            return 5*getDaysLate();
        }
    }
}
class Faculty extends LibraryMember{
    Faculty(int id,String name,int days){
        super(id,name,days);
    }
    public double calculateFine(){
        return 2*getDaysLate();
    }
}
class Guest extends LibraryMember{
    Guest(int id,String name,int days){
        super(id,name,days);
    }
    public double calculateFine(){
        if(getDaysLate()>15){
            return 10*getDaysLate()+500;
        }
        else {
            return getDaysLate()*10;
        }
    }
}
public class SmartLibraryFineManagementSystem{
    public static void main(String[] args){
        LibraryMember[] memb = new LibraryMember[3];
        memb[0]=new Student(1,"Arjun",40);
        memb[1]=new Faculty(2,"Meera",20);
        memb[2]=new Guest(3,"Rahul",20);
        for(int i=0;i<3;i++){
            memb[i].displayFine();
        }
    }
}