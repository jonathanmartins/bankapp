package model;

public interface IBankServices {
	public Client insertClient(String name);
	public boolean removeClient(Client client);
	public double getBalance(Client client);
	public void deposit(Client client, double amount);
	public void withdrawal(Client client, double amount);
	public void transfer(Client cltFrom, Client cltTo, double amount);
}
