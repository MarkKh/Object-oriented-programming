import java.util.*;
class TaskB {

    public static void main(String[] args) {
        String[] words = inputStringArray();
        String result = longWord(words);
        System.out.println(result);
    }

    private static String[] inputStringArray() {
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] result = input.split(",");
        return result;
    }

    // TODO: Your answer here
    private static String longWord(String[]inputss)
     {
         for (String k: inputss)
         {
             if (k.length() > 6)
             {
               return k;
             }
         }
         return "";
     }
}
