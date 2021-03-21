package prep;

import java.util.ArrayList;

import static prep.Arithmetic.*;

public class App {

    public static void main(String[] args) {

        System.out.println(square(2));
        System.out.println(sum(555,222));
        System.out.println(difference(500,200));
        System.out.println(product(1,2));
        ArrayList<Integer> aName = new ArrayList<Integer>();
        aName.add(7);
        aName.add(8);
        aName.add(9);
        System.out.println(average(aName));
    }


}
