import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/*
 I now need to find the top 3 elves with the most calories and print their combined total out
    I can use an arraylist to add each elves total calories
    Then sort the arraylist
    Then add up the top three and print that total out
 */

public class Day1Part2 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("inputs/inputDay1.txt"));
        int calorie = 0;
        int mostCalories = 0;
        String line;
        ArrayList<Integer> elvesCalories = new ArrayList<Integer>();
        int elf1 = 0;
        int elf2 = 0;
        int elf3 = 0;
        int threeElfTotal = 0;
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
    System.out.println(elvesCalories + "\n");
    Collections.sort(elvesCalories, Collections.reverseOrder());
    System.out.println(elvesCalories);
    elf1 = elvesCalories.get(0);
    elf2 = elvesCalories.get(1);
    elf3 = elvesCalories.get(2);
    threeElfTotal = elf1 + elf2 + elf3;
    System.out.println("The elf carrying the most calories has " + elf1 + " calories. The next elf has " + 
        elf2 + ", and the third highest calorie count is " + elf3 + ".");

    System.out.println("Combined the 3 elves carrying the most calories have " + threeElfTotal + " calories.");
    }
}
