package com.javaTest;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Helper {

    public static ArrayList<String> readFileTxt() {
        BufferedReader reader = null;
        ArrayList<String> result = new ArrayList<>();
        try{
            reader = new BufferedReader(new FileReader("file.txt"));
            while (reader.ready()) {
                result.add(reader.readLine());
            }
            System.out.println("Content file => "+result.get(0));

        }catch( IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;

    }
    public static ArrayList<String> sortCharacters(ArrayList<String> array) {
        Collections.sort(array);
        return array;
    }
    public  static void writeFileTxt (ArrayList<String> list) {
        try{
            FileWriter writer = new FileWriter("DiegoCalzadilla.txt");
            for (String s : list) {
                writer.write(s);
            }
            writer.close();
            System.out.println("Successfully wrote to the file check out created file with your name in your directory.");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
