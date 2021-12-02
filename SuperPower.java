import java.util.Scanner;

public class SuperPower {
  
  public static void main(String[] args) {
    double total = 0;
    System.out.println("Please type the #'s you want to test'");
    Scanner scan = new Scanner(System.in);
    int iterations = scan.nextInt();
    for(int k=0; k<=iterations;k++) {
      int count = 0; 
      int num = k;
      int kcount = k;
    
      while (kcount != 0) {
        kcount /= 10;
        ++count;
      }
    
      String number = String.valueOf(num);
      for(int i = 0; i < number.length(); i++) {
        int j = Character.digit(number.charAt(i), 10);
        total = total + Math.pow(j,count);
      }
    
      if (total == num) {
        System.out.println(num + " is a Superpower!");
      }
      else {
        //Spammy; not many results for superpowers so we dont need almost 500 of these messages.
        //System.out.println(num + " is not a Superpower!");
      }
      //reset vars
      count = 0;
      total = 0;
    }
  }
}