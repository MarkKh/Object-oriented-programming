import java.util.*;
import java.text.DecimalFormat;
public class Q1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      double m = (365.25 * n) / 224.70;
      System.out.println(new DecimalFormat("0.00").format(m));

  }
}
