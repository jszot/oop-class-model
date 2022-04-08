package pl.edu.mimuw;

import java.sql.Timestamp;

public class DepositBankAction extends BankAction {
  protected double interest;
  protected double earlyWithdrawalPenalty;


  public double getInterest(){
    return this.interest;
  }

  private void setInterest(double Interest){
    this.interest=Interest;
  }

  public double getEarlyWithdrawalPenalty(){
    return this.earlyWithdrawalPenalty;
  }

  private void setEarlyWithdrawalPenalty(double amount){
    this.earlyWithdrawalPenalty=amount;
  }

  public DepositBankAction(double amount, Timestamp begin, Timestamp end, double interest, double earlyWithdrawalPenalty) {
    super(amount, begin, end);
    this.interest=interest;
    this.earlyWithdrawalPenalty=earlyWithdrawalPenalty;
  }

  public double totalAmount(){
    return this.amount*(1+this.interest);
  }

  public double amountIfWithdraweedOn(Timestamp date){
    double checker;
    if (date.after(this.end))
      checker=0;
    else
      checker=1;
    return this.amount - checker*this.earlyWithdrawalPenalty;
  }

  public String toString() {
    return ("Deposit of " + this.amount + " from " + this.begin + " to " + this.end + " with " + this.interest*100 + "% interest and " + this.earlyWithdrawalPenalty + " of early withdrawal penalty");
  }
  // TODO:
  // - remove abstract modifier from this class
  // - this class has to contain extra fields other than LoanBankAction
  // - you have to design it's constructors/accessors/setters and implement some from BankAction
}
