import java.util.Scanner;
class Lab3Task6{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your text : ");
    String x = sc.nextLine();

    for(int i=0; i<x.length();i++){
      char ed = x.charAt(i);
      if (ed == 'a' || ed == 'e' || ed == 'i' || ed == 'o' || ed == 'u') {
        System.out.print(ed);
      }
      else {
        System.out.print(" ");
      }
    }
    System.out.println(" ");

    for(int j=0; j<x.length();j++){
      char ed = x.charAt(j);
      if (ed == 'a' || ed == 'e' || ed == 'i' || ed == 'o' || ed == 'u') {
        System.out.print(" ");
      }
      else {
        System.out.print(ed);
      }
    }
    System.out.print(" ");
  }
}
