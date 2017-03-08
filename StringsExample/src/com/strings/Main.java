package com.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        //Przyklad 1
        List<String> words = Arrays.asList("hej", "czesc", "hello");

        words.stream().forEach(s -> System.out.println("Slowo:" + s));

        words.forEach(System.out::println);



        //Przyklad 2
        List<String> modWords =
        words.stream().map(s -> s + "!").collect(Collectors.toList());

        //words.stream()for Each(s -> s.replace(x -> s + "!"));

                //Przyklad 3

        List<String> replaceWords = words.stream()
                .map(s -> s.replace("e", "stodola"))
                .collect(Collectors.toList());

        //Przyklad 4
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        upperCaseWords.forEach(System.out::println);

        //Przyklad 5

        List<String> shortWords = words.stream().filter(s -> s.length() <4)
                .collect(Collectors.toList());

        shortWords.forEach(System.out::println);

        //P. 6

        List<String> wordsWithC = words.stream()
                .sorted(Comparator.reverseOrder())//.odwrocona kolejnosc
                .filter(s -> s.contains("c"))
                .collect(Collectors.toList());
        wordsWithC.forEach(System.out::println);

        //P.7

        List<String> evenLenghtWords = words.stream()
                .filter(s -> (s.length() %2) ==0)
                        .collect(Collectors.toList());

    }
}
