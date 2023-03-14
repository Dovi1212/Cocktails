package personal;

import java.util.Scanner;

public class drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String margarita;
String daquiri;
double literTequila = 45.00;
double literLimeJuice = 8.00;
double literTriplesec = 20.00;
double literRum = 36.00;

double oneOzTequila = literTequila / 33;
double oneOzLimeJuice = literLimeJuice / 33; 
double oneOzTriplesec = literTriplesec / 33; 
double oneOzRum = literRum / 33;
double margaritaCost;
double daquiriCost;

margarita = "Add 2 oz Tequila, 1 oz Lime Juice, 0.5 oz Triple sec to a shaker with ice, and shake until cold.";
margaritaCost = oneOzTequila * 2 + oneOzLimeJuice + oneOzTriplesec / 2;

daquiri = "Add 2 oz Rum, 1 oz Lime Juice, 0.75 oz Simple Syrup to a shaker with ice, and shake until cold.";
daquiriCost = oneOzRum * 2 + oneOzLimeJuice;

Scanner sc = new Scanner(System.in);

int selection = 0;
int selectiontc = 0;
int selectionrc = 0;

while (selection !=6) {
	
System.out.println("What is your favorite liqour?");
System.out.println("1) Tequila.");
System.out.println("2) Rum.");
System.out.println("3) Whiskey.");
System.out.println("4) Vodka.");
System.out.println("5) Gin.");
System.out.println("6) Exit.");


selection = sc.nextInt();

	while (selection == 1) {
		System.out.println("Choose a cocktail.");
		System.out.println("1)Margarita");
		System.out.println("2)Back");
		selectiontc = sc.nextInt();
		if (selectiontc == 2) {
			selection = 0;			
		}
			while (selectiontc == 1 && selectiontc != 2) {
				System.out.println(margarita);
				System.out.println("The price to make a margarita is " + margaritaCost + "$");
				System.out.println("");
				System.out.println("To go back press 2");
				selectiontc = sc.nextInt();										
				break;
			} }
		
	while (selection == 2) {
		System.out.println("Choose a cocktail.");
		System.out.println("1)Daquiri");
		System.out.println("2)Back");
		selectionrc = sc.nextInt();
		if (selectionrc == 2) {
			selection = 0;
		}
			while (selectionrc == 1 && selectionrc != 2) {
				System.out.println(daquiri);
				System.out.println("The price to make a Daquiri is " + daquiriCost + "$");
				System.out.println("");
				System.out.println("To go back press 2");
				selectionrc = sc.nextInt();
				break;
			}
	}
	}
System.out.println("Enjoy your drink!");


// switch (selection) {
//	case 1:
//		while (selectiontc !=2) {
//			System.out.println("Choose a cocktail.");
//			System.out.println("1)Margarita");
//			System.out.println("2)Exit");
//			selectiontc = sc.nextInt();
//			switch (selectiontc) {
//			case 1:
//				System.out.println(margarita);
//				System.out.println("The price to make a margarita is " + margaritaCost + "$");
//			 } }	
//	case 2:	
//			System.out.println("Choose a cocktail.");
//			System.out.println("1)Daquiri");
//			selectionrc = sc.nextInt();
//			switch (selectionrc) {
//			case 1:
//				System.out.println(daquiri);
//				System.out.println("The price to make a Daquiri is " + daquiriCost + "$");
//			}
//}
//}





}







	}


