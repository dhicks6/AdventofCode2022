import java.io.BufferedReader;
import java.io.FileReader;

public class Day1Part1 {
    public static void main(String[] args) throws Exception{
        String calories = """
            1000
            2000
            3000
            
            4000
            
            5000
            6000
            
            7000
            8000
            9000

            10000
                """;
    
        BufferedReader br = new BufferedReader(new FileReader("inputs/inputDay1.txt"));
        
        int calorie = 0;
        int mostCalories = 0;
        String line;

        //for (String line : calories.split("\n")) {
        while ((line = br.readLine()) != null) {
            String strCal = line.trim();

            if (strCal.isBlank()) {
                if (mostCalories < calorie) {
                    mostCalories = calorie;
                }
                calorie = 0;
                continue;
            }
            calorie += Integer.parseInt(strCal);
    }
    if (mostCalories < calorie) {
        mostCalories = calorie;
    }
    System.out.println(mostCalories);
    }
}