import java.util.Scanner;

import javax.swing.SortOrder;

public class _8switch {
    public static void main(String[] args){
        System.out.print("Enter any number: ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch(num){
            case 1: System.out.println("Dhaka");
            break;
            case 2: System.out.println("Chottogram");
            break;
            case 3: System.out.println("Rajshahi");
            break;
            case 4: System.out.println("Khulna");
            break;
            case 5: System.out.println("Sylhet");
            break;
            case 6: System.out.println("Barishal");
            break;
            case 7: System.out.println("Mymenshing");
            break;
            case 8: System.out.println("Rangpur");
            break;
            default: System.out.println("Enter a valid number");
        }
    }
}
