
public class CalculateRemainingPagesForPrinting extends Thread {
	Printer printer;
	CalculateRemainingPagesForPrinting(Printer printer){
		 this.printer=printer;
	 }
	 public void run() {
		 printer.addMorePages(20);
	 }
}
