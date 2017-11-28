/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */
package bankaccount;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Just a example of inheritance, polymorphism and encapsulation
 * @author Manoel Vilela
 */
public class BankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the number of accounts to create: ");
        int numberOfAccounts = scan.nextInt();
        scan.nextLine(); // drop new line
        
        for(int i = 0; i < numberOfAccounts; i++) {
            System.out.print("Type of account(special/normal): ");
            String accountType = scan.next();
            scan.nextLine();
            Account newAccount = null;
            
            switch (accountType) {
                case "special":
                    newAccount = new SpecialAccount();
                    break;
                case "normal":
                    newAccount = new Account();
                    break;
                default:
                    System.out.println("Invalid option, try again.");
                    i--;
                    break;
            }
            
            if (newAccount != null) {
                newAccount.read(scan);
                accounts.add(newAccount);
            }
            
        }
        
        Random rand = new Random();
        for(Account account: accounts) {
            System.out.println("--------------------");
            account.deposit(100 * rand.nextFloat());
            account.describe();
        }
        
        scan.close();
    }
    
    
    
}
