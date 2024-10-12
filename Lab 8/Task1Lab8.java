public class Task1Lab8 {
   static String result ;
    public static String DecimalToBinary(int n){
        
        if( n==1){
            
            return String.valueOf(n);
        }
        else{
                  int r= n%2;
                  int a= n/2;
           
             
             return DecimalToBinary(a)+r;
        }
    }

    
    public static void main(String[] args) {
       // System.out.println(" the binary is " );
       
       System.out.println(DecimalToBinary(409));
       
    
    }
}
