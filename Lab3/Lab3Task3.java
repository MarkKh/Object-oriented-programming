import java.util.Scanner;
class Lab3Task3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String num = sc.nextLine();
    String [] a = num.split(",");
    int [] marks = new int[a.length];

    for(int i = 0 ; i < a.length ;i++){
      marks[i] = Integer.parseInt(a[i]);
    }
    for(int j = 0 ; j<=marks.length-1 ;j++){
      if(marks[j]<marks[marks.length-1]){
        System.out.print(marks[j]+" ");
      }
    }
  }
}
