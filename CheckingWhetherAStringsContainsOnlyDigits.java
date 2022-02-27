package Brizuela;
import java.util.Scanner;

public class CheckingWhetherAStringsContainsOnlyDigits {

public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.print("Leony Brizuela:");

  String string = sc.nextLine();

  if (isDigit(string) ==true) {

    System.out.println( string + "" + "This string contains a number");
  }else 
     System.out.println( string + "" + "There is no number in this string");
}


  public static boolean isDigit(String string){
        for(int index = 0; index<string.length();index++)

        if(Character.isDigit(string.charAt(index)))

        return true ;
        return false;



        }
} 
 