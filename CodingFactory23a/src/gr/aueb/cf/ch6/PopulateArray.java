package gr.aueb.cf.ch6;

/**
 * Δήλωση = αρχικοποίηση πίνακα και
 * populate (εισαγωγή στοιχείων)
 * */
public class PopulateArray {
    public static void main(String[] args) {


        int[] arr=new int[3];
        arr[0]=5;
        arr[1]=7;
        arr[2]=8;


        //Unsized initialization
        int[] arr2 = {1,5,8,9,12};

        //Array initializer
        int[] arr3 = new int[] {4,6,9,10};

        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        //enhanced for (δεν μας δίνει δείκτες!)
        for (int item: arr){
            System.out.println(item + " ");
        }



    }
}
