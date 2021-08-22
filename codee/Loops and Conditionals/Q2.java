import java.util.*;
public class Q2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
      String pl = sc.nextLine();

      if(pl.equalsIgnoreCase("Mercury")){
          System.out.println("Mercury is the 1st planet from the Sun.");
      }
      else if(pl.equalsIgnoreCase("Venus")){
          System.out.println("Venus is the 2nd planet from the Sun.");
      }
      else if(pl.equalsIgnoreCase("Earth")){
          System.out.println("Earth is the 3rd planet from the Sun.");
      }
      else if(pl.equalsIgnoreCase("Mars")){
          System.out.println("Mars is the 4th planet from the Sun.");
      }
      else if(pl.equalsIgnoreCase("Jupiter")){
          System.out.println("Jupiter is the 5th planet from the Sun.");
      }
      else if(pl.equalsIgnoreCase("Saturn")){
          System.out.println("Saturn is the 6th planet from the Sun.");
      }
      else if(pl.equalsIgnoreCase("Uranus")){
          System.out.println("Uranus is the 7th planet from the Sun.");
      }
      else{
          System.out.println("Neptune is the 8th planet from the Sun.");
      }
  }
}