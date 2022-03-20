interface IPrinter
{
    public void print();
    public void Xerox();
    public void scan() ;

}
class HpPrinter implements IPrinter
{

    @Override
    public void print() {
        System.out.println("The printing has been done");
    }

    @Override
    public void Xerox() {
        System.out.println("The Xerox of a copy is done");

    }

    @Override
    public void scan() {
        System.out.println("The scanning of a copy is not available");

    }

}


public class ViolatingISP {
    public static void main(String[] args) {
        HpPrinter printerObj = new HpPrinter();
        printerObj.print();
        printerObj.Xerox();
        printerObj.scan();

    }

}
