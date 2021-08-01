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
}