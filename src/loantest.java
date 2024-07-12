interface Customer {
    String getName();
    int getAge();
    double calculateLoanAmount(double principalAmount);
}

class RetailCustomer implements Customer {
    private String name;
    private int age;

    RetailCustomer(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double calculateLoanAmount(double principalAmount){
        // Calculation for retail customers (15% interest)
        return principalAmount * 1.15;
    }
}

class CommercialCustomer implements Customer {
    private String name;
    private int age;

    CommercialCustomer(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double calculateLoanAmount(double principalAmount){
        // Calculation for commercial customers (10% interest)
        return principalAmount * 1.10;
    }
}

public class loantest {
    public static void main(String[] args){
        // Example usage
        Customer retailCustomer = new RetailCustomer("John", 35);
        Customer commercialCustomer = new CommercialCustomer("ABC Company", 5);

        double loanAmountForRetail = retailCustomer.calculateLoanAmount(10000);
        double loanAmountForCommercial = commercialCustomer.calculateLoanAmount(10000);

        System.out.println("Loan amount for retail customer: " + loanAmountForRetail);
        System.out.println("Loan amount for commercial customer: " + loanAmountForCommercial);
    }
}

