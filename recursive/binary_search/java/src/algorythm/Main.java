package algorythm;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static int binary_search(ArrayList<Integer> haystack, int needle) {
        int low = 0;
        int high = haystack.size() - 1;

        return binary_search(haystack, needle, low, high);
    }

    private static int binary_search(ArrayList<Integer> haystack, int needle, int low, int high) {
        if (high < low) {
            return -1;
        }

        int mid = (low + high)/2;

        int guess = haystack.get(mid);

        if (guess == needle) {
            return mid;
        } else if (guess > needle) {
            return binary_search(haystack, needle, low, mid - 1);
        } else {
            return binary_search(haystack, needle, low + 1, high);
        }
    }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0,2,5,6,13,23,47,53,56, 73,134,456));
        System.out.println(binary_search(input, 47));
    }
}