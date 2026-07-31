import java.util.Scanner;

public class palindrome {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int og=num;
        int rev=0;
        while(num>0){
            int b=num%10;
            rev=rev*10+b;
            num=num/10; 
        }
        if(rev==og){
            System.out.println("palindrome");
        }
        else{
        System.out.println("not palindrome");
}
}
}
