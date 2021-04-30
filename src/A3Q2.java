import java.util.ArrayList;

public class A3Q2 {
    public static void main(String[] args) {
        Printer mainPrinter = new Printer(50, 23, 12, false);
        mainPrinter.fillInk(133);
        mainPrinter.print();
    }
}

class Printer {
    private int inkLevel, numOfPagesPrinted, numOfPagesLeft;
    private boolean duplex;
    private static ArrayList<Integer> printingQueue;

     Printer(int inkLevel, int numOfPagesLeft, int numOfPagesPrinted,boolean duplex) {
        this.setInkLevel(inkLevel);
        this.setDuplex(duplex);
        this.setNumOfPagesLeft(numOfPagesLeft);
        this.setNumOfPagesPrinted(numOfPagesPrinted);
        this.printingQueue = new ArrayList<Integer>();
    }

    private static void addToQueue(int page) {
        Printer.printingQueue.add(page);
    }

    private static void removeFromQueue() {
        Printer.printingQueue.remove(0);
    }

    public void print(){
        if(this.getInkLevel() <= 0){
            System.out.println("Sorry! Cannot print. Ink Empty.");
            return;
        } else if (this.getNumOfPagesLeft() <= 0) {
            System.out.println("Sorry! Cannot print. No papers left.");
            return;
        }
        Printer.addToQueue(this.getNumOfPagesPrinted());
        this.setNumOfPagesLeft(this.numOfPagesLeft-1);
        this.setNumOfPagesPrinted(this.numOfPagesPrinted+1);
        this.setInkLevel(this.inkLevel-1);
        Printer.removeFromQueue();
        System.out.println("Printing Finished");
    }

    public void fillInk (int ink) {
        ink += this.getInkLevel();
         if(ink > 100){
            ink = 100;
        }
        this.setInkLevel(ink);
        System.out.println("Printer ink level set to " + this.inkLevel +"%");
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(int inkLevel) {
        this.inkLevel = inkLevel;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    public void setNumOfPagesPrinted(int numOfPagesPrinted) {
        this.numOfPagesPrinted = numOfPagesPrinted;
    }

    public int getNumOfPagesLeft() {
        return numOfPagesLeft;
    }

    public void setNumOfPagesLeft(int numOfPagesLeft) {
        this.numOfPagesLeft = numOfPagesLeft;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}