package pl.sda.javalon4.exceptions;

public class ContainsLowerCaseLetterValidator extends ContainsCharacterValidator {

    public ContainsLowerCaseLetterValidator() {
        super("co najmniej jedna mala litere", range(97, 122));
    }
}
