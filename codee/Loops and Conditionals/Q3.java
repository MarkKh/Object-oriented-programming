import java.util.*;
public class Q3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sum = 7;
      int x;
System.out.print("7, ");
      for(int i = 1 ; i <= num-1 ; i++){
          x = sum+(sum*i);
          
          System.out.print(x+", ");

      }
  }
}