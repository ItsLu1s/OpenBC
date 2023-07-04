package com.company;

public class Main {
    public static void main(String[] args) {

        String[] words = {"paloma", "carro", "cantidad", "Canino"};
        String phrase = "";

        for (String word : words) {
            phrase += word + " ";
        }

        System.out.println(phrase);
    }
}
