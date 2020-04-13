package com.javaTest;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
//
            List<Character> list = Helper.getArrayFile("file.txt");
            List<Character> list2 = Helper.removeVocal(list);
            Collections.sort(list2);
            String stringwithoutvocal = "";
            for (char element: list2
                 ) {
                System.out.print(element);
                stringwithoutvocal = stringwithoutvocal + element;
            }

            //write
            Helper.writeFile(stringwithoutvocal,"pedro.txt");

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
