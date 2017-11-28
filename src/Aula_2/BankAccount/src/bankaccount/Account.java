/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package bankaccount;

import java.util.Scanner;

/**
 *
 * @author Manoel Vilela
 */
public class Account {
    private static int accounts = 0;
    private int accountId;
    private String titleName;
    protected float capital;
    protected String accountType = "normal";
    
    public Account() {
        this.accountId = Account.accounts++;
        this.titleName = "";
        this.capital = 0.0F;
    }
    
    /**
     * @return the accountId
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the titleName
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * @param titleName the titleName to set
     */
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    /**
     * @return the capital
     */
    public float getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(float capital) {
        this.capital = capital;
    }

    /**
     * Method to take money from the account capital
     * @param moneyToTake is the money to take into your banking account
     * @return true for success and false to not enough money on capital.
     */
    public boolean withdrawal(float moneyToTake) {
        if (moneyToTake <= capital) {
            this.capital -= moneyToTake;
            return true;
        }
        return false;
    }
    /**
     * Just deposit money to the account
     * @param money 
     */
    public void deposit(float money) {
        this.capital += money;
    }
    
    /**
     * Describe the account
     */
    public void describe() {
        System.out.println("Account ID: " + this.accountId);
        System.out.println("Account type: " + this.accountType);
        System.out.println("Name: " + this.titleName);
        System.out.println("Capital: " + this.capital);
    }
    
    public void read(Scanner scan) {
        System.out.print("Set the title name: ");
        this.setTitleName(scan.nextLine());
    }
}
