import java.io.*;  // For File class and FileNotFoundException
import java.util.Scanner;       // For the Scanner class
import javax.swing.JOptionPane; // For the JOptionPane class

/**
   This program demonstrates how a FileNotFoundException
   exception can be handled.
*/

public class OpenFile
{
   public static void main(String[] args)
   {
      File file = null;         // For file input
      Scanner inputFile = null; // For file input
      String fileName = "";   // To hold a file name
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get a file name from the user.
      System.out.println("Enter " +
                                "the name of a file:");
      fileName = keyboard.nextLine();
      keyboard.close();
      // Attempt to open the file.
      try
      {
         file = new File(fileName);
         inputFile = new Scanner(file);
         System.out.println("The file was found.");
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File "+fileName+" not found.");
      }
      finally
      {
         inputFile.close();
         System.out.println("Done.");
      }
   }
}