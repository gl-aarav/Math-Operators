import java.util.Scanner;
class Q2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number, first, second;
    System.out.println("Enter a two digit number:");
    number = in.nextInt();
    first = number/10;
    System.out.println("The first digit is " + first + ".");
    second = number%10;
    System.out.println("The second digit is " + second + ".");
  } 
}