package command;

import model.Client;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Balance implements IBank {
	private Logger logger = LogManager.getLogger(Balance.class.getName());
	
	private Client client;
	private double balance;
	
	public Balance(Client client) {
		this.client = client;
	}
	
	public void execute() {
		this.balance = (client.getAccount().getBalance());
		logger.info("Cliente consultou saldo!");
	}

	public double getBalance() {
		return client.getAccount().getBalance();
	}

	public double getThisBalance() {
		return balance;
	}

}
