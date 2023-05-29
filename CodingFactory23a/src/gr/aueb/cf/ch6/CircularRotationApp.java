package gr.aueb.cf.ch6;


/*
* Not working
* */
public class CircularRotationApp {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 4};

        for (int item : arr) {
            System.out.println(item + " ");
        }

        arr= doCircularRightShiftBy(arr, 1);
        arr= doCircularShiftLeftBy(arr, 1);

        for (int item : arr) {
            System.out.println(item + " ");
        }
    }


    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[((i + offset) % arr.length)] = arr[i];
        }
        return rotated;
    }

    public static int[] doCircularShiftLeftBy(int[] arr, int offset) {
        int[] rotated = new int[arr.length];

        for (int i = arr.length; i >= 0; i--) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }
}
