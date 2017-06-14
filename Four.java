//this programm includes an object and a local variable
class Bikes {
	int wheelDiameter = 5;
}

public class Four 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Bikes bob = new Bikes();
		bob.wheelDiameter++;
		//wheelDiameter++;
		//Uncomment above and you will get an error because wheelDiameter is a local variable
		
	}
	
}
