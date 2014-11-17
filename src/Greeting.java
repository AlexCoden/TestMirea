/**
 * Created by Александр on 17.11.2014.
 */
public class Greeting {
    public static void main(String[] args) {
        String [] names = {"Иван", "Петр", "Вася" };
        String [] greetings = greet(names);

        for (int i = 0; i < greetings.length; i++) System.out.println(greetings[i]);
    }

    public static String[] greet(String[] names){
        String[] greets = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            greets[i] = "Привет, " + names[i];
        }
        return greets;
    }
}