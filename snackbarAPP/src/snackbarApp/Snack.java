package snackbarApp;

public class Snack
{
	private static int maxId = 0;

	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;

	public Snack(String name, int quantity, double cost, int vendingMachineId)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
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
	public double getCost()
	{
		return cost;
	}
	public int getVendingMachineId()
	{
		return vendingMachineId;
	}
	public int getQuantity()
	{
		return quantity;
	}
	// Setter Methods
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public void setVendingMachineId(int vendingMachineId)
	{
		this.vendingMachineId = vendingMachineId;
	}
	// Other Methods
	public void addQuantity(int quantity)
	{
		this.quantity += quantity;  
	}	
	public void buySnack(int quantity)
	{
		// this.quantity = this.quantity - quantity;
		this.quantity -= quantity;
	}
	public double getTotalCost(int quantity)
	{
		return cost * quantity;
	}

}
