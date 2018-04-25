/*
*
*   Works when only integers in txt file
*
* */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNumSum {
    public static void main(String[] args) {

        String fileName = "test.txt";
        String fileName1 = "test1.txt";
        String fileName2 = "test2.txt";
        String fileName3 = "test.txt";

        System.out.println("Which file would you like to read numbers from:");
        System.out.println("Options:");
        System.out.println("test.txt");
        System.out.println("test1.txt");
        System.out.println("test2.txt");
        System.out.println("");
        System.out.println("Enter one:");
        Scanner in = new Scanner(System.in);
        String textToRead = in.next();

        if (!textToRead.isEmpty()) {
            // This will reference one line at a time
            String line = null;


            if (textToRead.equals(fileName) || textToRead.equals(fileName1) || textToRead.equals(fileName2)) {
                try {
                    // FileReader reads text files in the default encoding.
                    FileReader fileReader =
                            new FileReader(textToRead);

                    // Always wrap FileReader in BufferedReader.
                    BufferedReader bufferedReader =
                            new BufferedReader(fileReader);
                    int temp = 0;
                    int linenum = 0;
                    while ((line = bufferedReader.readLine()) != null) {
                        if(!line.equals("")){
                        linenum = Integer.parseInt(line);
                        linenum = temp + linenum;
                        temp = linenum;}
                    }
                    System.out.println(linenum);
                    // Always close files.
                    bufferedReader.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            } else System.out.println("Not valid file name!");
        }else System.out.println("Must write something in");
    }
}
