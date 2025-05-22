package execpion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFount {
    public static void main(String[] args) {
        try {
            
            File file = new File("C:\\Users\\svikr\\OneDrive\\Desktop\\New folder\\exception.txt");
            Scanner scanner = new Scanner(file);
        } 
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught!");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
