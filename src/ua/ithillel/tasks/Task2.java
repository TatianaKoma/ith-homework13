package ua.ithillel.tasks;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("red");
        words.add("black");
        addLast(words, "rose");
        System.out.println(words);
    }

    private static void addLast(LinkedList<String> words, String word) {
        words.addFirst(word);
    }
}
