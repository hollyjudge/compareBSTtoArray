import java.io.*; 
import java.util.Scanner;

/**
*  Author: Holly Judge
* creates an array of students
* array populated with a textfile
* method to print out all students in textfile        
* method to print out student name given studentID
*/

public class AccessArrayApp
{
     Scanner scan;      
     String[] student= new String[5000];  
     
     /**
     * counts number of operations needed by printStudent method
     */
     int opCounter;

     /**
     * populates the array by reading from the textfile
     * try catch method to handle file not found error
     */
    
    public void initializeArray()
    {
       File file=new File("/home/hollyalicejudge/CSC_ASSIGN1/data/oklist.txt");
       
       try
       {
         scan= new Scanner(file);
       }
       catch (Exception e)
       {
       }
       
       int i=0;
       
       while (scan.hasNext())
       {          
           student[i]= scan.nextLine();
           i++; 
       }       
    }
    
    /**
    * returns contents of the array
    */
    
    public void printAllStudents()
     {         
        initializeArray();       
        for (int i=0; i<5000; i++)
              System.out.println(student[i]); 
     }
     

    /**
    * returns the name of the student associated with the studentID
    * checks if the array elements contains the given ID
    * return the element that contains the ID else "access denied"
    */
    
    public void printStudent(String studentID)
    { 
        initializeArray();        
        String thisStudent="Access Denied!";
        String fullDetails=null;    
        int i;
                 
        for (i=0; i<5000; i++)
        {
          
          opCounter++;  
           if (student[i].contains(studentID))
               {
                fullDetails= student[i]; 
                thisStudent= fullDetails.substring(fullDetails.indexOf(" ") +1);
                thisStudent.trim(); 
                break;
               } 
        }
        
        System.out.println(thisStudent); 
    }

    /**
    * instantiates an AccessArrayApp object in order to call methods and vars
    * checks how many args given
    * if none then prints all students in the array
    * if one then prints student associated with the arg(studentID)
    */
    
    public static void main (String[] args)
    {
         
       AccessArrayApp arrayApp= new AccessArrayApp(); 
           
       if (args.length==0)
        arrayApp.printAllStudents();
       else if ( args.length>0)
         arrayApp.printStudent(args[0]);
       
       System.out.println(arrayApp.opCounter);      
    }
}
