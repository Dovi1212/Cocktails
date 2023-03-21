package personal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cocktailsexp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double literTequila = 45.00;
//		double literLimeJuice = 8.00;
//		double literTriplesec = 20.00;
//		double literVodka = 36.00;
//		double dryVermouth = 18;
//		double gingerBeer = 3;
//
//		double oneOzTequila = literTequila / 33;
//		double oneOzLimeJuice = literLimeJuice / 33;
//		double oneOzTriplesec = literTriplesec / 33;
//		double oneOzVodka = literVodka / 33;
//		double oneOzDryVermouth = dryVermouth / 33;

		// Tequila Cocktails

		Map<String, String> tequilaCocktails = new HashMap<String, String>();
		tequilaCocktails.put("Margarita", "\n" + "Add 2 oz Tequila," + "\n" + "1 oz Lime Juice," + "\n"
				+ "0.5 oz Triple sec " + "\n" + "to a shaker with ice, and shake until cold.");
		tequilaCocktails.put("Mexican Mule", "\n" + "Add 2 oz Tequila," + "\n" + "0.5 oz Lime Juice," + "\n"
				+ "add to glass, and top with ginger beer");

		// Vodka Cocktails

		Map<String, String> vodkaCocktails = new HashMap<String, String>();
		vodkaCocktails.put("Vodka Martini", "\n" + "Add 2 oz Vodka," + "\n" + "1 oz Dry Vermouth," + "\n"
				+ "0.5 oz Triple sec " + "\n" + "to a shaker with ice, and shake until cold.");
		vodkaCocktails.put("Moscow Mule", "\n" + "Add 2 oz Vodka," + "\n" + "0.5 oz Lime Juice," + "\n"
				+ "add to glass, and top with ginger beer");

		// Rum Cocktails

		Map<String, String> rumCocktails = new HashMap<String, String>();
		rumCocktails.put("Vodka Martini", "\n" + "Add 2 oz Vodka," + "\n" + "1 oz Dry Vermouth," + "\n"
				+ "0.5 oz Triple sec " + "\n" + "to a shaker with ice, and shake until cold.");
		rumCocktails.put("Moscow Mule", "\n" + "Add 2 oz Vodka," + "\n" + "0.5 oz Lime Juice," + "\n"
				+ "add to glass, and top with ginger beer");

		// Whiskey Cocktails

		Map<String, String> whiskeyCocktails = new HashMap<String, String>();
		whiskeyCocktails.put("Vodka Martini", "\n" + "Add 2 oz Vodka," + "\n" + "1 oz Dry Vermouth," + "\n"
				+ "0.5 oz Triple sec " + "\n" + "to a shaker with ice, and shake until cold.");
		whiskeyCocktails.put("Moscow Mule", "\n" + "Add 2 oz Vodka," + "\n" + "0.5 oz Lime Juice," + "\n"
				+ "add to glass, and top with ginger beer");

		// Gin Cocktails

		Map<String, String> ginCocktails = new HashMap<String, String>();
		ginCocktails.put("Vodka Martini", "\n" + "Add 2 oz Vodka," + "\n" + "1 oz Dry Vermouth," + "\n"
				+ "0.5 oz Triple sec " + "\n" + "to a shaker with ice, and shake until cold.");
		ginCocktails.put("Moscow Mule", "\n" + "Add 2 oz Vodka," + "\n" + "0.5 oz Lime Juice," + "\n"
				+ "add to glass, and top with ginger beer");

		// main menu
		int selection = 0;
		Scanner sc = new Scanner(System.in);
		while (selection != 6) {

			System.out.println("What is your favorite liqour?");
			System.out.println("1) Tequila.");
			System.out.println("2) Vodka.");
			System.out.println("3) Rum.");
			System.out.println("4) Whiskey.");
			System.out.println("5) Gin.");
			System.out.println("6) Exit.");

			selection = sc.nextInt();
			
				while (selection == 1) {					
				boolean quit = cockTailselection(tequilaCocktails);
					if (quit == true) {
						selection = 0;
					}
				}
				while (selection == 2) {					
					boolean quit = cockTailselection(vodkaCocktails);
						if (quit == true) {
							selection = 0;
						}
					}
				while (selection == 3) {					
					boolean quit = cockTailselection(rumCocktails);
						if (quit == true) {
							selection = 0;
						}
					}
				while (selection == 4) {					
					boolean quit = cockTailselection(whiskeyCocktails);
						if (quit == true) {
							selection = 0;
						}
					}
				while (selection == 5) {					
					boolean quit = cockTailselection(ginCocktails);
						if (quit == true) {
							selection = 0;
						}
					}

			if (selection > 6 || selection < 0) {
				System.out.println("Pick valid option please");

			}
			if (selection == 6) {
				System.out.println("Enjoy your drink!");
			}
			
		}
	}

	public static boolean cockTailselection(Map<String, String> cocktails) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;		
		String input;
		while (!quit) {
			System.out.println("Enter the cocktail you would like to make ( or 0 to go back)");
			for (String key : cocktails.keySet()) {
				System.out.println("- " + key);
			}			
			input = sc.nextLine();
	            if (input.equals("0")) {
	                quit = true;
			} else if (cocktails.containsKey(input)) {
				System.out.println("To make a " + input + ": " + "\n" + "****************"  + cocktails.get(input) + "\r" + "****************");
			} else {
				System.out.println("Invalid key. Please try again.");
			}

		}		
		return quit;
	}
}
