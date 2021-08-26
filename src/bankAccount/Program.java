package bankAccount;

import system.Bank;

import java.util.Scanner;



public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank;

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.print("Enter holder ");
        sc.nextLine();
        String holder = sc.nextLine();


        System.out.print("Is there an initial deposit (y/n): ");
        char key = sc.next().charAt(0);
        if (key == 'y'){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            bank = new Bank(holder, account, deposit);
        }else{
            bank = new Bank(holder, account);
        }

        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bank.sumDeposit(deposit);
        System.out.println(bank);

        System.out.print("Enter a withdraw value: ");
        double withdrawDeposit = sc.nextDouble();
        bank.withdrawDeposit(withdrawDeposit);
        System.out.println(bank);

    }
}
