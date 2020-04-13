package com.javaTest;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Character.toUpperCase;

public class Helper {

    public static void ordenarArchivo() {
        try {
            Reader reader = new FileReader("C:\\Git\\Lagash\\java\\JavaTest\\file.txt");

            int data = reader.read();
            ArrayList<String> abecedario = new ArrayList<String>();
            while(data != -1){

                char dataChar = (char) data;
                data = reader.read();
                if(toUpperCase(dataChar) != 'A' && toUpperCase(dataChar) != 'E' && toUpperCase(dataChar) != 'I' && toUpperCase(dataChar) != 'O' && toUpperCase(dataChar) != 'U')
                    abecedario.add(String.valueOf(dataChar));
            }

            Collections.sort(abecedario);

            Writer writer = new FileWriter("C:\\Git\\Lagash\\java\\JavaTest\\Franco.txt");
            for(String temp: abecedario){
                writer.write(temp);
            }
            writer.flush();
            writer.close();

            System.out.println("COMO VAMOS");

        }catch (IOException e)
        {
            System.out.println(e.getClass(). getSimpleName() + " - " + e.getMessage());
        }

    }
}
