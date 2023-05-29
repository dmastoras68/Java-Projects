package gr.aueb.cf.ch5;

public class PowerApp {
    public static void main(String[] args) {
        int x = 2;
        int y = 10;

        int res = pow(x,y);
        System.out.println(res);
    }

    public static int pow (int a, int b){
        int res = 1;

        for(int i = 1; i <= b; i++){
            res = res * a;
        }

        return res;

    }
}
