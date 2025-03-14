import java.util.*;
public class Add{
    void Add(int a,int b){
        System.out.println("answer is"+a+b);
        }
        void Add(int a,int b,int c){
            System.out.println("answer is"+a+b+c);
        }
        public static void main(String[]args){
            Add obj=new Add();
            obj.Add(10,20);
            obj.Add(10,20,30);
    }
}