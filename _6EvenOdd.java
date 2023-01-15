import java.util.Scanner;

public class _6EvenOdd {
    public static void main(String[] args){
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num%2==0){
            System.out.println("This is a even number");
        }
        else{
            System.out.println("This is a odd number");
        }
    }
}
