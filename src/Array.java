/**
 * Created by Александр on 17.11.2014.
 */
public class Array {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5};
        int[] y = {7, 8, 9, 10, 11, 12};
        int[] z = concat(x, y);

        for (int i = 0; i < z.length; i++) System.out.println(z[i]);
    }
    public static int[] concat(int[] x, int[] y){
        int[] sum = new int[x.length + y.length];
        for (int i = 0, j = 0; i < sum.length; i++, j++){
            if (i < x.length && j < x.length) sum[i] = x[j];
            if (j == x.length && i == x.length) j = 0;
            if (i >= x.length) sum[i] = y[j];
        }
        return sum;
    }
}