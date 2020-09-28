public class Main {
    public static void main(String[] args) {
        //1
        final int seventeen = 17, arrayWidth = 20, arrayHeight = 8;

        long[] d = new long[arrayHeight];
        for(int i = 0; i < d.length; i++){
            d[i] = seventeen - i*2;
        }

        //2
        float[] x = new float[arrayWidth];
        for(int i = 0; i < x.length; i++){
            x[i] = randomInRange(-9, 7);
        }

        //3 Использую имя массива d2, потому что d уже есть
        double[][] d2 = new double[arrayHeight][arrayWidth];
        for(int i = 0; i < d2.length; i++){
            for(int j = 0; j < d2[i].length; j++){
                if(d[i] == 7){
                    d2[i][j] = function1(x[j]);
                }
                else if(d[i] >= 5){
                    d2[i][j] = function2(x[j]);
                }
                else {
                    d2[i][j] = function3(x[j]);
                }
            }
        }

        //4
        printArray(d2);
    }

    public static float randomInRange(float a, float b){
        return (float) (a + Math.random() * (b-a) );
    }

    public static double function1(double n){
        return Math.exp( Math.pow(0.25 * (Math.sin(n) + 1), 2) );
    }

    public static double function2(double n){
        return Math.asin( Math.pow( Math.pow( (n - 1) / 16 , 2) , 2) );
    }

    public static double function3(double n){
        return Math.cos( Math.pow( Math.exp(n) + 1 , Math.asin( Math.pow( (n - 1) / 16 , 2) ) - 2 ) );
    }

    public static void printArray(double[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.printf("%.2f   ", arr[i][j]);
            }
            System.out.printf("\n\n");
        }
    }
}
