package gr.aueb.cf.ch6;


public class ReplaceWithMethod {
    public static void main(String[] args) {

    }

    public  static void upscaleByOne(int[] arr) {
        for (int i = 0; i<arr.length;i++){
            arr[i] +=1;
        }
    }

    public static void printArray(int[] arr, int low, int high) {
        if (arr == null) return;
        if (low < 0 || high > arr.length - 1) return;
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i]);
        }
    }
}

