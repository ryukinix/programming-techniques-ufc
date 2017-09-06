/*
 * Copyright 2017 Manoel Vilela <manoel_vilela@engineer.com>
 */

package bankaccount;

/**
 * A special account which have some credit when doesn't have
 * enough money to take.
 * @author Manoel Vilela
 */
public class SpecialAccount extends Account {
    private float credit = 100;
    
    public SpecialAccount() {
        super();
        this.accountType = "special";
    }

    /**
     * @return the credit
     */
    public float getCredit() {
        return credit;
    }

    /**
     * @param credit the credit to set
     */
    public void setCredit(float credit) {
        this.credit = credit;
    }

    @Override
    public boolean withdrawal(float moneyToTake) {
        if(moneyToTake <= credit + this.capital) {
            this.capital -= moneyToTake;
            return true;
        }
        return false;
    }
    
    @Override
    public void describe() {
        super.describe();
        System.out.println("Max credit: " + this.credit);
    }
}
