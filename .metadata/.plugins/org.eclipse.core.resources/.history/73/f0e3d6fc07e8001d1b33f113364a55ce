
public class BankAccount extends Thread{
	long amount = 100000;
	private int num;
	private String err;
	public BankAccount(int num) {
		this.num = num;
	}
	public long getAmount() {
		return amount;
	}
	public int getNum() {
		return num;
	}
	public String getErr() {
		return err;
	}
	public boolean checkAccountBalance(long withDrawAmount) {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(withDrawAmount<=amount) {
			return true;
		}
		return false;
	}
	public synchronized boolean withdraw(long withdrawAmount) {
		System.out.println("Bank id "+num+"check"+withdrawAmount);
		if(checkAccountBalance(withdrawAmount)) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			amount-=withdrawAmount;
			System.out.println("Bank id"+num+"withdraw successfull "+withdrawAmount);
		}else {
			System.out.println("Bank id "+num+ "withdraw error");
			this.err="Transfer error";
			return false;
		}
		System.out.println("Bank id "+num+ "see balance"+amount);
		return true;
	}
	public synchronized void deposit(long amount) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.amount+=amount;
		System.out.println("Bank id "+num+ "deposit successful"+amount);
	}
}
