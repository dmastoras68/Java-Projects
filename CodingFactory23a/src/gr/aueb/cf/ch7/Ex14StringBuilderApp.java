package gr.aueb.cf.ch7;

public class Ex14StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String concatStr = "";

        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();


        for (int i = 1 ; i <= 150000; i++){
            concatStr = concatStr + i;
        }

        timeEnd = System.currentTimeMillis();

        stringElapsedTime = (timeEnd - timeStart)/1000.0;

        System.out.println(stringElapsedTime);


        timeStart = System.currentTimeMillis();

        for (int i = 1 ; i <= 150000; i++){
            sb.append(i);
        }

        timeEnd = System.currentTimeMillis();

        sbElapsedTime = (timeEnd - timeStart)/1000.0;

        System.out.println(sbElapsedTime);



    }
}
