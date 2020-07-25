package pl.sda.javalon4.exceptions;

import java.util.Arrays;

public class ContainsSpecialCharValidator extends ContainsCharacterValidator {

    //33-47, 58-64, 91-96, 123-126
    public ContainsSpecialCharValidator() {
        super("co najmniej jednak znak specjalny",
                composeRange(33, 47,
                                   58, 64,
                                   91, 96,
                                   123, 126));
    }
}
