class Customer{
	int amount = 50000;
	
	synchronized void withDraw(int amount) {
		System.out.println("\n\tThe total balance of this account is: "+this.amount+"\n");
		System.out.println("\tgoing to withdraw "+amount);
		if(this.amount<amount) {
			System.out.println("\tRemaining balance is "+this.amount+" waiting for deposit of more than "+(amount-this.amount)+"...");
			
			
			try {
				wait();
			}
				catch(Exception e) {
					
				}
		}
			this.amount-=amount;
			System.out.println("\twithdraw completed of "+amount);
			}
		}
	
