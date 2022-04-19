package ua.ithillel.tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> words1 = new LinkedList<>(Arrays.asList("world", "people", "nation", "wind", "option", "sport"));
        List<String> words2 = new LinkedList<>(Arrays.asList("world", "girl", "man", "wind", "builder", "sport"));
        System.out.println(intersect(words1, words2));
    }

    private static List<String> intersect(List<String> words1, List<String> words2) {
        List<String> result = new LinkedList<>();
        for (String s : words1) {
            for (String value : words2) {
                if (s.equals(value)) {
                    result.add(s);
                }
            }

        }
        return result;
    }
}
