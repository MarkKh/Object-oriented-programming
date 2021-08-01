public class Fraction {
    private int top;
    private int bottom;

    public Fraction(int top,int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public String toString(){
        return top +"/"+bottom;
    }
    public double toDouble(){
        return (double)top/bottom;
    }
    public static int gcd(int top,int bottom){
        if(bottom==0){
            return Math.abs(top);
        }
        return gcd(bottom, top%bottom);
    }
    public void simplify(){
        int c = gcd(top,bottom);
        top = top/c;
        bottom = bottom/c;
    }
}