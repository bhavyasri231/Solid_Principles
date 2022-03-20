
class Staff
{
    int id;
    String name;
    String type;
    public Staff(int id, String name, String type)
    {
        this.id=id;
        this.name=name;
        this.type=type;
    }
    public double calculateIncrement(double salary)
    {
        if(this.type=="TeachingStaff")
        {
            return salary*=0.2;
        }
        else
        {
            return salary*=0.1;
        }
    }

    public String toString()
    {
        return "Staff id : "+ this.id + " Staff name : "+ this.name;
    }

}


public class ViolatingOCP
{
    public static void main(String[] args) {
        Staff staffobj1 = new Staff(1,"john","TeachingStaff");
        Staff staffobj2 = new Staff(2,"Ram","NonTeachingStaff");

        System.out.println(staffobj1.toString());
        System.out.println("increment is : " +staffobj1.calculateIncrement(20000));

        System.out.println(staffobj2.toString());
        System.out.println("increment is : " +staffobj2.calculateIncrement(15000));

    }
}