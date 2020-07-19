package pl.sda.javalon4.oop;

public enum MemberType {
    NONE(0, 0),
    SILVER(0.1, 0.1),
    GOLD(0.15, 0.1),
    PLATINUM(0.2, 0.1);

    private double serviceDiscount, productDiscount;

    MemberType(double serviceDiscount, double productDiscount) {
        this.serviceDiscount = serviceDiscount;
        this.productDiscount = productDiscount;
    }

    public double getServiceDiscount() {
        return serviceDiscount;
    }

    public double getProductDiscount() {
        return productDiscount;
    }
}
