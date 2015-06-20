package model;

public class Client {
	private Account account;
	private String name;
	private int id;
	
	public Client(String name) {
		this.account = new Account();
		this.name = name;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("Nome: " + getName());
		System.out.println("Conta: " + account.getId() + " ; Saldo: " + account.getBalance());
	}
	
}
