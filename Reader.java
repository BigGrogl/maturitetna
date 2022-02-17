import java.io.*;
//import java.util.*;


public class Reader {
    public static void main(String[] args) {
        
    }

    public static void Write(){
      try {
        File myObj = new File("C:\\Grošelj\\test.txt");
        if (myObj.createNewFile()) {
          System.out.println("File created: " + myObj.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      try {
        FileWriter myWriter = new FileWriter("C:\\Grošelj\\test.txt");
        myWriter.write("This is a test!");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }

    public static String Read(){   
      
        return null;
    }

}
