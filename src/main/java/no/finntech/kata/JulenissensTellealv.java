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

    public static String somTallord(int tall) {

        if(tall == Integer.MIN_VALUE) {
            return "minustomilliarderetthundreogførtisyvmillionerfirehundreogåttitretusensekshundreogførtiåtte";
        } else if(tall < 0) {
            return "minus" + somTallord(tall * -1);
        }

        if(tall < 20) {
            return TALLORD[tall];
        } else if(tall < 100) {
            int tiere = tall / 10;
            int enere = tall - (tiere * 10);
            if(enere == 0) {
                return TIERORD[tiere - 2];
            } else {
                return TIERORD[tiere - 2] + TALLORD[enere];
            }
        } else if (tall < 1000) {
            return somStortTallord(tall, 100, "hundre", "etthundre");
        } else if(tall < 1000000) {
            return somStortTallord(tall, 1000, "tusen", "ettusen");
        } else if(tall < 1000000000) {
            return somStortTallord(tall, 1000000, "millioner", "enmillion");
        } else {
            return somStortTallord(tall, 1000000000, "milliarder", "enmilliard");
        }

    }

    private static String somStortTallord(int tall, int tallstorrelse, String tallbenevnelseFlertall, String tallbenevnelseEntall) {
        int stortTall = tall / tallstorrelse;
        int rest = tall - (stortTall * tallstorrelse);
        String stortTallord = somTallord(stortTall) + tallbenevnelseFlertall;
        if(stortTall == 1) {
            stortTallord = tallbenevnelseEntall;
        }
        if(rest == 0) {
            return stortTallord;
        } else if (rest < 100) {
            return stortTallord + "og" + somTallord(rest);
        } else {
            return stortTallord + somTallord(rest);
        }
    }
}
