interface IPrinter
{
    public void print();
}
interface IXeroe
{
    public void scan();
    public void Xerox();
}
class HpPrinter implements IPrinter
{

    @Override
    public void print() {
        System.out.println("The printing has been done");
    }

}
class AdvancedPrinter implements IPrinter,IXeroe
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
        System.out.println("The scanning is done");

    }

}


public class ISP {
    public static void main(String[] args) {
        HpPrinter printerObj = new HpPrinter();
        printerObj.print();

        AdvancedPrinter printerObj2 = new AdvancedPrinter();
        printerObj2.print();
        printerObj2.Xerox();
        printerObj2.scan();

    }

}
