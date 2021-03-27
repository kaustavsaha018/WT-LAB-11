//Name: Kaustav Saha
//Roll: 1929018
public class Q1{
    public static void main(String[] args) {
        
        String myString1 = "KIIT";
        String myString2 = "DEEMED TO BE UNIVERSITY";
        
        myString1 = String.join(" ",myString1,myString2);
        System.out.println("String After Joining: "+myString1);
        
        System.out.println("Is the Stirng is Empty: "+myString1.isEmpty());
        
        myString1 = myString1.replace("DEEMED TO BE UNIVERSITY","UNIVERSITY");
        System.out.println("String After Replacing: "+myString1);
        
        String[] words=myString1.split("\\s"); //splits the string from whitespace 
        System.out.println("String After Spliting: ");
        for(String w:words){  
            System.out.println(w);  
        }        
        System.out.println("A substring of the original string is: "+myString1.substring(0,4));
    }
}
