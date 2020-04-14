package com.javaTest;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        readAlphabet();
    }
    public static void readAlphabet(){
        char[] buff = new char[30];
        int length;
        int index = 1;
        ArrayList<Character> Alphabet = new ArrayList<>() ;
        try {
            Reader reader = Files.newBufferedReader(Paths.get("file.txt"));
            Writer writer = Files.newBufferedWriter(Paths.get("vicente.txt"));
            while((length = reader.read(buff)) >= 0) {
                for(int i=0; i < length; i++) {
                    Alphabet.add(buff[i]) ;
                    System.out.println(buff[i]);
                }

            }
            Collections.sort(Alphabet);
            System.out.print(Alphabet.toString());
            for (Character character : Alphabet){
                writer.write(String.valueOf(character),0,1);
            }

        }catch (IOException e){
            System.out.println(e);
        }
    }
//    public static ArrayList<Character> sortingAlphabet(ArrayList<Character> disorderedAlphabet){
//        ArrayList<Character> orderedAlphabet;
//
//        orderedAlphabet = disorderedAlphabet;
//        return orderedAlphabet;
//    }
//    public static void writingAlphabet(ArrayList<Character> orderedAlphabet){
//        //char[] buff = new char[30];
//        Writer writer = null;
//        //writer.write(i.toString(), 0, index);
//        int index = 0;
//        try {
//
//
//        }catch (IOException e){
//            System.out.println(e);
//        }
//    }
}
//for (int i = 0; i < orderedAlphabet.size(); i++)


