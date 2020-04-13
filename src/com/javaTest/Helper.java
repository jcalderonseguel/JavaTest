package com.javaTest;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Helper {

    public static void abrirArchivo(String archivo) {
        try {
            Reader reader = new FileReader(archivo);

            int data = reader.read();
            while(data != -1){
                char dataChar = (char) data;
                data = reader.read();
            }

        }catch (IOException e)
        {
            System.out.println(e.getClass(). getSimpleName() + " - " + e.getMessage());
        }

    }
}
