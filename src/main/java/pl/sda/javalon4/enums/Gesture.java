package pl.sda.javalon4.enums;

public enum Gesture {
    PAPPER {
        @Override
        public GameResult play(Gesture another) {
            switch(another) {
                case SCISSORS:
                    return GameResult.LOOSE;
                case ROCK:
                    return GameResult.WIN;
                case PAPPER:
                    return GameResult.DRAW;
                default:
                    return GameResult.DRAW;
            }
        }
    },
    ROCK {
        @Override
        public GameResult play(Gesture another) {
            switch(another) {
                case SCISSORS:
                    return GameResult.WIN;
                case ROCK:
                    return GameResult.DRAW;
                case PAPPER:
                    return GameResult.LOOSE;
                default:
                    return GameResult.DRAW;
            }
        }
    },
    SCISSORS {
        @Override
        public GameResult play(Gesture another) {
            switch(another) {
                case SCISSORS:
                    return GameResult.DRAW;
                case ROCK:
                    return GameResult.LOOSE;
                case PAPPER:
                    return GameResult.WIN;
                default:
                    return GameResult.DRAW;
            }
        }
    };

    public abstract GameResult play(Gesture another);

    //int -> gesture
    public static Gesture from(int digit) {
        Gesture gesture;

        if(digit >= 0 && digit < 3)
            gesture = Gesture.values()[digit];
        else {
            System.out.println("Wybrano cyfre spoza zakresu 0...2 - zwracam PAPPER");
            gesture = PAPPER;
        }

        System.out.println("Wybrany gest: " + gesture.name());
        return gesture;
    }
}
