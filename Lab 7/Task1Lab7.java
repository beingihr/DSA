class  Task1Lab7 {

    public static void printdecending (int n){
        if(n==0 ){
            System.out.print(" " +n);
        }
        else{
            System.out.print(" "+n);
            printdecending(n-1);

        }
    }
    // in ascending order
    public static void printascending (int n){
        if(n==0 ){
            System.out.print(" " +n);
        }
        else{
            
            printascending(n-1);
            System.out.print(" "+n);

        }
    }
    public static void main(String args[]){
            System.out.println(" the series in descending order is ");
            printdecending(5);
            System.out.println("\n the series in ascending order is ");
            printascending(5);
    }
}
