package class01;

public class C03_InsertionSort {
    public static void insertionSort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for (int i=0; i < arr.length; i++){
            for(int j = i-1; j >= 0 && arr[j] > arr[j+1]; j--){
                swap(arr, i, j);
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
