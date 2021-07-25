class Lab2Task6A{
	public static void main(String args[]){
		float y = smallest(4.5,1.2,2.4);
		System.out.println(y);
	}
// เริ่มเขียน code ของ smallest ตรงนี้	

    static float smallest(double x,double y,double z){
        if(x<y && y<z){
        return (float)x;
        }
        else if(y<z && z<x){
        return (float)y;
        }
        else{
        return (float)z;
        }
    }
}