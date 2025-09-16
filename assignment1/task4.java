// to convert a given integer into its written English form
// Owner : Yadav Adarsh Ramesh
import java.util.Scanner;
public class task4 {
    private static final String[] units = {
        "", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine"
    };

    private static final String[] teens = {
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num;
            while (true) {
                System.out.print("Enter a positive integer:");
                if (sc.hasNextInt()) {
                    num = sc.nextInt();
                    if (num >= 1 && num <= 1000) break;
                } else {
                    sc.next(); 
                }
                System.out.println("❌ Invalid input! Please enter a number between 1 and 1000.");
            }
            String words = convertToWords(num);
            System.out.println("Number in words: " + words);
        }
    }

    private static String convertToWords(int num) {
        if (num == 1000) return "one thousand";

        StringBuilder sb = new StringBuilder();
        if (num >= 100) {
            sb.append(units[num / 100]).append(" hundred");
            num %= 100;
            if (num != 0) sb.append(" ");
        }
        if (num >= 20) {
            sb.append(tens[num / 10]);
            num %= 10;
            if (num != 0) sb.append(" ");
        } else if (num >= 10) {
            sb.append(teens[num - 10]);
            num = 0;
        }
        if (num > 0) {
            sb.append(units[num]);
        }

        return sb.toString();
    }
}
