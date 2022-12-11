import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Day3Part1 {

            /*
         * Each rucksack has 2 large compartments.
         * All items of a given type are meant to go into exactly one of the two compartments.
         * The elf that did the packing failed to follow this rule for exactly one item per rucksack.
         * 
         * 
         * THE RUCKSACKS
         * Each rucksack has an equal number of items per compartment.
         * 
         * ITEMS
         * The input shows an elfs items as a string of chars.
         *      These chars can be uppercase or lowercase.
         * Each item has a priority:
         *      Lowercase item types a through z have priorities 1 through 26.
         *      Uppercase item types A through Z have priorities 27 through 52.
         * 
         * Find the item type that appears in both compartments of each rucksack. 
         * What is the sum of the priorities of those item types?
         */

    public static void main(String[] args) throws Exception{
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader("inputs/inputDay3.txt"));
        String compartmentOne = "";
        String CompartmentTwo = "";
        int prioritySum = 0;
        char[] priorityCharArray = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
            'r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X','Y','Z'}; 
            int count = 0;
        /*
         * So I want to split each line into two seperate strings and compare those two strings to find 
         *      the char that is in both compartments.
         * Then I need to find the priority of the item and add it to a running total.
         * To find the priority I can either hardcode each char as an int and use those values to sum up my total,
         *      or I can make an array where each char is entered sequentially and once I have the item I am looking
         *      for use the index+1 because arrays start at 0 to sum up the total.
         * 
         * I think the array idea will be less lines of code, but a bit more complex
         */

        while ((line = br.readLine()) != null) {
            String str = line.trim();
            int itemsPerCompartment = str.length()/2;
            System.out.println(itemsPerCompartment);
            char matchingItem = ' ';
            //Need to split str into 2 even strings based on the length of itemsperCompartment
            String[] compartments = {str.substring(0, itemsPerCompartment), str.substring(itemsPerCompartment)};
            compartmentOne = compartments[0];
            CompartmentTwo = compartments[1];
            System.out.println("Compartment one " + compartmentOne + ", Compartment two " + CompartmentTwo);

            /*
             * Now I need to compare the two compartment strings and find the similar letter
             * With the compartments being in strings it makes finding the matching chars.
             *      I can break each string into a char array and then do comparisons.
            */

            /*
             * Currently I am getting more letters than there are lines in the input file.
             * There are 300 lines in the input file and my counter prints out 414 matching chars
             * So after adding testing print lines and shortening the input file to one line I have noticed
             *      that it prints out and adds one to count everytime it finds a match. 
             * So I need to break out of both loops after I find a match
             */

            char[] compartmentOneArray = compartmentOne.toCharArray();
            char[] compartmentTwoArray = CompartmentTwo.toCharArray();

            for (int i = 0; i < compartmentOneArray.length; i++) {
                System.out.println("Compartment one = " + compartmentOneArray[i]);
                for (int j = 0; j < compartmentTwoArray.length; j++) {
                    System.out.println("Compartnemt two = " + compartmentTwoArray[j]);
                    if (compartmentOneArray[i] == compartmentTwoArray[j]) {
                        matchingItem = compartmentOneArray[i];
                        count++;
                        System.out.println(count + "  " + matchingItem);
                        break;
                    }
                }
                if (matchingItem != ' ') {
                    break;
                }

            }


        }
    }
}
