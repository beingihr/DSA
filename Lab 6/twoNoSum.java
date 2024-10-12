import java.util.Scanner;

public class twoNoSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of Arry:");
        int size=sc.nextInt();
        int arry[]=new int[size];
        System.out.print("Enter the elements of Arry:");
        for (int i1= 0; i1< arry.length; i1++) {
            arry[i1]=sc.nextInt();
        }

        //for sorting the  numbers in assendig
        for (int i= 0; i < arry.length; i++) {
            int minpos=i;
            for (int j = i+1; j < arry.length; j++) {
                if (arry[minpos]>arry[j]) {
                    minpos=j;
                }
            }
                int temp=arry[minpos];
                arry[minpos]=arry[i];
                arry[i]=temp;
            
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print("  "+arry[i]);
        }
        System.out.println(" ");
    System.out.print("searching elemnts :");
    int k=sc.nextInt();
    for (int i2 = 0; i2 < arry.length; i2++) {
       if (arry[arry.length/2]>k) {
        for (int j1 = i2+1; j1 < arry.length/2; j1++) {
            if (arry[i2]+arry[j1]==k) {
                System.out.println("yes the sum of"+arry[i2]+"+"+arry[j1]+"is = "+k);
                break;

            }
        }}
        for (int j2 =arry.length/2; j2 < arry.length-1; j2++) {
            if (arry[i2]+arry[j2+1]==k) 
             System.out.println("yes the sum of"+arry[i2]+"+"+arry[j2+1]+"is = "+k);
              break;  
                        
         }
         break;
                
       }

              
   }
        
 }
