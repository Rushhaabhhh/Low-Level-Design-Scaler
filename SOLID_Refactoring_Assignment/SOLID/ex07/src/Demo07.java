public class Demo07 {
    public static void main(String[] args) {
        Print basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello from basic printer");

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print("Hello from MultiFunctionPrinter");
        mfp.scan("/tmp/scanned.pdf");
        mfp.fax("555-1234");
        
        usePrinter(basicPrinter);
        usePrinter(mfp);
        
        useScanner(mfp);
        useFax(mfp);
    }
    
    static void usePrinter(Print printer) {
    }
    
    static void useScanner(Scan scanner) {
    }
    
    static void useFax(Fax fax) {
    }
}
