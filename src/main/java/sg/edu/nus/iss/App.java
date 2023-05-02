package sg.edu.nus.iss;

import java.util.function.Function;

import javax.management.openmbean.SimpleType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Runnable r = () -> {
            System.out.println("Hello, world!");
        };

        Greetings g = new Greetings();
        g.run();

        //Lamda done through a class
        Runnable w = new Greetings();
        w.run();

        Function<Integer, String> intToStr = (Integer i) -> {return Integer.toString(i);};

        String strVal = intToStr.apply(400);
        r.run();

        
        Runnable a = g; 
        //Assigning class g to f
        //Function is interface
        Function<String, String> f = g;
        a.run();

    

        //Lambda expression, through single abstract method
        Runnable run = () -> {
            System.out.println("??");
        };

        Function<String, String> s = (String b) -> {
            return b.toLowerCase();
        };


    }
}
