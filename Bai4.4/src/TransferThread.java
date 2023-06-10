import java.util.Vector;

public class TransferThread extends Thread{
	BankAccount fromAccount;
	BankAccount toAccount;
	long amount;
	public TransferThread(BankAccount fromAccount, BankAccount toAccount, long amount) {
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Vector<Object> vt = new Vector<>();
		vt.add(this.getName());
		vt.add(amount);
		vt.add(fromAccount.getNum());
		vt.add(toAccount.getNum());
		if(fromAccount.withdraw(amount)) {
			toAccount.deposit(amount);
			vt.add("10000000");
		}else {
			vt.add(fromAccount.getErr());
		}
		Main.dtm.addRow(vt);
	}
}
