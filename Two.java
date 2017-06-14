<<<<<<< HEAD
public class Cars {
=======
class Cars {
>>>>>>> b9e71d8beb905d8340f92f7c61073205538efd17

	String color;
	
	public void setColor(String s){
		color = s;
		System.out.println(color);
	}
	
}

public class Two {
	public static void main (String[] args){
		Cars jaguar = new Cars();
		jaguar.setColor("red");
	}
}
