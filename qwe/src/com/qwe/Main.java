package com.qwe;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

import static com.oracle.jrockit.jfr.DataType.UTF8;

public class Main {

    public static void main(String[] args) {

        String filename = "/Users/aleksandra/plik.txt";
        List<String> lines = Arrays.asList("slonce", "kolor", "ść" );

        try{
            Files.write(Paths.get(filename), lines, UTF8, APPEND, CREATE);
        }catch (IOException e){}
    }
}
