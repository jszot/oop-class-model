package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  protected final List<BankClient> clientList;
  protected int NumberOfClients;

  public Bank() {
      this.clientList = new ArrayList<>();
      this.NumberOfClients = 0;
  }
  @Override
  public String toString() {
    StringBuilder lista = new StringBuilder();
    lista.append("This bank currently has " + this.clientList.size() + " clients:" + "\n");
    for (BankClient client:this.clientList
         ) {
      lista.append(client.toString() + "\n");
    }
    return lista.toString();
    //throw new IllegalStateException("TODO: get information about bank and all its clients (use StringBuilder)");
  }

  public List<BankClient> getAllClients() {
    List<BankClient> copy = new ArrayList<>();
    copy.addAll(this.clientList);
    return copy;
    //throw new IllegalStateException("TODO: remember not to return internal state list as it can be modified");
  }

  public void addClient(BankClient client) {
    if (client.index == 0){
      this.clientList.add(client.NewIndex(this.NumberOfClients+1));
    } else {
      this.clientList.add(client);
    }
      this.NumberOfClients = this.NumberOfClients+1;
    //throw new IllegalStateException("TODO");
  }

  public BankClient getClient(int clientIndex) {
    final var clients = getAllClients();
    if (clientIndex > clients.size()) throw new IllegalArgumentException("Invalid client index");
    return clients.get(clientIndex-1);
  }
}
