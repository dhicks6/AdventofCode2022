import java.io.BufferedReader;
import java.io.FileReader;

public class Day2Part2 {
    public static void main(String[] args) throws Exception {
        /*
         Scores are +1 point for rock, +2 for paper, +3 for scissors, +0 for a loss, +3 for a draw, and +6 for a win
         */
        BufferedReader br = new BufferedReader(new FileReader("inputs/inputDay2.txt"));
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
            char secondCOl = ch[2];
  
            /*
             * Each choice that I make has a points total attached to it so needs its own if statement.
             * Each choice will win lose or draw so there needs to be logic in each choice for if I have won
             *      lost or drew.
             * With the new information I need to lose if the second column is an X, draw if the second column is a Y,
             *      and win if the second column is a Z
             */
            if (secondCOl == 'X') {
                if (elfChoice == 'A') {
                    totalScore += scissor;
                }
                else if (elfChoice == 'B') {
                    totalScore += rock;
                }
                else {
                    totalScore += paper;
                }
            }

            if (secondCOl == 'Y') {
                    totalScore += draw;

                if (elfChoice == 'A') {
                    totalScore += rock;
                }
                else if (elfChoice == 'B') {
                    totalScore += paper;
                }
                else {
                    totalScore += scissor;
                }
            }

            if (secondCOl == 'Z') {
                totalScore += win;

                if (elfChoice == 'B') {
                    totalScore += scissor;
                }
                else if (elfChoice == 'C') {
                    totalScore += rock;
                }
                else {
                    totalScore += paper;
                }
            }
        }
        System.out.println("The total score is " + totalScore);
    }
}