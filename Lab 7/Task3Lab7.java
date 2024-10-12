import java.util.Arrays;

public class Task3Lab7 {

    
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
       
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
      
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
     
        mergeSort(left);
        mergeSort(right);
       
        merge(array, left, right);
    }

    // quick sort 

   // Partition the array into two halves
   public static int partition(int[] array, int low, int high) {
    int pivot = array[high]; // Choose the last element as the pivot
    int i = low - 1; // Index of smaller element

    for (int j = low; j < high; j++) {
        if (array[j] < pivot) {
            i++;
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    // Swap array[i + 1] with the pivot element
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return i + 1; // Return partitioning index
}

// Recursive quicksort function
public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        int pi = partition(array, low, high);
        // Recursively sort elements before and after partition
        quickSort(array, low, pi - 1);
        quickSort(array, pi + 1, high);
    }
}


    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Sorted Array (Merge Sort): " + Arrays.toString(array));

        int[] array1 = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(array1));
        quickSort(array1, 0, array1.length - 1);
        System.out.println("Sorted Array (Quick Sort): " + Arrays.toString(array1));
    }
}
