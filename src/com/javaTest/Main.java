package com.javaTest;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        doGetStringOrderAndConsonant();
    }

    public static void doGetStringOrderAndConsonant() {
        char[] buff = new char[30];
        ArrayList<Character> pivotArray = new ArrayList();
        int length;
        try (Reader reader = Helper.openReader("file.txt");
             Writer writer = Helper.openWriter("master.txt"))  {
            while((length = reader.read(buff)) >= 0) {
                for(int i=0; i < length; i++) {
                    pivotArray.add(buff[i]) ;
                    System.out.println(buff[i]);
                }

            }
            //ZTROHGIDPYSAWJKCFNLMXUBEVQ
            //[A,B,C,D,E,F,G....Z] => Helper.sortAscending(pivotArray)
            for (Character i : Helper.sortAscending(pivotArray)) {
                //[Z,T,R,O,H,G,I,D,..Q]
                if (!i.toString().equals("A") && !i.toString().equals("E") && !i.toString().equals("I") && !i.toString().equals("O") && !i.toString().equals("U")) {
                    int index =1;
                    writer.write(i.toString(), 0, index);
                    index ++;

                }
            }


        } catch(IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
