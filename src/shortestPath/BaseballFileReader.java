package shortestPath;
import java.util.*;
import java.io.*;

/**
 * Reads and parses CSV file to be read by program
 * Generates ArrayList of Connection objects
 * Contains readFile() method to read filepath of specified cities and distances
 */
public class BaseballFileReader {
    ArrayList<Connection> readFile(String filePath)
    {
        ArrayList<Connection> arr = new ArrayList<Connection>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))   //opening the file
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                if(line.length() <= 1)  //Checking if the line read is not empty
                {
                    continue;
                }
                String source = "";
                String dest = "";
                String distance = "";
                int i = 0;
                for(i = 0; line.charAt(i) != ','; i++)     //Reading the source from a line until a ',' is found
                {
                    source += line.charAt(i);
                }
                i+= 2;
                for(; line.charAt(i) != ','; i++)        //Reading the Destination from a line until a ',' is found
                {
                    dest += line.charAt(i);
                }
                i+= 2;
                for(; i < line.length(); i++)
                {
                    distance += line.charAt(i);        //Reading the distance from a line until line has ended
                }
                arr.add(new Connection(source, dest, Integer.valueOf(distance)));  //Adding the Connections to an Array List
            }
        }
        catch(IOException e)
        {

        }

        return arr;
    }
}
