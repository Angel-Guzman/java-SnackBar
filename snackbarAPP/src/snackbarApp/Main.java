package snackbarApp;

public class Main
{
	private static void workWithData()
	{
		System.out.println();
		System.out.println("snackbar is open");
		System.out.println();

		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		VendingMachine m1 = new VendingMachine("food");
		VendingMachine m2 = new VendingMachine("drink");
		VendingMachine m3 = new VendingMachine("office");

		Snack s1 = new Snack("chips", 36, 1.75, m1.getId());
		Snack s2 = new Snack("chocolate", 36, 1.00, m1.getId());
		Snack s3 = new Snack("pretzel", 30, 2.00, m1.getId());

		Snack s4 = new Snack("soda", 24, 2.50, m2.getId());
		Snack s5 = new Snack("water", 20, 2.75, m2.getId());
		
		c1.buySnack(s4.getTotalCost(3));
		System.out.println("Jane's cash on hand $" + c1.getCash());
		System.out.println("Quantity of snack 4 (soda) is " + s4.getQuantity());
		System.out.println();

		c1.buySnack(s3.getTotalCost(1));
		System.out.println("Jane's cash on hand $" + c1.getCash());
		System.out.println("Quantity of snack 3 (pretzel) is " + s3.getQuantity());
		System.out.println();

		c2.buySnack(s4.getTotalCost(2));
		System.out.println("Bob's cash on hand $" + c2.getCash());
		System.out.println("Quantity of snack 4 (soda) is " + s4.getQuantity());
		System.out.println();

		c1.addCash(10);
		System.out.println("Jane's cash on hand $" + c1.getCash());
		System.out.println();

		c1.buySnack(s2.getTotalCost(1));
		System.out.println("Jane's cash on hand $" + c1.getCash());
		System.out.println("Quantity of snack 2 (chocolate) is " + s2.getQuantity());
		System.out.println();

		s3.addQuantity(12);
		System.out.println("Quantity of snack 3 (pretzel) is " + s3.getQuantity());
		System.out.println();

		c2.buySnack(s3.getTotalCost(3));
		System.out.println("Bob's cash on hand $" + c2.getCash());
		System.out.println("Quantity of snack 3 (pretzel) is " + s3.getQuantity());
		System.out.println();

	}

	public static void main(String[] args)
	{
		workWithData();
	}
}
