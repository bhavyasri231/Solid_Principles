abstract class FlyingBird
{
    public abstract void fly();
}
abstract class SwimmingBird
{
    public abstract void swim();
}
class Parrot extends FlyingBird
{
    @Override
    public void fly()
    {
        System.out.println("parrot is flying");
    }

}

class Penguine extends SwimmingBird
{
    @Override
    public void swim()
    {
        System.out.println("penguine is swimming");
    }
}

public class LSP
{
    public static void main(String[] args) {
        Parrot bird1 = new Parrot();
        Penguine bird2 = new Penguine();

        bird1.fly();
        bird2.swim();


    }
}
