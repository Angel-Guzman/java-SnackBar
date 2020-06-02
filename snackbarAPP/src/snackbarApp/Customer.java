package snackbarApp;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}
	// Getter Methods
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getCash()
	{
		return cash;
	}
	// Setter Methods
	public void setName(String name)
	{
		this.name = name;
	}
	// Other Methods
	//

	public void buySnack(double cost)
	{
		cash -= cost; 
	}
}
