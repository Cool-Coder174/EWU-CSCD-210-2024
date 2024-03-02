package cscd210utils;

import cscd210sort.SortUtils;

/**
 * The IntStatisticsUtils class performs basic statistics on integer arrays.
 * <br>
 * @NOTE You will need import the SortUtils class<br>
 * All parameters will be passed as final. <br>
 * All pre and post conditions will be enforced
 */
public class IntStatisticsUtils
{
   /**
    * The computeMean method computes the mean of the array by summing the values in
    * the array and then dividing by the number of elements in the array
    * <br>
    * @NOTE Integer arithmetic happens so ensure you cast so double arithmetic happens
    * <br>
    *
    * @param myArray Representing the array of integers
    * @return double Representing the mean of the integers in the array
    *
    * @throws IllegalArgumentException if myArray is null
    * @throws IllegalArgumentException if the length of myArray is less than zero
    */
   public static double computeMean(int [] myArray)
   {
      return 0;
      
   }// end method

   /**
    * The printResults methods prints the results of the statistical calculation
    * String type is once again a literal string that will be printed to the screen
    *
    * @param type Representing a literal String to what is being printed
    * @param result Representing the result of the statistical calculation
    *
    * @throws IllegalArgumentException if type is null
    * @throws IllegalArgumentException if type is empty
    */
   public static void printResults(final String type, final double result)
   {

   }

   /**
    * The computeMedian method computes the median value of the array<br>
    * First the array is sorted by calling the SortUtils method<br>
    * <br>
    * The calculation for a median is different for an array of even length versus an array of an odd length.<br>
    * An array with an odd length:<br>
    * 1.	Find the index of the middle element of the array.<br>
    * 2.	Compute middle index with length divided by 2.<br>
    * 3.	The median would be the value at this array index.<br>
    * <br>
    * An array with an even length:<br>
    * 1.	There will be the two middle values.<br>
    * 2.	Compute index #1 with array length divided by 2.<br>
    * 3.	Compute index #2 with index #1 - 1<br>
    * 4.	Get the values stored at index #1 and index #2<br>
    * 5.	The median is the two values added together and divided by 2.<br>
    * <br>
    * NOTE: Integer arithmetic happens so ensure you cast so double arithmetic happens
    * <br>
    *
    * @param myArray Representing the array of integers
    * @return double Representing the median of the integers in the array
    *
    * @throws IllegalArgumentException if myArray is null
    * @throws IllegalArgumentException if the length of myArray is less than zero
    */
   public static double computeMedian(int [] myArray)
   {
      return 1;
   }

   /**
    * The midpoint is the mean of the smallest and largest values in your array.<br>
    * 1.	Sort your array in ascending order by calling SortUtils<br>
    * 2.	Retrieve the values from the beginning and end of the array<br>
    * 3.	The midpoint is those two values added together and divided by 2<br>
    * <br>
    * NOTE: Integer arithmetic happens so ensure you cast so double arithmetic happens
    * <br>
    *
    * @param myArray Representing the array of integers
    * @return double Representing the midpoint of the integers in the array
    *
    * @throws IllegalArgumentException if myArray is null
    * @throws IllegalArgumentException if the length of myArray is less than zero
    */
   public static double computeMidpoint(int [] myArray)
   {
      return 1;
   }
   
   /**
    * The standard deviation shows how much variation from the average exists.<br>
    * 1.	Compute the mean of the array.<br>
    * 2.	Create a new array of deviations by subtracting the mean from each member from the original array.<br>
    * 3.	Square each member of the deviations array.<br>
    * 4.	Total those squared deviations.<br>
    * 5.	Divide by one less than the original array length.<br>
    * 6.	The standard deviation is the square root of that number.<br>   
    * <br>
    * NOTE: Integer arithmetic happens so ensure you cast so double arithmetic happens
    * <br>
    *
    * @param myArray Representing the array of integers
    * @return double Representing the mean of the integers in the array
    *
    * @throws IllegalArgumentException if myArray is null
    * @throws IllegalArgumentException if the length of myArray is less than zero
    */
   public static double computeStdDev(int [] myArray)
   {
      return 1;
   }

}// end class