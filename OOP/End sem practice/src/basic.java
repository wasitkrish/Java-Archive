class Studentbasic{
    private String name;
    private int id;
    Studentbasic(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
    }
}
public class basic{
    public static void main(String[] args){
        Studentbasic s1 = new Studentbasic("Krish",72);
        Studentbasic s2 = new Studentbasic("Demo",73);
        s1.display();
        s2.display();
        String name = s1.getName();
        int id =s2.getId();
        System.out.println(name);
        System.out.println(id);
        s2.setId(13);
        System.out.println(s2.getId());
    }
}