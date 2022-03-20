class BusinessLogicLayer
{
    IRepositoryLayer data;
    public BusinessLogicLayer(IRepositoryLayer obj)
    {
        data= obj;
    }
    public void Details()
    {
        data.getCustomerName();
    }
}
interface IRepositoryLayer
{
    public void getCustomerName();
}
class DataAccessLayer implements IRepositoryLayer
{
    public void getCustomerName()
    {
        System.out.println("Customer name is john");
    }
}
public class DIP
{
    public static void main(String[] args) {

        BusinessLogicLayer business = new BusinessLogicLayer(new DataAccessLayer());
        business.Details();
    }
}