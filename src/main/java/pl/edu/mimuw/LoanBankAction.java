package pl.edu.mimuw;

import java.sql.Timestamp;

public class LoanBankAction extends BankAction {
  protected double interest;
  protected String trustee;
  protected String reasonDescription;

  public LoanBankAction(double amount, Timestamp begin, Timestamp end, String trustee, double interest, String reasonDescription) {
    super(amount, begin, end);
    this.interest=interest;
    this.trustee=trustee;
    this.reasonDescription=reasonDescription;
  }

  protected void setTrustee(String newtrustee){
    this.trustee=newtrustee;
  }

  protected void setInterest(double Interest){
    this.interest=Interest;
  }

  protected void setReasonDescription(String reason){
    this.reasonDescription=reason;
  }

  public double getInterest(){
    return this.interest;
  }

  public String getTrustee(){
    return this.trustee;
  }

  public String getReasonDescription(){
    return this.reasonDescription;
  }

  public double totalAmount(){
    return this.amount*(1+this.interest);
  }

  public String toString(){
    return ("Loan of " + this.amount + " from " + this.begin + " to " + this.end + " with " + this.interest*100 + "% interest, trustee: " + this.trustee + ", reason: " + this.reasonDescription);
  }
  // TODO:
  // - remove abstract modifier from this class
  // - this class has to contain extra fields other than DepositBankAction
  // - you have to design it's constructors/accessors/setters and implement some from BankAction
}
