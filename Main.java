import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int players, teams, leftover;
    System.out.println("Enter number of players:");
    players = in.nextInt();
    teams = players/7;
    leftover = players%7;
        System.out.println("There will be " + teams + " teams and " + leftover + " players left over.");
  }
}