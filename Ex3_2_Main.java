package croc.ex_3_2;

import java.util.Scanner;

import java.lang.*;
public class Main {


  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String moves = in.nextLine();
    String res = Moves.getMoves(moves);
    System.out.println(res);
  }
}

class Moves{
  public static String getMoves(String moves) {
    String alphabet = "abcdefgh";
    String[] arMoves = moves.split(" ");
    String res = "OK";
    for (int i=0; i < (arMoves.length-1); i++) {
      int move_alpha = (alphabet.indexOf(arMoves[i+1].charAt(0))) - (alphabet.indexOf(arMoves[i].charAt(0)));
      int move_int = arMoves[i+1].charAt(1) - arMoves[i].charAt(1);

      if (!(Math.abs(move_alpha) == 1 && Math.abs(move_int) == 2 || Math.abs(move_alpha) == 2 && Math.abs(move_int) == 1)){
        Check_chess Check = new Check_chess(arMoves[i], arMoves[i+1]);
      }
    }
    return res;
  }

}
