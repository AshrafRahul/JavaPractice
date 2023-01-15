import java.util.Scanner;

public class _7GreaterSmaller {
    public static void main(String[] args){
        System.out.print("Enter two numbers: ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a==b){
            System.out.println("They are equal");
        }
        else{
            if(a>b){
                System.out.println("a is greter");
            }
            else{
                System.out.println("b is greater");
            }
        }
    }
}
