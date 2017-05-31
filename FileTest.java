


import java.util.*;
import java.io.*;

class FileTest {

    
    public static void main (String args[]) 
             throws FileNotFoundException, IOException {

        //open the scanner

        try {
           Scanner scanner = new Scanner(new File("Tile.info"));
           while ( scanner.hasNextLine()) {

              String tline = scanner.nextLine();
              System.out.println("Line: " + tline);
              String[] tarray = tline.split(":");
            
              Integer tpos = Integer.valueOf(tarray[0]) ;
              
           }
        } catch (FileNotFoundException e) {
             e.printStackTrace();
        }
    }

}
