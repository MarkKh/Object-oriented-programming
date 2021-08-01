public class Fraction {
    private int top;
    private int bottom;

    public Fraction(int top,int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public boolean equals(Fraction a){
        if(top==a.top && bottom==a.bottom){
            return true;
        }
        else{
            return false;
        }
    }
}