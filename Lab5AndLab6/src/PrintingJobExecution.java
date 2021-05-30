
public class PrintingJobExecution {

	public static void main(String[] args) {
		Printer printPages = new Printer();
		PrintingPages pagesPrinting = new PrintingPages (printPages);
		CalculateRemainingPagesForPrinting calRemainingPages = new CalculateRemainingPagesForPrinting(printPages);
		pagesPrinting.start();
		calRemainingPages.start();
		
		
	}

}
