public class Cars {

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
