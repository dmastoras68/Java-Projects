package gr.aueb.cf.ch6;

/**
 * Updates a value in an array
 * */
public class ReplaceApp {

    public static void main(String[] args) {
            int[] arr = {1,2,6,9,15};
            replace(arr,6,56);

            for (int item : arr) {
                System.out.println(item + " ");
            }

    }

    /**
     * Updates oldVal with newVal, if oldVal exists
     * @param arr       the given array
     * @param oldval    the value to be updated
     * @param newval    the new value
     * */
    public static void replace(int arr[], int oldval, int newval){
        int positionToUpdate = -1;
        positionToUpdate = getIndex(arr,oldval);
        if (positionToUpdate==-1) return;
        arr[positionToUpdate] = newval;
    }

    public static int getIndex(int[] arr, int value){
        if (arr == null) return -1;
        int position = -1;
        for(int i = 0; i<arr.length;i++ ) {
            if(arr[i]== value){
                position = i;
                break;
            }
        }
        return position;
    }


}
