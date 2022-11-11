package class01;

public class C01_SelectionSort {
    public static void selectionSort(int[] arr){
        if(arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++){
//            int minIndex = i;
            for (int j = i+1; j < arr.length; i++){
//                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }

            }
//            swap(arr, i, minIndex);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


