class choice{
    int id;
    private choice(int i){
        this.id=i;
    }
    public static choice create(){
        return new choice(69);
    }

}
public class privateconstructor{
    public static void main(String[] args){
        choice nope= choice.create();
    }
}