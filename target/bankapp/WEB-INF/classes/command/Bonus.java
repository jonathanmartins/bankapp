package command;

import model.Client;

public class Bonus implements IBank{
	private Client client;
	private double bonus;
	
	public Bonus(Client client) {
		this.client = client;
	}
	
	public void execute() {
		this.bonus = (client.getAccount().getBonus());
	}

	public double getBonus() {
		return client.getAccount().getBonus();
	}

	public double getThisBonus() {
		return bonus;
	}
}
