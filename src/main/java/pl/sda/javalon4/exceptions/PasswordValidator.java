package pl.sda.javalon4.exceptions;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        System.out.println("Prosze wprowadzic haslo. Wymagania: ");
        AbstractValidator[] validators = {new LenghtValidator(8),
                                            new ContainsDigitsValidator(),
                                            new ContainsLowerCaseLetterValidator(),
                                            new ContainsUpperCaseLetterValidator(),
                                            new ContainsSpecialCharValidator()};
        for(AbstractValidator av : validators)
            System.out.println("* " + av.getRequirement());

        boolean isPswdValid = false;
        do {
            System.out.println("Podaj Twoje haslo: ");
            Scanner sc = new Scanner(System.in);
            String pswd = sc.nextLine();

            int validatorsPassed = 0;
            for(AbstractValidator av : validators) {
                if(av.validate(pswd) == false) {
                    av.printValidateIssue();
                    isPswdValid = false;
                    break;
                }
                else {
                    validatorsPassed++;
                }
            }

            if(validatorsPassed == validators.length) {
                System.out.println("Wprowadzono prawidlowe haslo");
                isPswdValid = true;
            }
        }
        while(!isPswdValid);

    }

}
