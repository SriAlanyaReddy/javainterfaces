interface AfterSale{
    void ChargeOnDelivery();
    double discount();
}
// class RegularCustomer implements AfterSale
// {
//     public void ChargeOnDelivery()
//     {

//     }
// }
// class PrivilegedCustomer implements AfterSale
// {
//     public void ChargeOnDelivery()
//     {

//     }
// }
abstract class Customer2 implements AfterSale{
    public void ChargeOnDelivery()
    {

    }
    abstract double calculatePurchaseAmount();
}
class RegularCustomer extends Customer2
{
    private double purchaseAmount;
    public RegularCustomer(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    @Override
    public double calculatePurchaseAmount() {
        return purchaseAmount;
    }

    @Override
    public double discount() {
        return 0.0; // Regular customers get no discount
    }
}
class PrivilegedCustomer extends Customer2 {
    private double purchaseAmount;

    public PrivilegedCustomer(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    @Override
    public double calculatePurchaseAmount() {
        return purchaseAmount - discount();
    }

    @Override
    public double discount() {
        // Additional 5% discount for privileged customers
        return purchaseAmount * 0.05;
    }
}
public class Customer1
{
    public static void main(String[] args)
    {
        double regularPurchaseAmount = 100.0;
        double privilegedPurchaseAmount = 200.0;

        RegularCustomer regularCustomer = new RegularCustomer(regularPurchaseAmount);
        PrivilegedCustomer privilegedCustomer = new PrivilegedCustomer(privilegedPurchaseAmount);

        System.out.println("Regular Customer Purchase Amount: " + regularCustomer.calculatePurchaseAmount());
        System.out.println("Privileged Customer Purchase Amount: " + privilegedCustomer.calculatePurchaseAmount());

    }
}