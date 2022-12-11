import java.io.BufferedReader;
import java.io.FileReader;

public class Day2Part1 {
    public static void main(String[] args) throws Exception {
        /*
         Scores are +1 point for rock, +2 for paper, +3 for scissors, +0 for a loss, +3 for a draw, and +6 for a win
         */
        BufferedReader br = new BufferedReader(new FileReader("inputs/InputDay2.txt"));
        final int rock = 1;
        final int paper = 2;
        final int scissor = 3;
        final int draw = 3;
        final int win = 6;
        int totalScore = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String str = line.trim();
            char[] ch = str.toCharArray();
            char elfChoice = ch[0];
            char myChoice = ch[2];
  
            /*
             * Each choice that I make has a points total attached to it so needs its own if statement.
             * Each choice will win lose or draw so there needs to be logic in each choice for if I have won
             *      lost or drew.
             */
            if (myChoice == 'X') {
                System.out.println("My choice is Rock.");
                totalScore += rock;
                if (elfChoice == 'C') {
                    totalScore += win;
                }
                else if (elfChoice == 'A') {
                    totalScore += draw;
                }
            }

            if (myChoice == 'Y') {
                System.out.println("My choice is Paper.");
                totalScore += paper;
                if (elfChoice == 'A') {
                    totalScore += win;
                }
                else if (elfChoice == 'B') {
                    totalScore += draw;
                }
            }

            if (myChoice == 'Z') {
                System.out.println("My choice is Scissor.");
                totalScore += scissor;
                if (elfChoice == 'B') {
                    totalScore += win;
                }
                else if (elfChoice == 'C') {
                    totalScore += draw;
                }
            }
        }
        System.out.println("The total score is " + totalScore);
    }
}
