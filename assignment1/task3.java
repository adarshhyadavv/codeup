import java.util.*;
public class task3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        prime(n);
        sc.close();
    } 
    public static void prime(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)cnt++;
        }
        if(cnt==2)System.out.println("The given number is PRIME");
        else System.out.println("The given number is NOT prime");
    }   
}
