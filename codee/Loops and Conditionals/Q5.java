import java.util.*;
public class Q5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum = 0;
     
      for(int i = num ; i >=1 ; i--){
        sum = sum + i;
        if(i == 1){
            break;
          }

          System.out.print(i+" + ");
          
      }System.out.print("1 = "+sum);
  }
}