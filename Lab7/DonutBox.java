class DonutBox{
  Donut donutArray[] = new Donut[10];
  int i;

  public void putDonut(Donut x){
    donutArray[i] = x;
    i++;
  }
  double getTotalPrice(){
    double sum = 0;
      for(int j=0;j<i;j++){
        sum+=donutArray[j].getPrice();
      }
    return sum;
  }

}
