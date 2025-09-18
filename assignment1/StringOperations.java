/* codeup assignment 1 
Owner : Yadav Adarsh Ramesh 
Date : 16/09/2025 */
import java.util.*;
public class StringOperations {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);
        System.out.print("""
        Enter the operation you want to perform
        1.Expand Characters in a String
        2.Character Frequency in a String
        3.Prime Number Checker
        4.Number to Words Convertion
        5.finding length of longest Substring Without Repeating Characters
        """);
        System.out.print("enter no between(1-5):");
        int opt=userInput.nextInt();
        String inputAsk = (opt == 1|| opt == 2|| opt == 5)? "enter the string:" : "enter the number:";
        System.out.print(inputAsk);
        userInput.nextLine();
        switch(opt){
            case 1:
               String m = userInput.nextLine();            
               System.out.println("your string is:"+ expand(m));
            break;
            case 2:
               String n = userInput.nextLine();
               System.out.print("your frequency count is:"+frequencyCount(n));
            break;
            case 3:
               String num=userInput.nextLine();
               System.out.println(checkPrime(num));
            break;
            case 4:
               int num2=userInput.nextInt();
               System.out.println(numberToWords(num2));
            break;
            case 5:
               String p=userInput.nextLine();
               System.out.println("length of longest substring:" + longestStringLenth(p));
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
    
    public static String checkPrime(String n){
        try{
            long k=Long.parseLong(n);
            long cnt=0;
            for(long i=1;i*i<=k;i++){
                if(k%i==0)cnt++;
            }
            String check = (cnt==2) ? "The given number is PRIME" : "The given number is NOT prime" ;
            return check;
        }catch (Exception e) {
            return "invalid input provided";
        }
    }
    
    public static String numberToWords(int num){
        if(num < 1 || num > 999){
            return "invalid input";
        }
        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;
        String sd[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
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
        for (int index = 0; index < 256; index++) {
            lastSeenAt[index] = -1;
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
