package cscd210utils;

import java.util.Arrays;

/**
 * The IntStatisticsUtils class performs basic statistics on integer arrays.
 * <br>
 * @NOTE You will need import the SortUtils class<br>
 * All parameters will be passed as final. <br>
 * All pre and post conditions will be enforced
 */
public class IntStatisticsUtils {
   
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
   public static double computeMean(final int[] myArray) {
      if (myArray == null) {
         throw new IllegalArgumentException("myArray cannot be null");
      }
      
      if (myArray.length < 0) {
         throw new IllegalArgumentException("myArray length cannot be less than zero");
      }
      
      int sum = 0;
      for (int num : myArray) {
         sum += num;
      }
      
      return (double) sum / myArray.length;
   }

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
   public static void printResults(final String type, final double result) {
      if (type == null) {
         throw new IllegalArgumentException("type cannot be null");
      }
      
      if (type.isEmpty()) {
         throw new IllegalArgumentException("type cannot be empty");
      }
      
      System.out.println(type + ": " + result);
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
   public static double computeMedian(final int[] myArray) {
      if (myArray == null) {
         throw new IllegalArgumentException("myArray cannot be null");
      }
      
      if (myArray.length < 0) {
         throw new IllegalArgumentException("myArray length cannot be less than zero");
      }
      
      int[] sortedArray = Arrays.copyOf(myArray, myArray.length);
      Arrays.sort(sortedArray);
      int length = sortedArray.length;
      
      if (length % 2 == 0) {
         int index1 = length / 2;
         int index2 = index1 - 1;
         return ((double) sortedArray[index1] + sortedArray[index2]) / 2;
      } else {
         int middleIndex = length / 2;
         return sortedArray[middleIndex];
      }
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
   public static double computeMidpoint(final int[] myArray) {
      if (myArray == null) {
         throw new IllegalArgumentException("myArray cannot be null");
      }
      
      if (myArray.length < 0) {
         throw new IllegalArgumentException("myArray length cannot be less than zero");
      }
      
      int[] sortedArray = Arrays.copyOf(myArray, myArray.length);
      Arrays.sort(sortedArray);
      int length = sortedArray.length;
      
      return ((double) sortedArray[0] + sortedArray[length - 1]) / 2;
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
   public static double computeStdDev(final int[] myArray) {
      if (myArray == null) {
         throw new IllegalArgumentException("myArray cannot be null");
      }
      
      if (myArray.length < 0) {
         throw new IllegalArgumentException("myArray length cannot be less than zero");
      }
      
      double mean = computeMean(myArray);
      
      double[] deviations = new double[myArray.length];
      for (int i = 0; i < myArray.length; i++) {
         deviations[i] = myArray[i] - mean;
      }
      
      double sumOfSquaredDeviations = 0;
      for (double deviation : deviations) {
         sumOfSquaredDeviations += deviation * deviation;
      }
      
      double variance = sumOfSquaredDeviations / (myArray.length - 1);
      
      return Math.sqrt(variance);
   }

}// end class