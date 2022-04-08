package pl.edu.mimuw;

import java.io.IOException;
import java.sql.Timestamp;

public class Main {

  public static void main(String[] args) throws IOException {
    System.out.println("Welcome in MIM UW Bank");
    final var bank = new Bank();
    bank.addClient( BankClient.NewClient("Jan", "Szot", 21, "14369146543"));
    bank.addClient( BankClient.NewClient("Alan", "Teskopienczyk", 13, "213769420"));
    BankClient pierwszy = bank.getClient(1);
    BankClient drugi = bank.getClient(2);
    Timestamp data1 = new Timestamp(122, 1, 9, 0,0,0, 0);
    Timestamp data2 = new Timestamp(148, 8, 16, 4, 32, 2, 64);
    pierwszy.addAction(new DepositBankAction(20000, data1, data2, 0.02, 300));
    drugi.addAction(new LoanBankAction(1.99, data1, data2, "Biedronka", 0.8, "po robocie sie nalezy"));

    // TODO: play with bank:
    // - add new clients
    // - add different actions on clients accounts
    //    * try to do it with some bigger collections of actions (maybe even use streams)

    System.out.println(bank);
  }
}
