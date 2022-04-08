package pl.edu.mimuw;

import java.sql.Timestamp;

public abstract class BankAction {
  protected final double amount;
  protected final Timestamp begin;
  protected final Timestamp end;


  public BankAction(double amount, Timestamp begin, Timestamp end) {
    this.amount = amount;
    this.begin = begin;
    this.end = end;
  }

  public abstract double totalAmount();

  public double getAmount(){
    return this.amount;
  }

  public Timestamp getStartTimestamp() {
    return this.begin;
  }

  public Timestamp getEndTimestamp() {
    return this.end;
  }

  @Override
  public abstract String toString();
}
