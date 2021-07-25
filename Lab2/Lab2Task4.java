public class Lab2Task4{
    public static void main(String[] args){
        String input = "This is the way it is.";
        int numOfVowels = countVowels(input);
        System.out.println("The String \"" + input +"\" has " + numOfVowels + " vowels");
    }
    
       static int countVowels(String input){
       int vowels = 0;
       for(int i = 0; i < input.length(); ++i)
       {
        char ch = input.charAt(i);
          if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u')
          {
            vowels++;
          }
       }return vowels;
    }
}