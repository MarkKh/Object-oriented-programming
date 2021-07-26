public class Lab3Task4 {
  public static void main(String[] args) {
    String[] hello = {"Hello", "Jeremy"};
    System.out.println(last(hello)); // prints "Jeremy"
    String[] empty = {};
    System.out.println(last(empty)); // prints "null"
}
  // TODO: write the missing method
  private static String last(String []h){
    if(h.length == 0){
      return null;
    }
    else{
      return h[h.length-1];
    }
  }

}
