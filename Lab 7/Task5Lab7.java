import java.util.Scanner;

public class Task5Lab7 {
    
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }


    public static void main(String[] args) {
        System.out.println(" Enter any number to print factorial ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(" the factoial is  ");
        
            System.out.print(factorial(a));            
       
        
    }
}
