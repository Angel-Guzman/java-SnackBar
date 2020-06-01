package snackbarApp;

public class VendingMachine
{
	private static int maxId = 0;
	// using public for practice
	public int id;
	public String name;

	public VendingMachine(String name, int id)
	{
		maxId++;
		id = maxId;
		this.name = name;
	}
	// Getter Methods
	public getId()
	{
		return id;
	}
	public getName()
	{
		return name;
	}
	// Setter Methods
	public void setName(String name)
	{
		this.name = name;
	}
}
