/**
 * This class models a Account object.
 * @author dladden
 *
 */
public class Account {

	private final static float interestRate = 0.05f;
	private String accountNumber;
	private float balance;
	
	/**
	 * Empty-argument constructor to put the object into a consistent state
	 */
	public Account() {
		
		accountNumber = "";
		balance = 0;
		
	}//empty Constructor
	
	/**
	 * This constructor supports passking the accNum, balance
	 * @param accNum
	 * @param balance
	 */
	public Account(String accNum, float balance) {
		
		this.setAccountNumber(accNum);
		this.setBalance(balance);
		
		
	}//End Constructor
	
	/**
	 * 
	 * @param deposit
	 * @return
	 */
	public boolean deposit(float deposit) {
		if(deposit>0) {
			balance = balance + deposit;
			return true;
		}
		else { 
			return false;
		}
	}//End deposit
	
    /**
     * 
     * @param withdraw
     * @return
     */
	public boolean withdraw(float withdraw) {
		if(verifySufficientFunds(withdraw)) {
			balance = balance - withdraw;
			return true;
		}
		else {
			return false;
		}
		
	}//End withdraw
	
	/**
	 * 
	 * @param amount
	 * @return
	 */
	private boolean verifySufficientFunds(float amount) {
		
		if(amount<=balance) {
			return true;
		}else { 
			return false;
		}
		
	}//End verifySufficientFunds
	
	/**
	 * 
	 */
	private void addInterest() {
		float interest = interestRate * balance;
		balance = interest + balance;
		
	}//End addInterest 

	public String getAccountNumber() {
		return accountNumber;
	}

	public final void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
    
	/**
	 * 
	 * @param balance
	 * @return
	 */
	public float getBalance(float balance) {
		if(balance>0) {
			this.balance = balance;
			}
		else {
			this.balance = 0;
		}
		
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public static float getInterestRate() {
		return interestRate;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	
	}
	