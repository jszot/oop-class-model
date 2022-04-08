package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class BankClient {
protected final String name;
protected final String surname;
protected int age;
protected final String accountNumber;
protected final List<BankAction> actionHistory;
protected int index;

public BankClient(String name, String surname, int age, String accountNumber, List<BankAction> actionHistory, int index){
  this.name=name;
  this.surname=surname;
  this.age=age;
  this.accountNumber=accountNumber;
  this.actionHistory=actionHistory;
  this.index=index;
}

public static BankClient NewClient(String name, String surname, int age, String accountNumber){
  List<BankAction> list = new ArrayList<BankAction>();
  return new BankClient(name, surname, age, accountNumber, list, 0);
}

public BankClient NewIndex(int index){
  return new BankClient(this.name, this.surname, this.age, this.accountNumber, this.actionHistory, index);
}

  // TODO:
  // - create proper constructor
  // - implement methods
  // - add your own methods (1 is enough)
  protected void birthday() { this.age=this.age+1; }

  public int getIndex() { return this.index; }

  public String getInfo() { return (this.surname + " " + this.name + " " + this.index); }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public int getAge() {
    return this.age;
  }

  public String getAccountNumber() {
  return this.accountNumber;
  }

  public List<BankAction> getActionHistory() {
    return this.actionHistory;
  }

  public void addAction(BankAction action) {
    this.actionHistory.add(action);
  }

  public String toString() {
    StringBuilder acc = new StringBuilder();
    acc.append(this.getInfo() + " " + this.getAge() + " " + this.getAccountNumber() + " " + this.getActionHistory());
    return acc.toString();
  }
}
