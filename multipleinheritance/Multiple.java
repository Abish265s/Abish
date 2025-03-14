class Parent{
    public void add(){
        System.out.println("hell world");
    }
}
class child extends Parent{
    void display(){
        add();
    } 
}
class Third extends child{
    void helper(){
        add();
        }
}
public class Multiple{
    public static void main(String[]args){
        Third obj=new Third();
    obj.helper();
    }
}