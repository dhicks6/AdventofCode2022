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
            //Need to split str into 2 even strings based on the length of itemsperCompartment
            //Using the java String split() method to split the string into a string array of size 2
            String[] compartments = {str.substring(0, itemsPerCompartment), str.substring(itemsPerCompartment)};
                
        }
    
    }

}
