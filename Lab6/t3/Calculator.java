public class Calculator {
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static double average(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }
}