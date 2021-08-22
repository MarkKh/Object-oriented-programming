class Rectangle extends Shape{
  double width;
  double height;

  Rectangle(String color,double width,double height){
    super(color);
    this.width = width;
    this.height = height;
  }
  public double getWidth(){
    return width;
  }
  public double getHeight(){
    return height;
  }
  public void setWidth(double w){
    width = w;
  }
  public void setHeight(double h){
    height = h;
  }
  @Override
  public String toString(){
 		return "This Rectangle is "+getColor();
 	}
  public double getArea(){
 		return width*height;
  }
}
