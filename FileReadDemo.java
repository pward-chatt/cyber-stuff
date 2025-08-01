import java.util.*; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

/**
   This program reads data from a file.
*/

public class FileReadDemo
{
   public static void main(String[] args) 
   {
      try
      {
	// Create a Scanner object for keyboard input.
      	Scanner keyboard = new Scanner(System.in);

      	// Get the filename.
      	System.out.print("Enter the filename: ");
      	String filename = keyboard.nextLine();
      	keyboard.close();
      	openFile (filename);
      	readFile (filename);
     }
      catch (IOException e)
      {
        System.out.println("Error reading file: "+filename);
        System.exit(60);
      }
      catch (NoSuchElementException e)
      {
        System.out.println("The file is empty! "+filename);
        System.exit(70);
      }
      catch (IllegalStateException e)
      {
        System.out.println("\nThe Scanner object was closed when we tried to use it!");
        System.exit(80);
      }
      catch (Exception e)
      {
        System.out.println("\nSomething bad happened!");
        System.exit(99);
      }
      finally
      {
        keyboard.close();
        System.out.println("DONE!");
      }
      
      public void openFile(filename) throws IOException
      { 
        // Open the file.
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
      }

      public void readFile(inputFile) throws NoSuchElementException, IllegalStateException
      {
        // Read lines from the file until no more are left.
        while (inputFile.hasNext())
        {
         // Read the next name.
         String friendName = inputFile.nextLine();
         friendNameArrayList.add(friendName);
        }
        // Close the file.
        inputFile.close();
      }
      // using a for-each loop
      /*  for (int element : ar) 
  
            System.out.print(element + " "); 
      */
        for (String friendName : friendNameArrayList)
        {
         // Display the friend names read.
         System.out.println(friendName);
        }
     }
   }