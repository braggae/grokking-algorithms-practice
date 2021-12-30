package algorythm;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static int count(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        list.remove(0);
        return 1 + count(list);
    }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,56,47,5));
        System.out.println(count(input));
    }
}