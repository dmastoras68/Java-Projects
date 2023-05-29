package gr.aueb.cf.ch6;

public class ArrayMinMaxApp {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,4,2,0,9,8,6};

        int minPosition = 0;
        int minValue =  Integer.MAX_VALUE; // arr[minPosition];

        int maxPosition = 0;
        int maxValue =  0 ; //arr[maxPosition];

        for (int i = 1; i< arr.length;i++){
            if(arr[i]< minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d, Min position %d %n", minValue, minPosition + 1);



        for (int i = 1; i< arr.length;i++){
            if(arr[i]> maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.printf("Max value: %d, Max position %d", maxValue, maxPosition + 1);

    }

}
