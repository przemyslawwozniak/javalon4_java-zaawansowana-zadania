package pl.sda.javalon4.exceptions;

public class ContainsUpperCaseLetterValidator extends ContainsCharacterValidator {

    public ContainsUpperCaseLetterValidator() {
        super("co najmniej jedna wielka litere", range(65, 90));
    }

}
