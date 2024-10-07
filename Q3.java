import java.util.Scanner;
class Q3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number, first, second, third, sum;
    System.out.println("Enter a three digit number:");
    number = in.nextInt();
    first = number/100;
    System.out.println("The first digit is " + first + ".");
    third = number%10;
    second = number/10;
    second = second%10;
    System.out.println("The second digit is " + second + ".");
    System.out.println("The third digit is " + third + ".");
    sum = first + second + third;
    System.out.println("The sum of the digits is " + sum + ".");
  } 
}