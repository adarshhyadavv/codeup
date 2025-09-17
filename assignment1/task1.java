// Expand Characters in a String 
// Owner : Yadav Adarsh Ramesh
import java.util.*;
public class task1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
        int n=s.length()/2;
        for(int i=0;i<n;i++){
            int k=Character.getNumericValue(s.charAt(2*i+1));
            for(int j=0;j<k;j++){
                System.out.print(s.charAt(2*i));
            }
        }
        sc.close();
    }    
}
