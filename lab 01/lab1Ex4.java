class lab1Ex4{
    void extractBoundaries (int arr[][]){
        int i;
        for(i=0;i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i==0 || i==arr.length-1){
                    System.out.print(arr[i][j] + " ");
                }
                else if(i>0 && i<arr.length-1){
                    if(j == 0 || j == arr[i].length-1){
                        System.out.print(arr[i][j] + " ");
                    }
                    
                }
            }
            System.out.println();
        }}
    void cropCenterPart (int arr[][]){
        int i;
        for(i=0;i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i==0 || i==arr.length-1){
                    continue;
                }
                else if(i>0 && i<arr.length-1){
                    if(j == 0 || j == arr[i].length-1){
                        continue;
                    }
                    else{
                        System.out.print(arr[i][j] + " ");
                    }      
                }}
            System.out.println();
        }
    }
    public static void main(String args[]){
        lab1Ex4 lab = new lab1Ex4();
        int arr[][] = new int[5][4];
        int num = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]  = num;
                num++;
            }
        }
            
        System.out.println("Boundaries of the Array: ");
        lab.extractBoundaries(arr);
        System.out.print("\nCenter part of the Array: ");
        lab.cropCenterPart(arr); }}
