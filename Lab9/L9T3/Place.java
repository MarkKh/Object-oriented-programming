class Place{
    private String name;
    private String address;
    private String province;
    Place(String name,String address,String province){
      this.name = name;
      this.address = address;
      this.province = province;
    }
    public String getName(){
      return name;
    }
    public String getAddress(){
      return address;
    }
    public String getProvince(){
      return province;
    }
    public String toString(){
      return name+", "+address+", "+province;
    }
    public boolean equals(Place object){
      if(object.getName()==this.name && object.getAddress()==this.address && object.getProvince()==this.province){
        return true;
      }return false;
    }
}
