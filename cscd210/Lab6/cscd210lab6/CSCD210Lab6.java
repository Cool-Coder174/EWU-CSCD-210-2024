package cscd210lab6;

import java.util.Scanner;
import cscd210lab6.CSCD210Lab6Methods;
// import cscd210methods.CSCD210Lab6Methods; Please include a read me file with the code, Java does not support html naively. :(
   // NOTE: Addind a ReadMe file is not a requirement for this lab, but it is a good idea to do so for future labs.  
   //The ReadMe file should be a plain text file and should contain the following information:
   // 1. Clear instructions on how to compile and run the program
   // 2. A brief description of the program
   // 3. A brief description of the methods in the program
   // 4. Any other information you feel is important for the user to know about the program
   // 5. Github offers free hosting for HTML files, so you can use that to host your HTML files and provide a link to it in your ReadMe.mb submission.


/**
 * This class contains the main method.  <br>
 * NOTE: You can't change this class or main or any code in this file. <br>
 * NOTE: The parameters must be passed as final. Failure to pass parameters as final and
 * failure to enforce pre and post conditions will result in a score of 1 point total
 */

public class CSCD210Lab6
{
   /**
    * Don't write this constructor it is given for free
    */
   public CSCD210Lab6()
   {}
   
   /**
    * The main method.  You can't change the code in this method
    * or this class in any fashion
    *
    * @param args Representing any command line arguments passed into main
    */
   public static void main(final String [] args)
   {
      int theNum, choice;
      Scanner kb = new Scanner(System.in);
      
      theNum = CSCD210Lab6Methods.readPosNum(kb);
      
      do
      {
         choice = CSCD210Lab6Methods.menu(kb);
         
         switch(choice)
         {
            case 1:  theNum = CSCD210Lab6Methods.readPosNum(kb);
                     break;
                    
            case 2:  CSCD210Lab6Methods.oddEvenZero(theNum);
                     break;  
            
            case 3:  CSCD210Lab6Methods.lightOrHeavy(theNum, kb);
                     break;
                     
            case 4:  CSCD210Lab6Methods.printE(theNum);
                     break;
                     
            case 5:  CSCD210Lab6Methods.printReverse(theNum);
                     break;
                     
            default: System.out.println("Good Bye");         
         
         }// end switch
            
      }while(choice != 6);
  
   }// end main

}// end class