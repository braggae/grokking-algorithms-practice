package algorythm;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static int max(ArrayList<Integer> list) {
        return max(list, Integer.MIN_VALUE);
    }

    private static int max(ArrayList<Integer> list, int maxNum) {
        if (list.isEmpty()) {
            return maxNum;
        }

        int current = list.get(0);
        list.remove(0);
        return max(list, Math.max(current, maxNum));
    }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,3,9,5,8));
        System.out.println(max(input));
    }
}