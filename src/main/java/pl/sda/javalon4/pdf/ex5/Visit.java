package pl.sda.javalon4.pdf.ex5;

public class Visit {

    private Customer customer;
    private int productExpense, serviceExpense;

    public Visit(Customer customer) {
        this.customer = customer;
    }

    public Visit(Customer customer, int productExpense, int serviceExpense) {
        this.customer = customer;
        this.productExpense = productExpense;
        this.serviceExpense = serviceExpense;
    }

    public int calcServiceExpense() {
        return (int) (serviceExpense * (1 - customer.getMemberType().getServiceDiscount()));
    }

    public int calcProductExpense() {
        return (int) (productExpense * (1 - customer.getMemberType().getProductDiscount()));
    }

    public int calcTotalExpense() {
        return calcServiceExpense() + calcProductExpense();
    }

    public void printRecipe() {
        System.out.printf("Klient: %s, %s member\n\nWartość usług przed rabatem: %d\nWartość produktów przed rabatem: %d\n\n" +
                        "Wartość usług po rabacie: %d\nWartość produktów po rabacie: %d\n\n" +
                        "SUMA: %d\n\n\n",
                customer.getName(), customer.getMemberType().name(),
                serviceExpense, productExpense,
                calcServiceExpense(), calcProductExpense(),
                calcTotalExpense());
    }

    public void setProductExpense(int productExpense) {
        this.productExpense = productExpense;
    }

    public void setServiceExpense(int serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
}
