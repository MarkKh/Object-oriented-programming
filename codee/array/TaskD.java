import java.util.*;
class TaskD{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String word[]=input.split(",");

        for(int i=0 ;i<word.length;i++){
          if(word[i].length()>6){
            System.out.println(word[i]);
          }
        }
}
}
