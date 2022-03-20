class Salary
{
    double salary;
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
}
class Bonus
{
    public double addBonus(double bonus,double salary)
    {
        salary=salary+bonus;
        return salary;
    }
}


public class SRP {
    public static void main(String[] args) {
        Salary amount = new Salary();
        Bonus bonusamount = new Bonus();
        amount.setSalary(30000);
        System.out.println("salary after adding bonus : "+bonusamount.addBonus(10000,amount.getSalary()));

    }

}