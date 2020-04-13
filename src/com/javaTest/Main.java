package com.javaTest;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

import static com.javaTest.Helper.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Character> pivotArray = new ArrayList();
        try (Reader reader = openReader("file.txt");
             Writer writer = openWriter("ManuelVera.txt"))  {
            int length ;
            while((length = reader.read()) != -1) {
                char datachar = (char) length;
                if (!Helper.isVocal(datachar)) {
                    pivotArray.add(datachar);
                    reader.read();
                }
            }

            for (Character i : sortAscending(pivotArray)) {
                writer.write(i.toString(), 0, 1);
            }


        } catch(IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

}
