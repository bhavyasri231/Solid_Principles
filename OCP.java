abstract class Staff
{
    int id;
    String name;
    public Staff(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public abstract double calculateIncrement(double salary);

    public String toString()
    {
        return "Staff id : "+ this.id + " Staff name : "+ this.name;
    }

}
class TeachingStaff extends Staff
{
    public TeachingStaff(int id, String name)
    {
        super(id,name);

    }

    @Override
    public double calculateIncrement(double salary)
    {
        return salary * 0.2;
    }

}

class NonTeachingStaff extends Staff
{
    public NonTeachingStaff(int id, String name)
    {
        super(id,name);

    }
    @Override
    public double calculateIncrement(double salary)
    {
        return salary * 0.1;
    }

}
public class OCP
{
    public static void main(String[] args) {
        Staff staffobj1 = new TeachingStaff(1,"john");
        Staff staffobj2 = new NonTeachingStaff(2,"Ram");

        System.out.println(staffobj1.toString());
        System.out.println("increment is : " +staffobj1.calculateIncrement(20000));

        System.out.println(staffobj2.toString());
        System.out.println("increment is : " +staffobj2.calculateIncrement(15000));

    }
}
