package fortuneTeller;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		
		//ask user for first name, last name, age, 
		//birth month (int), favorite color, number of siblings
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		
		System.out.println("What is your favorite ROYGBIV color? If unsure type 'Help'");
		String favoriteColor = input.nextLine();
		if(favoriteColor.toLowerCase().contains("help")) {
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			favoriteColor = input.nextLine();
		}
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();
		
		System.out.println("What is the number of the month you were born in?");
		int birthMonth = input.nextInt();
		
		input.close();
		
		int retirement;
		if((age % 2)==0) {
			retirement = 25;
		}
		else {
			retirement = 20;
		}
		// Even vs Odd retirement age
		//Vacation Home Location (based on siblings)
		String vacationHome = null;
		if (siblings == 0) {
			vacationHome = ("San Fransisco, California ");	
		} if (siblings == 1) {
			vacationHome = ("Venice, Italy ");
		} if (siblings == 2) {
			vacationHome = ("Paris, Fance ");
		} if (siblings == 3) {
			vacationHome = ("Miami, Florida ");
		} if (siblings > 3) {
			vacationHome = ("Sydney, Australia ");
		} if (siblings < 0) {
			vacationHome = ("The Atacama Desert, Chile ");
		}
		
		//Next is Favorite color to Vehicle	
		
		String transportation = null; 
		if (favoriteColor.toLowerCase().contains ("red")) {
			transportation = "Rolls Royce";
		} if (favoriteColor.toLowerCase().contains ("orange")) {
			transportation = ("Harley Davidson");
		} if(favoriteColor.toLowerCase().contains ("yellow")) {
			transportation = ("yacht");
		} if (favoriteColor.toLowerCase().contains ("green")) {
			transportation = ("private jet");
		} if (favoriteColor.toLowerCase().contains ("blue")) {
			transportation = ("hoverboard");
		} if (favoriteColor.toLowerCase().contains ("indigo")) {
			transportation = ("bycicle");
		} if (favoriteColor.toLowerCase().contains ("violet")) {
			transportation = ("Secret Service escort");
		}
		
		//Next is Birth month to bank account balance
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		String bankBalance = null;
		if (birthMonth <=12) {
			bankBalance = currency.format(250180.07);
		} if (birthMonth <=8) {
			bankBalance = currency.format(3051894.56);
		} if (birthMonth <=4) {
			bankBalance = currency.format(156.42);
		} if (birthMonth <=0) {
			bankBalance = currency.format(0.00);
		} if (birthMonth >12) {
			bankBalance = currency.format(0.00);
		}
		
		//Then display the user's fortune on the format
		//*[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance] in the bank,
		//a vacation home in *[location]*, and travel by *[mode of transportation]*.
		//Program should be able to process lower and upper case letters
		
		System.out.println(firstName + " " + lastName + " will retire in " + retirement + " years with " + bankBalance + " in the bank, a vacaiton home in " + vacationHome + ", and travel by " + transportation + ".");
	}
}
