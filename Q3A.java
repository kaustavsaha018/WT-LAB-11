//Name: Kaustav Saha
//Roll: 1929018
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.util.*; 
public class Q3A{
    public static void main(String[] args) {
        try{
            System.out.println("Writing into 'Student.txt'...\n");  
            FileOutputStream fout=new FileOutputStream("Student.txt");    
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
            byte b[]=temp.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();       
           }
           catch(Exception e){
               System.out.println(e);
            }
            System.out.println("\nReading from 'Student.txt'...\n"); 
            try {
                FileInputStream fin=new FileInputStream("Student.txt");    
                int i=0;    
                while((i=fin.read())!=-1){    
                    System.out.print((char)i);    
                }    
                fin.close();       
            } 
            catch (Exception e) {
                System.out.println(e);
            }     
        }
}           

