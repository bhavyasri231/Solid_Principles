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
    public void addBonus(double bonus)
    {
        salary=salary+bonus;
    }
}


public class ViolatingSRP {
    public static void main(String[] args) {
        Salary amount = new Salary();
        amount.setSalary(30000);
        amount.addBonus(10000);
        System.out.println("salary after adding bonus : "+amount.getSalary());

    }

}