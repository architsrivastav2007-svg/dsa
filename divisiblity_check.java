import java.util.*;
public class divisiblity_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int b=n%10;
            sum+=b;
            pro*=b;
            n=n/10;
        }
        int t=sum+pro;
        if(num%t==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");;
        }
        }
    }
