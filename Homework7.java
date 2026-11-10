public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer{
    String model;
    int PrintedCount;
    int availableCount;

    public Printer(String model, int availableCount){
        this.model = model;
        this.availableCount  = availableCount;
        this.PrintedCount = 0;
    }

    abstract boolean print();
}

class InkjetPrinter extends Printer{
    String model;
    int PrintedCount;
    int availableCount;

    public InkjetPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.PrintedCount = 0;
        super(model, availableCount);
    }

    @Override
    boolean print(){
        if(availableCount >= 1){
            availableCount--;
            PrintedCount++;

            return true;
        }
        else{
            System.out.println(model+": "+ (PrintedCount+1)+"매째 인쇄 실패 - 잉크 부족");
            return false;
        }
    }


}

class LaserPrinter extends Printer{
    String model;
    int PrintedCount, availableCount;

    public LaserPrinter(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.PrintedCount = 0;
        super(model, availableCount);
    }

    @Override
    boolean print(){
        if(availableCount >= 1){
            availableCount--;
            PrintedCount++;

            return true;
        }
        else{
            System.out.println(model+": "+ (PrintedCount+1)+"매째 인쇄 실패 - 토너 부족");
            return false;
        }
    }
}