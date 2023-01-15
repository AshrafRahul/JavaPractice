import java.util.Scanner;

public class _5ifElse {
    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        if(age>18){
            System.out.println("You are adult");
        }
        else{
            System.out.println("You are not adult");
        }
    }
}
