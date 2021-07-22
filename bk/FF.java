class FF{
    private int top;
    private int bottom;

    FF(int top,int bottom){
      this.top = top;
      this.bottom = bottom;
    }
    public String toString(){
      return top+"/"+bottom;
    }
    public double toDouble(){
      return (double)top/bottom;
    }

    public static void main(String[] args) {
      FF f = new FF(1,3);
      System.out.println(f.toString()+" = "+f.toDouble());
    }
}
