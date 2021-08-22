class Restaurant extends Place{
    private String foodType;

    Restaurant(String name,String address,String province,String foodType){
      super(name,address,province);
      this.foodType = foodType;
    }
    public String getFoodType(){
      return foodType;
    }
}
