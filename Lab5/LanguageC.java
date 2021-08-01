//Lab5Task0C
class LanguageC{
	public static void main(String[] args){
			LanguageC english = new LanguageC(21, 5);
			LanguageC arabic = new LanguageC(29, 0);
			System.out.println(english.hasNoVowels());
			System.out.println(arabic.hasNoVowels());
		}

	private int consonants;
	private int vowels;

	public LanguageC(int consonants, int vowels){
		 this.consonants = consonants;
		 this.vowels = vowels;
	}
	public boolean hasNoVowels(){
      if(vowels==0){
        return true;
      }
      return false;
    }
}
