import java.util.Scanner;
public class Number{
    public static void main(String[]args){
        int i=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the input");
        int j=scan.nextInt();
        while(i<=j){
            System.out.println(i);
            i++;
        }
    }
}