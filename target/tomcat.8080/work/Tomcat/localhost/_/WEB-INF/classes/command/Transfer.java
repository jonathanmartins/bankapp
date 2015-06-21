package command;

import model.Client;

public class Transfer implements IBank {
	private Client cltFrom;
	private Client cltTo;
	private double amount;
	
	public Transfer(Client cltFrom, Client cltTo, double amount) {
		this.cltFrom = cltFrom;
		this.cltTo = cltTo;
		this.amount = amount;
	}
	
	public void execute() {
		if (cltFrom.getAccount().getBalance() >= amount) {
			cltFrom.getAccount().setBalance(cltFrom.getAccount().getBalance() - amount);
			cltTo.getAccount().setBalance(cltTo.getAccount().getBalance() + amount);
			System.out.println("Transferido " + amount);
		}
		else {
			System.out.println("Saldo insulficiente.");
		}
	}
}
