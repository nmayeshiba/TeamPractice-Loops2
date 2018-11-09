package mayeshibaWork;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.next();
		if(name.equals("Noah")) 
		{
		System.out.println("Nice name, boyo.");	
		}
		if(name.equals("Colin"))
		{
		System.out.println( name + "? That's a lame name.");
		} else
			{
			System.out.println(name + "? Okay.");
			}
	}

}
