class Lab2Task6B{
	public static void main(String args[]){
	    String z  = lastcharacter("programing");
		System.out.println(z);
	}
// เริ่มเขียน code ของ  lastcharacter() ตรงนี้	

    static String lastcharacter(String str){
        int a = str.length();
        char x = str.charAt(a-1);
        return ""+x;
    }
}

