/**
 * Created by Александр on 17.11.2014.
 */
public class Cycles {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0 || i % 7 == 0){
                if (i % 5 == 0){
                    if (i % 7 == 0) System.out.println("ABBA");
                    else System.out.println("A");
                } else System.out.println("B");
            } else System.out.println(i);
        }
    }
}