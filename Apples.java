//Written by Andrew Bailey

import java.util.Scanner;

//import sun.font.TrueTypeFont;

public class Apples {
   public static void main(String[] args) {
       //initiate variables
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      boolean notDone = true;

      //begin calculator loop
      while (notDone){

    // interface and input propmpts
      System.out.print("Enter two numbers: ");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      
      //Switch statement to handle input
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);

      //prompt to breakout or continue loop
      System.out.println("\nWould you like to perform another operation? (y/n)");
      char answer = reader.next().charAt(0);
      if (answer == 'y'){
          notDone = true;
      } 
      else {
          notDone = false;
      }

    }

   }
}