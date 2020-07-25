package pl.sda.javalon4.exceptions;

public abstract class AbstractValidator {

    private final String requirement;

    public AbstractValidator(String requirement) {
        this.requirement = requirement;
    }

    public abstract boolean validate(String pswd);

    public void printValidateIssue() {
        System.out.println("Podane hasło nie spełnia warunku walidacji: " + requirement);
    }

    public String getRequirement() {
        return requirement;
    }
}
