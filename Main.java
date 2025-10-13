import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
     int arr[] = {1, 5, 3, 4, 1, 2};
        int n = arr.length;
 int repeating = -1;

        for (int i = 0; i < n; i++) {
          for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    repeating = arr[i];
     System.out.println("The repeating element is:"+ repeating);
                    break;
           }
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            
            
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                          minIndex = j;
                }
            }
               if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
        // find the missing element
 int missing = me(arr, n);
        System.out.println("The missing element is: " + missing);
    }

    public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int me(int arr[], int n) {
int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
 actualSum += arr[i];
        }
        return expectedSum - (actualSum - fr(arr));
    }

   
    public static int fr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
 
