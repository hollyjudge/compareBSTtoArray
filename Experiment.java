/**
* class used to carry out the experiment phase of assignment
* author Holly Judge
* takes in file name as argument
* creates an array of the numbers in file
* determines the min, max and average
* prints them to command line
*/

import java.util.Scanner; 
import java.io.*; 

public class Experiment
{
    public static void main (String [] args) throws Exception
    {
    
        String textfile= "/home/hollyalicejudge/CSC_ASSIGN1/data/"+args[0];
        File file= new File(textfile); 
        Scanner scan= new Scanner(file);
        String numberOnly=args[0].replaceAll("[^0-9]", ""); //setting length array, file name contains subset number 
        int opResults[]= new int[Integer.parseInt(numberOnly)]; //number of find operations
        int i=0; //track Array
        int j=0; //track BST
        int insertOp; // insert results, array will have insertion==0
        
      /**
      * seperate loop for array files as they didnt contain insert counts
      * because count=0
      */
        
      if (args[0].contains("Array"))
      {
        while (scan.hasNext())    
        {    
           String tossName= scan.nextLine(); // throws away student ID and name
           opResults[i]= Integer.parseInt(scan.nextLine());
           i++; 
             
        }
      }
      
      /**
      * BST files have name, find count, insert count repeat as there layout
      */
      
      else if (args[0].contains("BST"))
      {
           while (scan.hasNext())    
           {    
           String tossName= scan.nextLine(); // throws away student ID and name
           int find= Integer.parseInt(scan.nextLine()); 
           int insert= Integer.parseInt(scan.nextLine()); 
           opResults[j]= find;
           insertOp=insert; // stores the number of ops for insert, not used though 
           j++; 
             
           }
           
      
      }
      
      int min=opResults[0];
      int max=opResults[0];
      int total=0;
      double average=0; // double in case of decimals
      
      /** 
      * loop to determine min, max, average
      */
      
      for (int k=0; k<(opResults.length); k++)
      {
        if (opResults[k]<min)
          min= opResults[k];
        if (opResults[k]>max)
          max= opResults[k];
        total=total+opResults[k];
      }
      
      average=total/opResults.length;
    
    System.out.println("Best case: " + min +"\n" + "Worst case: " + max +"\n" + "Average case: " + Double.toString(average));
  } 
}