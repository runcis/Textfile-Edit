import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class FileCreateNInput

{
    public static void main( String[] args ) throws FileNotFoundException, UnsupportedEncodingException {
        File go = new File("../src/test.txt");

            //NAME OF FILE TO CREATE:
            String NameOfFile = "puzzle.txt";


            PrintWriter writer = new PrintWriter(NameOfFile, "UTF-8");
            Scanner in = new Scanner(System.in);
            System.out.println("You got a high score!");


            System.out.println("Enter Highscore");
            int score = in.nextInt();
            System.out.println("Enter name");
            String name = in.next();
            writer.println(name + " " + score);
        writer.close();
            System.out.println("Highscore stored in score.txt");


    }
}