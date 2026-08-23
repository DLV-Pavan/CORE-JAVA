package set;

import java.util.*;

public class Treeset {

    public static void main(String args[]) {

        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(20);
        tset.add(10);
        tset.add(30);
        tset.add(40);
        //tset.add(null);
        tset.add(30);

        System.out.println("TreeSet: " + tset);
    }
}