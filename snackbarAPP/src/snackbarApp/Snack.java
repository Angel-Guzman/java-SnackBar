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
	public String name()
	{
		return name;
	}
	public double cost()
	{
		return cost;
	}
	public int vendingMachineId()
	{
		return vendingMachineId;
	}
	public int quantity()
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
	

}
