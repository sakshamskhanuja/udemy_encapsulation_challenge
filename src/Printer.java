public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        // Checks tonerLevel for valid input.
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        // Checks if tonerAmount is not more than enough to fill the toner.
        if (tonerAmount + tonerLevel <= 100) {
            return tonerLevel += tonerAmount;
        }
        // tonerAmount makes the toner level fall outside of range.
        return -1;
    }

    public int printPages(int pages) {
        // Checks if it's a duplex printer.
        if (duplex) {
            System.out.println("Duplex Printer");
            int jobPrinted = (pages / 2) + (pages % 2);
            pagesPrinted += jobPrinted;
            return jobPrinted;
        }

        // Not a duplex printer.
        return pagesPrinted = pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
