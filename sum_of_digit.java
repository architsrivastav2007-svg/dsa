import java.util.*;
public class sum_of_digit {
    public static void main(String[] args) {
        int sum=0;
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
        while(a>0){
        int b=a%10;
        sum=sum+b;
        a=a/10;
    }
        System.out.println(sum);
    }
}
