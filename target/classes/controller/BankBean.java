package controller;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

import data.Data;
import model.Bank;
import model.Client;

@ManagedBean (name = "bank")
@SessionScoped

public class BankBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Bank bank;
	private Data data;
	
	private Client client;
	private Client cltTransfFrom;
	private Client cltTransfTo;
	
	//Account
	private int accountId;
	private int accountIdB;
	private int accountIdD;
	private int accountIdW;
	private int accountIdBonus;
	private double balanceB;
	private double bonusB;
	//Client
	private String name;
	//Operation
	private double amount;
	private double amountD;
	private double amountW;
	private double amountT;
	private int accTransfFromId;
	private int accTransfToId;
	
	public BankBean() {
		this.bank = new Bank();
		this.data = Data.getInstance();
	}
	
	public String insertClient() {
		this.client = bank.insertClient(name);
		setName(client.getName());
		setAccountId(client.getAccount().getId());
		return "insert.xhtml";
	}

	public String removeClient(Client client) {
		bank.removeClient(client);
		return "remove.xhtml";
	}

	public String getBalance() {
		this.client = Data.getInstance().getClient(accountIdB);
		setBalanceB(client.getAccount().getBalance());
		bank.getBalance(client);
		return "balance.xhtml";
	}
	
	public String getBonus(){
		this.client = Data.getInstance().getClient(accountIdBonus);
		setBonusB(client.getAccount().getBonus());
		bank.getBonus(client);
		return "bonus.xhtml";
	}

	public String deposit() {
		client = Data.getInstance().getClient(accountIdD);
		bank.deposit(client, amountD);
		return "deposit.xhtml";
	}

	public String withdrawal() {
		client = Data.getInstance().getClient(accountIdW);
		bank.withdrawal(client, amountW);
		return "withdrawal.xhtml";
	}

	public String transfer() {
		cltTransfFrom = Data.getInstance().getClient(accTransfFromId);
		cltTransfTo = Data.getInstance().getClient(accTransfToId);
		bank.transfer(cltTransfFrom, cltTransfTo, amount);
		return "transfer.xhtml";
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public double getBalanceB() {
		return balanceB;
	}
	
	public void setBalanceB(double balanceId) {
		this.balanceB = balanceId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Client getCltTransfFrom() {
		return cltTransfFrom;
	}

	public void setCltTransfFrom(Client cltTransfFrom) {
		this.cltTransfFrom = cltTransfFrom;
	}

	public Client getCltTransfTo() {
		return cltTransfTo;
	}

	public void setCltTransfTo(Client cltTransfTo) {
		this.cltTransfTo = cltTransfTo;
	}

	public Data getData() {
		return data;
	}
	
	public int getAccTransfFromId() {
		return accTransfFromId;
	}
	
	public void setAccTransfFromId(int accTransfFromId) {
		this.accTransfFromId = accTransfFromId;
	}
	
	public int getAccTransfToId() {
		return accTransfToId;
	}
	
	public void setAccTransfToId(int accTransfToId) {
		this.accTransfToId = accTransfToId;
	}

	public int getAccountIdB() {
		return accountIdB;
	}

	public void setAccountIdB(int accountIdB) {
		this.accountIdB = accountIdB;
	}

	public int getAccountIdD() {
		return accountIdD;
	}

	public void setAccountIdD(int accountIdD) {
		this.accountIdD = accountIdD;
	}

	public double getAmountD() {
		return amountD;
	}

	public void setAmountD(double amountD) {
		this.amountD = amountD;
	}

	public int getAccountIdW() {
		return accountIdW;
	}

	public void setAccountIdW(int accountIdW) {
		this.accountIdW = accountIdW;
	}

	public double getAmountW() {
		return amountW;
	}

	public void setAmountW(double amountW) {
		this.amountW = amountW;
	}

	public double getAmountT() {
		return amountT;
	}

	public void setAmountT(double amountT) {
		this.amountT = amountT;
	}

	public double getBonusB() {
		return bonusB;
	}

	public void setBonusB(double bonusB) {
		this.bonusB = bonusB;
	}

	public int getAccountIdBonus() {
		return accountIdBonus;
	}

	public void setAccountIdBonus(int accountIdBonus) {
		this.accountIdBonus = accountIdBonus;
	}

}
