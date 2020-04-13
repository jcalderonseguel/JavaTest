package com.javaTest;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> sorted = new ArrayList<>();
        String[] split;
        String noVowels;
        System.out.println("Hi Dude!! i'm going to erase vowels from this strings' file.");

        result = Helper.readFileTxt();

        noVowels = result.get(0).replaceAll("[AEIOUaeiou]","");

        split = noVowels.split("");
        ArrayList<String> splitList = new ArrayList( Arrays.asList( split ) );//array de string a arrayList

        sorted = Helper.sortCharacters(splitList);

        Helper.writeFileTxt(sorted);
    }
}
