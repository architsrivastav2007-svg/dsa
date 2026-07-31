import java.util.*;
public class electricitybill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<=100){
            System.out.println("electricity bill:"+a*10);
        }
        else if(a>100 && a<200){
            System.out.println("electricity bill:"+a*15);
        }
        else if(a>200 && a<300){
            System.out.println("electricity bill:"+a*20);
        }

    }
}

