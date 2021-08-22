class Circle extends Shape{
  private int radius;
  Circle(String color,int radius){
    super(color);
    this.radius = radius;
	}
  public void setRadius(int r){
    this.radius = r;
  }
  public int getRadius(){
    return radius;
  }

  @Override
  public String toString(){
 		return "This Circle is "+getColor();
 	}
}
