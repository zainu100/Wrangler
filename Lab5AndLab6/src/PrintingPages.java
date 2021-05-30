
public class PrintingPages extends Thread {
 Printer printer;
 PrintingPages(Printer printer){
	 this.printer=printer;
 }
 public void run() {
	 printer.printingPages(15);
 }
}
