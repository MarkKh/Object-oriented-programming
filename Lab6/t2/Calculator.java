class Calculator{
    public static double average(int[] number){
        int sum = 0;
        for(int i = 0 ; i<number.length ; i++){
            sum = sum + number[i];
        }
        return sum/number.length;
    }
}