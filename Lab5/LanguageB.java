//Lab5Task0B
class LanguageB{
	public static void main(String[] args){
		LanguageB english = new LanguageB(21, 5);
		LanguageB arabic = new LanguageB(29, 0);
		System.out.println(english.toString());
		System.out.println(arabic.toString());
	}
	private int consonants;
	private int vowels;

	public LanguageB(int consonants, int vowels){
		 this.consonants = consonants;
		 this.vowels = vowels;
	}
	public String toString(){
		return consonants+" consonants, "+vowels+" vowels, "+(consonants+vowels)+" letters";
	}
}
