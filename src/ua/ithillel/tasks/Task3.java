package ua.ithillel.tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> num1 = new LinkedList<>(Arrays.asList(1, 3, 5, 7, 8, 9, 5, 7, 3));
        List<Integer> num2 = new LinkedList<>(Arrays.asList(1, 3, 3, 6, 7, 7, 0, 0, 0));
        System.out.println(join(num1, num2));
    }

    private static List<Integer> join(List<Integer> num1, List<Integer> num2) {
        num1.addAll(num2);
        return num1;
    }
}
