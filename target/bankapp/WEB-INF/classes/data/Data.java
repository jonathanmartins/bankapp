package data;

import java.util.ArrayList;

import model.Client;

public class Data {
	private static Data instance = null;
	private ArrayList<Client> clients;
	
	private Data() {
		clients = new ArrayList<Client>();
	}
	
	public static Data getInstance() {
		if(instance == null) {
			instance = new Data();
		}
		return instance;
	}
	
	public Client insertClient(Client client) {
		clients.add(client);
		client.getAccount().setId(clients.indexOf(client));
		return client;
	}
	
	public boolean removeClient(Client client) {
		boolean removed = false;
		if(clients.contains(client)) {
			removed = clients.remove(client);
		}
		return removed;
	}
	
	public Client getClient(int id) {
		return clients.get(id);
	}
	
	public ArrayList<Client> getClients() {
		return clients;
	}
}
