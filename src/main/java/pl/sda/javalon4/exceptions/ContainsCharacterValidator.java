package pl.sda.javalon4.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContainsCharacterValidator extends AbstractValidator {

    private int[] charNums; //33,34,35

    public ContainsCharacterValidator(String requirement, int[] charNums) {
        super(requirement);
        this.charNums = charNums;
    }
    //charNums={1,2,3}
    //charNums[0] = 1 itd.
    //pswd = 'abc' -> 4,5,6

    //petal glowna nr 1 dla znaku 'a' == 4
    //petla wew 0: 1 == 4, 2 === 4, 3 == 4
    //petal glowna nr 2 'b' == 5
    //petla wew 0: 1==5, 2 == 5, 3 == 5
    @Override
    public boolean validate(String pswd) {
        for(char c : pswd.toCharArray()) {  //1, 2
            int asciiCodeOfChar = Character.getNumericValue(c);
            //quick fix
            for(int id = 0; id < charNums.length; id++) {
                if(charNums[id] == asciiCodeOfChar)
                    return true;
            }
        }
        return false;
    }

    //improvement: uzyc biblioteki lub przeszukac dokkladnie biblioteke standardowa pod katem analogiczniej mozliwosci
    protected static int[] range(int start, int end_incl) {
        int[] arr = new int[end_incl - start + 1];
        for(int num = start, id = 0; num <= end_incl; num++, id++)
            arr[id] = num;
        return arr;
    }

    /**
     * Composes non-equally distributed ranges from given pairs.
     *
     * @param pairs - has to be the multiplication of 2 -> these are pairs
     * @return range composed from pairs
     */
    protected static int[] composeRange(int... pairs) {
        if(pairs.length % 2 != 0)
            throw new IllegalArgumentException("Pairs has to be a multiple of 2!");

        List<Integer> nums = new ArrayList<>();

        for(int start = 0, end = 1; end < pairs.length; start+=2, end+=2) {
            int[] semiRange = range(pairs[start], pairs[end]);
            for(Integer i : semiRange)
                nums.add(i);    //potencjalna optymalizacja: dodac caly array do listy
        }

        //potencjalna optymalizacja: zwrocic bezposrednio z listy
        int[] finalRange = new int[nums.size()];
        for(int id = 0; id < nums.size(); id++)
            finalRange[id] = nums.get(id);

        return finalRange;
    }

}
