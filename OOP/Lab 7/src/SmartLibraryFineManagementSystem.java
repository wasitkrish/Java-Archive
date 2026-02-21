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
        return 0;
    }
}
class Faculty extends LibraryMember{
    Faculty(int id,String name,int days){
        super(id,name,days);
    }
    public double calculateFine(){
        return 0;
    }
}
class Guest extends LibraryMember{
    Guest(int id,String name,int days){
        super(id,name,days);
    }
    public double calculateFine(){
        return 0;
    }
}