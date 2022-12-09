public class Day1 {
    public static void main(String[] args) {
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
    
        int calorie = 0;
        int mostCalories = 0;

        for (String s : calories.split("\n")) {
            String strCal = s.trim();

            if (strCal.isBlank()) {
                if (mostCalories < calorie) {
                    mostCalories = calorie;
                }
                calorie = 0;
                continue;
            }
            calorie = Integer.parseInt(strCal);
    }
    if (mostCalories < calorie) {
        mostCalories = calorie;
    }
    System.out.println(mostCalories);
    }
}