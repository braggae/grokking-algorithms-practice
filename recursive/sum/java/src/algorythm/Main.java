package algorythm;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static int sum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int current = list.get(0);
        list.remove(0);
        return current + sum(list);
    }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(sum(input));
    }
}