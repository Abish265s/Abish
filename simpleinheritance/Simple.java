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
public class Simple{
    public static void main(String[]args){
        child obj=new child();
        obj.display();
    }
}