class Lab3Task12{
  public static void main(String[] args) {
    String[] friends = { "Joe", "Ray", "Sam", "Paul" };
    int[] ages = { 20, 21, 19, 21 };

    int min =0;
    int youngest = ages[0];
    for(int i=0;i < ages.length;i++){
      if(ages[i]<youngest){
        youngest = ages[i];
        min = i;
      }
    }
  System.out.println(friends[min]+" is the youngest.");
  }
}
