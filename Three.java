<<<<<<< HEAD
//this program includes the object, class, method, and class variable
public class Cars {
=======
//this program includes the object, class, method, and variable
class Cars {
>>>>>>> b9e71d8beb905d8340f92f7c61073205538efd17
	int age;
	String color;
	public void setAge(int a){
		age = a;
		System.out.println(age);
	}
	public void setColor(String s){
		color = s;
		System.out.println(color);
	}
	
}

public class Three
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Cars jaguar = new Cars();
		jaguar.setColor("red");
		jaguar.setAge(24);


	}
}



