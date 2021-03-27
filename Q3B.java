//Name: Kaustav Saha
//Roll: 1929018
import java.io.FileReader;
import java.io.FileWriter;  
import java.util.*; 
public class Q3B{
    public static void main(String[] args) {
        try{    
            System.out.println("Writing into 'Student.txt'...\n"); 
            FileWriter fw=new FileWriter("Student.txt");    
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Your Roll No: ");
            int roll = Integer.parseInt(sc.nextLine());
            System.out.print("Enter Your Branch: ");
            String Branch = sc.nextLine();
            System.out.print("Enter Your University: ");
            String uni = sc.nextLine();
            sc.close();
            String temp = "Name: "+name+"\nRoll No: "+roll+"\nBranch: "+Branch+"\nUniversity: "+uni;
            fw.write(temp);    
            fw.close();       
           }
           catch(Exception e){
               System.out.println(e);
            }

        System.out.println("\nReading from 'Student.txt'...\n"); 
        try {
            FileReader fr = new FileReader("Student.txt");    
            int i;    
            while((i=fr.read())!=-1)    
                System.out.print((char)i);    
            fr.close();    
        } catch (Exception e) {
            System.out.println(e);
        }     
    }
}
