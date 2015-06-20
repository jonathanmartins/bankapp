package command;

import model.Client;

public class Deposit implements IBank {
	private Client client;
	private double amount;
	
	public Deposit(double amount, Client client) {
		this.amount = amount;
		this.client = client;
		this.client.getAccount().setBonus(this.client.getAccount().getBonus() + (amount*3/100));
	}
	
	public void execute() {
		client.getAccount().setBalance(client.getAccount().getBalance() + amount);
		System.out.println("Depositado: " + amount + " ; Saldo: " + client.getAccount().getBalance());
		System.out.println("Bônus de " + (amount*3/100) + " creditado.");
	}
}
