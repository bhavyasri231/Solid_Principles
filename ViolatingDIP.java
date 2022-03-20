class BusinessLogicLayer
{
    DataAccessLayer data;
    public BusinessLogicLayer(DataAccessLayer obj)
    {
        data= obj;
    }
    public void Details()
    {
        data.getCustomerName();
    }
}
class DataAccessLayer
{
    public void getCustomerName()
    {
        System.out.println("Customer name is john");
    }
}
public class ViolatingDIP
{
    public static void main(String[] args) {

        BusinessLogicLayer business = new BusinessLogicLayer(new DataAccessLayer());
        business.Details();
    }
}