
public class UserA extends Thread{
Customer customer;
UserA(Customer customer){
	this.customer=customer;
	
}
public void run() {
	customer.withDraw(45000);
}
}
