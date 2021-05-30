
public class Printer {
	int pages = 10;

	synchronized void printingPages(int pages) {
		System.out.println("\n\tThe total no of pages left in queue is: "+this.pages+"\n");
		System.out.println("\tThe printing job execution start for the "+pages+" pages");
		if (this.pages < pages) {
			System.out.println("\tRemaining pages in queue is "+this.pages+" waiting for "+(pages-this.pages)+" more pages to be added in the queue");
			try {
				wait();
			} catch (Exception e) {

			}
		}
		this.pages -= pages;
		System.out.println("\n\tprinting task completed.."+"\n\tThe no of remaining pages left in the queue is: "+this.pages);
	}

	synchronized void addMorePages(int pages) {
		System.out.println("\n\tgoing to add more pages in queue");
		this.pages+=pages;
		System.out.println("\t"+pages+" pages are added in queue..");
		notify();
				
	}
}
