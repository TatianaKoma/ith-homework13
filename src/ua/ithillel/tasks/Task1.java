package ua.ithillel.tasks;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("red");
        words.add("black");
        addFirst(words, "white");
        System.out.println(words);
    }

    private static void addFirst(LinkedList<String> words, String word) {
        words.addLast(word);
    }
}
