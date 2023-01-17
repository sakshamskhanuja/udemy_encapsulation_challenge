public class Main {
    public static void main(String[] args) {
        // Duplex printer at 50% toner level.
        Printer printer = new Printer(50, true);
        System.out.println("Initial Page Count = " + printer.getPagesPrinted());

        // Printing 5 pages.
        int pagesPrinted = printer.printPages(5);
        System.out.println("Current job pages = " + pagesPrinted + ", Printer Total = " + printer.getPagesPrinted());

        // Printing 10 pages
        pagesPrinted = printer.printPages(10);
        System.out.println("Current job pages = " + pagesPrinted + ", Printer Total = " + printer.getPagesPrinted());
    }
}