class Parent{
    public void add(){
        System.out.println("hell world");
    }
}
class Child extends Parent{
    void display(){
        add();
    } 
}
class Third extends Child{
    void helper(){
        add();
        }
}
public class Heiarchical{
    public static void main(String[]args){
        Third obj=new Third();
    obj.helper();
    Child obj1=new Child();
    obj1.display();
    }
}