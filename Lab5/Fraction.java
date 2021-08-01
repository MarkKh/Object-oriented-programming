//Lab5Task1
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

  public static void main(String[] args)
      {
          Fraction frac = new Fraction(1,3);
          System.out.println(frac.toString());
      }

}
