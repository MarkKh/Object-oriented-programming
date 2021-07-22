class bk{
  private String name;
  private String ct;
  private int genre;

  public bk(String name,String ct,int genre){
    this.name = name;
    this.ct = ct;
    this.genre = genre;
  }
  public String getName(){
    return name;
  }
  public String getGenreDescription(){
    if(genre==1){
      return "Pop";
    }
    else if(genre==2){
      return "Rock";
    }
    else{
      return "Hip hop";
    }
  }

  public static void main(String[] args) {
    bk a = new bk("Radiohead", "UK", 2);
    System.out.println(a.getName() + " is " + a.getGenreDescription());

  }
}
