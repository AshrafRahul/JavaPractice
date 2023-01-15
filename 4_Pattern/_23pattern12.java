public class _23pattern12{
    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=5; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}