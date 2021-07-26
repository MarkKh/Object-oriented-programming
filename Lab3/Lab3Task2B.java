import java.util.Scanner;
class Lab3Task2B {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Marks: ");
    String input = sc.nextLine();
    String [] a = input.split(" ");
    float [] marks = new float[a.length];
    for(int i=0 ; i<a.length ; i++){
      marks[i] = Float.parseFloat(a[i]);
    }

    float average = 0f;
    for(int j=0 ; j<marks.length;j++){
      average += marks[j];
    }
    average = average/marks.length;

    System.out.println("Your average mark is: " + average);
  }
}
