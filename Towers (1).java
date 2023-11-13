import java.util.Scanner;
public class Towers {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many towers would you like to play with?");
    int tn = scan.nextInt();
    int t1 = 1; int t2 = 2; int t3 = 3;
    mov(tn,t1,t2,t3);

  }
  //calculates next move to run recursively
  public static void mov(int move, int t1, int t2, int t3){

    if(move == 1) {
      System.out.println("Move " + move + " to tower " + t3 +" from " + t1);
      return;
    }

    mov(move-1,t1,t3,t2);
    System.out.println("Move " + move + " to tower " + t3 + " from " + t1);
    mov(move-1,t2,t1,t3);

    return;	
  }
}
