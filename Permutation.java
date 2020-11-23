import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Permutation {
  public static void main(String[] args){
    System.out.println("This will assemble random permutations of the numbers 1-10");

   
    //System.out.println(Arrays.toString(intArray)); 
    

    for(int d = 0; d<=9;d++){
    	 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
    	 int[] randArray = new int[10];
    for(int c = 0; c <= 9; c++) {
    int size = intArray.length;
    //System.out.println("The size of the array is " + size);

    int randomNum;
    if(size == 1) { randomNum = 0;} 
    else{
    randomNum = ThreadLocalRandom.current().nextInt(0, size);
    }
    //System.out.println(randomNum);
    randArray[c] = intArray[randomNum];
    //System.out.println("Random Array is: " + Arrays.toString(randArray));

    int[] copy = new int[intArray.length - 1];

   for (int i = 0, j = 0; i < intArray.length; i++) {
      if (i != randomNum) {
         copy[j++] = intArray[i];
       }
    }

    intArray = copy;
   
    }
    System.out.println("List " + (d+1) + ": " + Arrays.toString(randArray));
     }
  }//End of main
}//End of FirstJavaProgram Class