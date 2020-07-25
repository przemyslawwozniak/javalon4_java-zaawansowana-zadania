package pl.sda.javalon4.exceptions;

public class LenghtValidator extends AbstractValidator {

    private final int len;

    public LenghtValidator(int len) {
        super("co najmniej " + len + " znaków");
        this.len = len;
    }

    @Override
    public boolean validate(String pswd) {
        return pswd.length() >= len;
    }
}
