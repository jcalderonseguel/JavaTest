package com.javaTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Helper {

    public static void getFile() throws FileNotFoundException, IOException {
        ArrayList<Character> list=new ArrayList<Character>();
        Reader reader = new FileReader("C:\\Users\\Usuario\\Desktop\\JavaMeli\\JavaTest\\file.txt");
        int data = reader.read();
        while (data != -1) {
            char dataChar = (char) data;
            data = reader.read();
            if(dataChar != 'A' && dataChar != 'E' && dataChar != 'I' && dataChar != 'O' && dataChar != 'U') {
                list.add(dataChar);
            }
        }
        Collections.sort(list);

        FileWriter fw= new FileWriter("C:\\Users\\Usuario\\Desktop\\JavaMeli\\JavaTest\\erick.txt");
        fw.write(String.valueOf(list));
        fw.close();
    }

}
