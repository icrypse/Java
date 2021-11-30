package AtmTran.PrimeBank;
import AtmTran.Bank.AtmTransaction;
import AtmTran.Bank.Menu;
import AtmTran.Bank.TimeWait;

import java.util.Scanner;

public class PrimeBank extends AtmTransaction {

    public static void main(String[] args) {

        PinAttempts pinAttempts = new PinAttempts();
        pinAttempts.setSetCounter(4);

        AtmTransaction atmTransaction = new AtmTransaction();
        atmTransaction.setMaxDeposit(900000000);

        Menu menu = new Menu();

//        WithdrawAmount withdrawAmount = new WithdrawAmount();
//
//        AtmTransaction atmTransaction = new AtmTransaction();

//        DepositAmount depositAmount = new DepositAmount();
//        depositAmount.setMaxDeposit(500000000);

        Scanner scanner = new Scanner(System.in);
        TimeWait timeWait = new TimeWait();

        timeWait.setWaitLimit(10000);


        if (pinAttempts.pinAttempts() == true) {


        }else{
            while (true) {
                menu.menu();

                int menuChoice = scanner.nextInt();
                switch (menuChoice) {
                    case 1:
                        try {
                            atmTransaction.deposit();

                        } catch (Exception ex) {
                            System.out.println(ex);
                        }
                        break;

                    case 2:
                        atmTransaction.withdraw();
                        break;

                    case 3:
                        System.out.println("your current balance is $" + atmTransaction.getMainBalance() + "\n\n");
                        break;

                    case 4:
                        System.out.println("Thank you for using KTM Bank Ltd.\n" +
                                "You have wonderful day!! ");
                        System.exit(0);


                }
            }
        }
    }
}