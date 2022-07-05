import java.io.*; 
import java.util.Scanner;

/**
* creates binary search tree from textfile
* populates it with student objects from student class
* method to print all nodes from tree   
* method to retrive a node and its content given a student ID
*/
     
public class AccessBSTApp
{
      Scanner scan;      
      BinarySearchTree<Students> studentBinary= new BinarySearchTree<Students> ();
      
      /**
      * uses insert method from BinarySearchTree class to populate a BST
      * string manipulation to seperate the student from the student ID
      * a student object is created and inserted into a binary tree 
      * object has a  ID and a student name 
      */
                 
      public void initializeBST()
      {
         File file=new File("/home/hollyalicejudge/CSC_ASSIGN1/data/oklist.java");
         
         try
         {
           scan= new Scanner(file);
         }
         catch (Exception e)
         { 
         }
       
       int i=0;
       String nextLine;
       String name;
       String ID;
       
       while (scan.hasNext() && i<5000)
       {
           nextLine=scan.nextLine();
           name= nextLine.substring(nextLine.indexOf(" ")+1); 
           ID= nextLine.substring(0, nextLine.indexOf(" "));    
           studentBinary.insert(new Students(ID, name));
           i++; 
      }        
     }
      
      /**
      * invokes inOrder method from binarySearchTree class that traverses tree
      * returns all values of tree
      */           
      public void printAllStudents()
      {         
        studentBinary.inOrder(); 
      }
      
     /**
     * returns student associated with student ID else "access denied"
     * invokes find method from binarySearchTree class and uses a
     * new student object with studentID as a parameter
     * returns student name only if found
     */
       
    public void printStudent(String studentID)
    { 
       String name; 
       
     if (studentBinary.find(new Students(studentID))!=null)
     {
        name=(studentBinary.find(new Students(studentID)).data.toString());
        System.out.println(name.substring(name.indexOf(" ")+1)); 
     }
     else
      System.out.println("Access Denied!"); 

   }
   
   /**
   * two counter variables are being tracked in find and insert method
   * in the BinarySearchTree class
   * these values are called and return here
   */
      
   public String returnCounter()
   {
     return  studentBinary.counterFind + "\n" +studentBinary.counterInsert;
   }
   
    /** 
    * instantiates AccessBSTApp class in order to be able to call methods
    * checks how many arguments are being passed through
    * if none prints all elements of BST
    * if one invokes printStudent method
    * prints out the value of the two counter variables
    */
    
    public static void main (String[] args)
    {             
       AccessBSTApp bstApp= new AccessBSTApp(); 
       bstApp.initializeBST();
       
       if (args.length==0)
         bstApp.printAllStudents();
       else if (args.length>0)
         bstApp.printStudent(args[0]);  
       System.out.println(bstApp.returnCounter());   
    }
}
