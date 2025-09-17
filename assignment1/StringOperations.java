/* codeup assignment 1 
Owner : Yadav Adarsh Ramesh 
Date : 16/09/2025 */
import java.util.*;
public class StringOperations {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the operation you want to perform");
        System.out.println("1.Expand Characters in a String");
        System.out.println("2.Character Frequency in a String");
        System.out.println("3.Prime Number Checker");
        System.out.println("4.Number to Words Convertion");
        System.out.println("5.finding length of longest Substring Without Repeating Characters");
        System.out.print("Enter no between(1-5):");
        int opt=userInput.nextInt();
        userInput.nextLine();
        switch(opt){
            case 1:            
               System.out.print("enter the string:");
               String s=userInput.nextLine();
               System.out.println("your string is:"+ expand(s));
            break;
            case 2:
               System.out.print("enter the string:");
               String t=userInput.nextLine();
               System.out.print("your frequency count is:"+frequencyCount(t));
            break;
            case 3:
               System.out.print("enter the number:");
               int n=userInput.nextInt();
               System.out.println(checkPrime(n));
            break;
            case 4:
               System.out.print("enter the number:");
               int m=userInput.nextInt();
               System.out.println(numberToWords(m));
            break;
            case 5:
               System.out.print("enter the string:");
               String r=userInput.nextLine();
               System.out.println("length of longest substring:" + longestStringLenth(r));
            break;   
            default:
               System.out.println("invalid input");                          
        }
        userInput.close();
    }
    public static String expand(String s){
        int n=s.length()/2;
        String rev="";
        for(int i=0;i<n;i++){
            int k=Character.getNumericValue(s.charAt(2*i+1));
            for(int j=0;j<k;j++){
                 rev=rev+(s.charAt(2*i));             
            }
        }
        return rev;
    }
    public static String frequencyCount(String s){
         String rev="";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                rev=rev + s.charAt(i) + count;
                count=1;
            }
        }
        return rev;
    }
    public static String checkPrime(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)cnt++;
        }
        if(cnt==2)return "The given number is PRIME";
        else return "The given number is NOT prime";
    }
    public static String numberToWords(int num){
           if(num < 1 || num > 999){
        return "invalid input";
    }

    int a = num % 10;          // ones
    int b = (num / 10) % 10;   // tens
    int c = num / 100;         // hundreds

    String sd[]={"","one","two","three","four","five","six","seven","eight","nine","ten",
                 "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
                 "eighteen","nineteen"};

    String ty[]={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    String result = "";

    if(c > 0){
        result += sd[c] + " hundred";
        if(b > 0 || a > 0) result += " ";
    }

    int lastTwo = num % 100;
    if(lastTwo < 20){
        result += sd[lastTwo];
    }else{
        result += ty[b];
        if(a > 0) result += " " + sd[a];
    }

    return result;
          
    }
    public static int longestStringLenth(String s){
        int[] lastSeenAt = new int[256];
        for (int idx = 0; idx < 256; idx++) {
            lastSeenAt[idx] = -1;
        }

        int maxLen = 0;
        int windowStart = -1;

        for (int currentPos = 0; currentPos < s.length(); currentPos++) {
            if (lastSeenAt[s.charAt(currentPos)] > windowStart) {
                windowStart = lastSeenAt[s.charAt(currentPos)];
            }
            lastSeenAt[s.charAt(currentPos)] = currentPos;
            maxLen = Math.max(maxLen, currentPos - windowStart);
        }
        return maxLen;  
    }      
}
