public class selection {
    class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 5, 3, 9, 1, 6};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {//outer loop
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {//inner loop

                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
                    // swap
                    int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        printArray(arr);
    }
}
 
    
}
