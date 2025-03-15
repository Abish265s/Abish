class Parent{
void display(){
        System.out.println("hello");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("world");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.display(); 
        Parent obj2 = new Child();
        obj2.display(); 
    }
}
