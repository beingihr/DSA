class Task1lab6 {
    public static void main(String[] args) {
        
        // Selection sort
        int arr[] = {5, 2, 3, 4, 1};
        for (int i = 0; i < arr.length; i++) {
            int minpoint = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpoint] > arr[j]) {
                    minpoint = j;
                }
            }
            int temp = arr[minpoint];
            arr[minpoint] = arr[i];
            arr[i] = temp;
        }

      
        int arr1[] = {23, 3, 4, 1, 2};
        int n = arr1.length; 
        for (int i = 0; i < n; ++i) {
            int key = arr1[i];
            int j = i - 1;

            while (j >= 0 && arr1[j] > key) {
                arr1[j + 1] = arr1[j];
                j = j - 1;
            }
            arr1[j + 1] = key;
        }

        
        System.out.println("By Selection Sort:");
        for (int i = 0; i < arr.length; i++) { 
            System.out.print(" " + arr[i]);
        }
        System.out.println(); 

        System.out.println("By Insertion Sort:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
        System.out.println(); 
    }
}
