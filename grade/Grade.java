import java.util.Scanner;
public class Grade{
    public static String calculateGrade(int marks) {
        if(marks>=90){
            return"A";
        }else if(marks>=75) {
            return"B";
        }else if(marks >= 50) {
            return"C";
        }else{
            return"F";
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents=scanner.nextInt();
        for (int i=1;i<=numStudents;i++) {
            System.out.println("Enter marks for student"+i+":");
            int marks=scanner.nextInt();
            String grade=calculateGrade(marks);
            System.out.println("Grade for student"+i+":"+grade);
        }
        scanner.close();
    }
}
