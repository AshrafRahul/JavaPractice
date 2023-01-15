import java.util.Scanner;

public class _3UserInput {
    public static void main(String[] args){
        //user input for String
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        //user input for integer number
        Scanner scan1 = new Scanner(System.in);
        int age = scan1.nextInt();
        
        //user input for float number
        Scanner scan2 = new Scanner(System.in);
        float weight = scan2.nextFloat();
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        

    }
}
