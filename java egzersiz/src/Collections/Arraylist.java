package Collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

// array tutan listedir

        ArrayList country = new ArrayList();
        country.add("Turkey");
        country.add("Poland");
        country.add("Germany");
country.add(1,"Ankara");
    country.forEach(i -> System.out.println(i));

    }
}
