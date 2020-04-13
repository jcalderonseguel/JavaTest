package com.javaTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<Character> getArrayFile(String path) throws IOException {

        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st, output = null;
        List<Character> array = new ArrayList<Character>();
        
        while ((st = br.readLine()) != null) output = st;

        for (char element: output.toCharArray()
             ) {
            array.add(element);
        }

        return array;
    }

    public static List<Character> removeVocal(List<Character> array) {

        array.remove(Character.valueOf('A'));
        array.remove(Character.valueOf('E'));
        array.remove(Character.valueOf('I'));
        array.remove(Character.valueOf('O'));
        array.remove(Character.valueOf('U'));

        return array;
    }

    public static void writeFile(String str, String filename) throws IOException {

        FileWriter wrt = new FileWriter(filename);
        wrt.write(str);
        wrt.close();

    }

}
