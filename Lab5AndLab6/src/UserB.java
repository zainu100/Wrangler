
public class UserB extends Thread {
	Customer customer;
	
	UserB(Customer customer){
		this.customer=customer;
		
	}
	public void run() {
		customer.withDraw(20000);
	}
}
