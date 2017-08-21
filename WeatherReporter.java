 import java.util.Scanner;

public class WeatherReporter 
{

	public static void main(String[] args) 
	{
	double c = 0;
	int f = 95;
	// Above I made the inputs for the integer in the equation and double c will stay the same at zero because that's what were looking for and int f is where the user would enter his degree in Fahrenheit.
	System.out.println("Good Morning, please enter your temprature in degrees F.");	c = 5.0/9*(f-32); 
				// Above here I made the intro message to the user and I put the equation in.
	System.out.println(c);
	// Here I told the computer to print the ans of C when running the program.
	if(c<=0)
	{
		System.out.println("Wow it is cold outside, dress warm.");
	}
	if(c>=32)
	{
		System.out.println("Don't wear black, it is super hot out.");
	// Above I gave the computer situations on certain temprature to give phrases on whether it was hot or cold outside and what to wear.
	}
	}
}
 