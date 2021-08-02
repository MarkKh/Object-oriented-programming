public class Lab6Task4 {
    public static void main(String[] args) {
        int [] a  = {1,2,3,4};
        double[] b = { 1.1,2.2,3.3,4.4 };
        System.out.println(Calculator.sum(a));
        System.out.println(Calculator.sum(b));
        System.out.println("sum int and double is " + Calculator.sum(a,b));

    }
}