import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
 I now need to find the top 3 elves with the most calories and print their combined total out
    I can use an arraylist to add each elves total calories
    Then sort the arraylist
    Then add up the top three and print that total out
 */

public class Day1Part2 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("inputs/day1.txt"));
        int calorie = 0;
        int mostCalories = 0;
        String line;
        ArrayList<Integer> elvesCalories = new ArrayList<Integer>();

        while ((line = br.readLine()) != null) {
            String strCal = line.trim();

            if (line.isBlank()) {
                if (mostCalories < calorie) {
                    mostCalories = calorie;
                }
                elvesCalories.add(calorie);
                calorie = 0;
                continue;
            }
            calorie += Integer.parseInt(strCal);
            
    }
    if (mostCalories < calorie) {
        mostCalories = calorie;
    }
    System.out.println(mostCalories);
    System.out.println(elvesCalories);

    }
}
