package pl.sda.javalon4.enums;

import java.util.Scanner;

public class GameRunner {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char c = 'Y';
        do {
            //User
            int userInt = userInput();
            Gesture userGesture = Gesture.from(userInt);

            //PC
            //Math.random = <0, 1)
            int pcInt = (int)(Math.random() * 3);   //0...2
            Gesture pcGesture = Gesture.from(pcInt);

            //porowananie gestow
            GameResult gr = userGesture.play(pcGesture);
            System.out.println("Wynik gry: " + gr.name());

            System.out.println("Czy grasz dalej? [Y/n]");
            sc.nextLine();  //clears 'buffer' of Scanner
            c = sc.nextLine().charAt(0);
        }
        while(c != 'n');
    }

    private static int userInput() {
        System.out.println("Jaki gest wybierasz?\n0 - PAPPER\n1 - ROCK\n2 - SCISSORS\n");

        int userInt;

        do {
            System.out.println("Wprowadz cyfre: 0, 1 lub 2.");
            userInt = sc.nextInt();
        }
        while(userInt < 0 || userInt > 3);

        return userInt;
    }

}
