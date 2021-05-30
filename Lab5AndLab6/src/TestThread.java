
public class TestThread {

	public static void main(String[] args) {
		Customer individualCustomer = new Customer();
		UserA thread1 = new UserA(individualCustomer);
		UserB thread2 = new UserB(individualCustomer);
		thread1.start();
		thread2.start();
		
	}

}
