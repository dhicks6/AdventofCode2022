import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Day3Part2 {

    public static void main(String[] args) throws Exception{
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader("inputs/inputDay3.txt"));
        int prioritySum = 0;
        char[] priorityCharArray = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
            'r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X','Y','Z'}; 
            int count = 0;

        while ((line = br.readLine()) != null) {
            String elfOne = br.readLine();
            String elfTwo = br.readLine();
            String elfThree = br.readLine();

            System.out.println("One " + elfOne + ", two " + elfTwo + ", three " + elfThree);

        }
    }
}
