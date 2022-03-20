abstract class Bird
{
    public abstract void fly();
}
class Parrot extends Bird
{
    @Override
    public void fly()
    {
        System.out.println("parrot is flying");
    }

}

class Penguine extends Bird
{
    @Override
    public void fly()
    {
        System.out.println("penguine cannot fly");
    }

    public void swim()
    {
        System.out.println("penguine is swimming");
    }
}

public class ViolatingLSP
{
    public static void main(String[] args) {
        Parrot bird1 = new Parrot();
        Penguine bird2 = new Penguine();

        bird1.fly();
        bird2.fly();
        bird2.swim();


    }
}
