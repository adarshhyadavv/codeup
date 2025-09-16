// to find the length of the longest substring without repeating characters
// Owner : Yadav Adarsh Ramesh
import java.util.*;
public class task5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string: ");
            String s = sc.nextLine();
            int length = lengthOfLongestSubstring(s);
            System.out.println("Length of longest substring without repeating characters: " + length);
        }
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0; 
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}