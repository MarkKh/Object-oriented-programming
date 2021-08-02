class Lab6Task0B {
	public static void main(String args[]) {
		ThinkerB.showTitle();
		ThinkerB p1 = new ThinkerB(20);
		System.out.println("I am " + p1.getAge() + " years old.");

		ThinkerB p2 = new ThinkerB(25);
		System.out.println("I am " + p2.getAge() + " years old.");

		System.out.println("Amount of Thinker = " + ThinkerB.getAmount());
	}
}