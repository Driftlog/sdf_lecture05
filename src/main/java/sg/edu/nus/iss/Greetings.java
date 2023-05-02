package sg.edu.nus.iss;

import java.util.function.Function;

public class Greetings implements Runnable, Function<String, String>{
    
    @Override
    public void run() {
        System.out.println("Hello");
    }

    @Override
    public String apply(String original) {
        return original.toLowerCase();
    }

}
