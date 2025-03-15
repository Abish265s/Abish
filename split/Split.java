import java.util.*;
public class Split {
    public static void main(String[] args) {
        String name = "hello,World";
        String[] names = name.split(","); 
        System.out.println(names[0]);
    }
}
