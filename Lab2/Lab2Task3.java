import java.util.*;
public class Lab2Task3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        do{
            a = sc.nextInt();
            sum = sum+a;
            
        }while (a != 0);
        System.out.println("sum = "+sum);
    }
}