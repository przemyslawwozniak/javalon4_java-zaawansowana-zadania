package pl.sda.javalon4.pdf.ex5;

public class Customer {

    private String name;
    private MemberType memberType;

    public Customer(String name) {
        this.name = name;
        memberType = MemberType.NONE;
    }

    public Customer(String name, MemberType memberType) {
        this.name = name;
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", memberType=" + memberType +
                '}';
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public String getName() {
        return name;
    }
}
