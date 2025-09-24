import java.util.*;
public class assign1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        try{int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }catch(Exception e){
        System.out.println("invalid input,enter a interger");
    }finally{
        sc.close();
    }}
}    

