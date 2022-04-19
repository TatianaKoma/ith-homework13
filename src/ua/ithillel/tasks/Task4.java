package ua.ithillel.tasks;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = new LinkedList<>(Arrays.asList("world", "people", "nation", "wind", "option", "sport",
                "move","music","rain"));
        shuffle( words);
    }

    private static void shuffle(List<String> words) {
        Collections.shuffle(words);
        System.out.println(words);
    }
}
