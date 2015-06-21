package model;

import data.Data;
import command.Deposit;
import command.IBank;
import command.Transfer;
import command.Withdrawal;

public class Bank implements IBankServices {
	private Data data;
	
	public Bank() {
		data = Data.getInstance();
	}

	public Client insertClient(String name) {
		Client client = new Client(name);
		client = data.insertClient(client);
		return client;
	}

	public boolean removeClient(Client client) {
		return data.removeClient(client);
	}

	public double getBalance(Client client) {
		System.out.println("Saldo: " + client.getAccount().getBalance());
		return client.getAccount().getBalance();
	}

	public void deposit(Client client, double amount) {
		IBank service = new Deposit(amount, client);
		service.execute();
	}

	public void withdrawal(Client client, double amount) {
		IBank service = new Withdrawal(amount, client);
		service.execute();
		
	}

	public void transfer(Client cltFrom, Client cltTo, double amount) {
		IBank service = new Transfer(cltFrom, cltTo, amount);
		service.execute();
	}
	
	public double getBonus(Client client){
		System.out.println("Bonus: " + client.getAccount().getBonus());
		return client.getAccount().getBonus();
	}
}
