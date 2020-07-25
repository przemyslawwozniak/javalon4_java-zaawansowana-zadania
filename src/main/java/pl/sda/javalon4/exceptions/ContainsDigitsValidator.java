package pl.sda.javalon4.exceptions;

public class ContainsDigitsValidator extends ContainsCharacterValidator {

    public ContainsDigitsValidator() {
        super("co najmniej jedna cyfra", range(48, 57));
    }
}
