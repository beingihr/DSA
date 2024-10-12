import java.util.Scanner;

public class Task4Lab7 {
    
    public static int fibonicci(int n){
        if(n<=0){
            return 1;
        }
        else{
            int  s= fibonicci(n-1)+fibonicci(n-2);
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println(" Enter the range of Fibonnic series ");
            int a = sc.nextInt();
        for (int i = 0; i <a; i++) {
            System.out.print(" "+ fibonicci(a));
        }
    }
}
