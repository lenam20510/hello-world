package chapter3;

import java.util.Scanner;;
public class AdditionQuiz {

    public static void main(String[] args) {
//        int number1 = (int)(System.currentTimeMillis() % 10);
//        int number2 = (int)(System.currentTimeMillis() * 7 % 10);
//        int number1 = (int)(Math.random() * 10);
//        int number2 = (int)(Math.random() * 10);
//        if (number1 < number2) {
//            int temp = number1;
//            number1 = number2;
//            number2 = temp;
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.print("What is " + number1 + " - " + number2 + " = ");
//        int result = input.nextInt();
//        if (result > 0) {
//            System.out.println("Your answer " + number1 + " + " + number2 + " = " +
//                    result + " : " + (number1 - number2 == result));
//        }
        
//         int year = 2005;
//         int number1 = 5, number2 = 10;
//         int max = (number1 > number2) ? number1 : number2;
//         System.out.println("max is " + ((number1 > number2) ? number1 : number2));
//         boolean isLeapYear = (year % 4 == 0);
//         if (isLeapYear) {
//             System.out.println(year + " is leap year");
//         }
//         else {
//             System.out.println(year + " is not leap year");
//         }
        
        int count = 5;
        double amount = 4.5156;
        System.out.printf("cout is %d and amount is %f", count, amount);
    }
    private void checkLeap(int year) {
      int number1 = 5, number2 = 10;
      int max = (number1 > number2) ? number1 : number2;
      System.out.println("max is " + ((number1 > number2) ? number1 : number2));
      boolean isLeapYear = (year % 4 == 0);
      if (isLeapYear) {
          System.out.println(year + " is leap year");
      }
      else {
          System.out.println(year + " is not leap year");
    }

}
