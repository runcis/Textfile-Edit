import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.Scanner;

public class Puzzle
{
    public static void main(String[] args) {

        String fileName = "puzzle.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            String[] lineArr;
            while ((line = bufferedReader.readLine()) != null) {
                lineArr = line.split("");
                for (int i = 0; i < lineArr.length; i++){
                    if(i % 3 == 0 ){
                        System.out.print(lineArr[i]);
                    }
                }
            }

            // Always close files.
            bufferedReader.close();
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
