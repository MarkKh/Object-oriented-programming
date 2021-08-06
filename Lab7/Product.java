class Product{
    private String name;
    private double price;

    public Product(String name,double price){
      this.name = name;
      this.price = price;
    }
    public String getName(){
      return name;
    }
    public double getPrice(){
      return price;
    }
    public String toString(){
      return  name + " " + price + " bath";
    }
    public boolean equals(Product x){
      if(x.getName() == this.name && x.getPrice() == this.price){
        return true;
      }
      return false;
    }
}
