//Lab5Task0
class Language{
	public static void main(String[] args){
		Language english = new Language(21, 5);
		Language arabic = new Language(29, 0);
		System.out.println(english.getConsonants());
		System.out.println(english.getVowels());
		System.out.println(arabic.getConsonants());
		System.out.println(arabic.getVowels());
	}
	private int consonants;
	private int vowels;

	public Language(int consonants, int vowels){
		 this.consonants = consonants;
		 this.vowels = vowels;
	}
	public int getConsonants(){
		return consonants;
	}
	public int getVowels(){
		return vowels;
	}
}
