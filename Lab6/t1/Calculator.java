class Calculator{
    public static int sum(int[] number){
        int sum = 0;
        for(int i = 0 ; i<number.length ; i++){
            sum = sum + number[i];
        }
        return sum;
    }
}