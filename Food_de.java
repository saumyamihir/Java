import java.util.*;
abstract class order {
    String customerName;
    double amount;
    order(String customerName, double amount)
    {
        this.customerName = customerName;
        this.amount = amount;
    }
    abstract void placeorder();
    void showDetails()
    {
        System.out.println("Customer Name : "+ customerName);
        System.out.println("Amount : " + amount);
    }
}
interface PaymentMethod{
    void pay(double amount);

}
interface DeliveryPartner{
    void estimateDeliveryTime(int distance);

}
interface Rating{
    void GiveRating(int stars);

}
class ZomatoOrder extends order implements PaymentMethod,DeliveryPartner,Rating
{
    ZomatoOrder(String customerName,double amount)
    {
        super(customerName,amount);
    }
    void placeorder()
    {
        System.out.println(" Order Placed ");
    }
    public void pay(double amount)
    {
        System.out.println(" Amount Paid : " + amount);
    }
    public void estimateDeliveryTime(int distance)
    {
         System.out.println(" Delivery Time : " + (distance*5) + " Minutes ");
    }
    public void GiveRating(int stars)
    {
         System.out.println(" Rating : " + stars);
    }
}
public class Food_de{
    public static void main(String[] args) {
        ZomatoOrder z1 = new ZomatoOrder("Sami", 400);
        z1.estimateDeliveryTime(20);
        z1.pay(400);
        z1.placeorder();
        z1.GiveRating(4);
    }

}