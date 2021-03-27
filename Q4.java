//Name: Kaustav Saha
//Roll: 1929018
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q4{   
    static void modifyFile(String filename, String oldString, String newString){
        
        File fileToBeModified = new File(filename);       
        String oldContent = "";        
        BufferedReader reader = null;        
        FileWriter writer = null;
         
        try{
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
             
            while (line != null){
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);             
            writer.write(newContent);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            try{   
                reader.close();     
                writer.close();
            } 
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        modifyFile("myNewFile.txt", "@", "#");
         
        System.out.println("Converted all '"+(char)64+"' symbols to '"+(char)35+"' Symbol");
    }
}
