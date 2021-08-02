class ThinkerB {
    private int age;
    private static int amount;

    public ThinkerB(int age) {
        this.age = age;
        amount++;
    }

    public int getAge() {
        return age;
    }

    public static void showTitle() {
        System.out.println("We are the Thinker!");
    }

    public static int getAmount() {
        return amount;
    }
}