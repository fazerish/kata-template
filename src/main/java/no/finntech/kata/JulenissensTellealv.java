package no.finntech.kata;

public final class JulenissensTellealv {

    private static String TALLORD[] = {
            "null", "en", "to", "tre", "fire", "fem", "seks", "syv", "åtte", "ni",
            "ti", "elleve", "tolv", "tretten", "fjorten", "femten", "seksten", "sytten", "atten", "nitten"
    };
    private static String TIERORD[] = {
            "tjue", "tretti", "førti", "femti", "seksti", "sytti", "åtti", "nitti"
    };

    private JulenissensTellealv() { }

    public static int sum(final int... numbersTosum) {
        int result = 0;
        for (int number : numbersTosum) {
            result += number;
        }
        return result;
    }

    public static String somTallord(int i) {

        if(i == Integer.MIN_VALUE) {
            return "minustomilliarderetthundreogførtisyvmillionerfirehundreogåttitretusensekshundreogførtiåtte";
        } else if(i < 0) {
            return "minus" + somTallord(i * -1);
        }

        if(i < 20) {
            return TALLORD[i];
        } else if(i < 100) {
            int tiere = (int) Math.floor(i / 10.0);
            int enere = i - (tiere * 10);
            if(enere == 0) {
                return TIERORD[tiere - 2];
            } else {
                return TIERORD[tiere - 2] + TALLORD[enere];
            }
        } else if (i < 1000) {
            int hundrere = (int) Math.floor(i / 100.0);
            int rest = i - (hundrere * 100);
            String hundreord = TALLORD[hundrere] + "hundre";
            String restord = "";
            if(hundrere == 1) {
                hundreord = "etthundre";
            }
            if(rest > 0) {
                restord = "og" + somTallord(rest);
            }
            return hundreord + restord;
        } else if(i < 1000000) {
            int tusnere = (int) Math.floor(i / 1000.0);
            int rest = i - (tusnere * 1000);
            String tusnerord = somTallord(tusnere) + "tusen";
            if(tusnere == 1) {
                tusnerord = "ettusen";
            }
            if(rest == 0) {
                return tusnerord;
            } else if (rest < 100) {
                return tusnerord + "og" + somTallord(rest);
            } else {
                return tusnerord + somTallord(rest);
            }
        } else if(i < 1000000000) {
            int millionere = (int) Math.floor(i / 1000000.0);
            int rest = i - (millionere * 1000000);
            String millionerord = somTallord(millionere) + "millioner";
            if(millionere == 1) {
                millionerord = "enmillion";
            }
            if(rest == 0) {
                return millionerord;
            } else if (rest < 100) {
                return millionerord + "og" + somTallord(rest);
            } else {
                return millionerord + somTallord(rest);
            }
        } else {
            int milliardere = (int) Math.floor(i / 1000000000.0);
            int rest = i - (milliardere * 1000000000);
            String milliarderord = somTallord(milliardere) + "milliarder";
            if(milliardere == 1) {
                milliarderord = "enmilliard";
            }
            if(rest == 0) {
                return milliarderord;
            } else if (rest < 100) {
                return milliarderord + "og" + somTallord(rest);
            } else {
                return milliarderord + somTallord(rest);
            }
        }

    }
}
