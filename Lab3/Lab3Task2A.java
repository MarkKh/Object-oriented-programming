import java.util.Scanner;
  public class Lab3Task2A
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Number of assessments: ");
      int numberOfAssessments = sc.nextInt();
      float[] marks = new float[numberOfAssessments];
      for (int i = 1; i <= numberOfAssessments; i++)
      {
        System.out.print("Mark for assessment " + i + ": ");
        marks[i-1] = sc.nextFloat();
      }
      // TODO: calculate the average
      float average=0f;
      for(int j=0 ; j<numberOfAssessments ;j++){
        average = average+marks[j];
      }
      average = average / numberOfAssessments;
        System.out.println("Your average mark is: " + average);
    }
  }
