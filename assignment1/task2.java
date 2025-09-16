import java.util.*;
public class task2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
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
        System.out.println(rev);
        sc.close();
    }
}
