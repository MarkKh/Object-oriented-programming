import java.util.*;
class Lab3Task2{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a[] = new int[100];
  int i = 0;
  while(sc.hasNext()){
    int x = sc.nextInt();
    if(x==0){
      break;
    }
    a[i] = x;
    i++;
  }

  for(int j=i-1 ; j>=0 ; j--){
    System.out.println(a[j]);
  }
  }
}
