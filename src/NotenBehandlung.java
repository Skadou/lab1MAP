public class NotenBehandlung {

    public static int[] getAusreichendNoten(int[] noten) {
        int count = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 40) {
                count++;
            }
        }

        int[] nichtausreichendNoten = new int[count];
        int index = 0;
        for (int i = 0; i < noten.length; i++)
            if (noten[i] < 40) {
                nichtausreichendNoten[index] = noten[i];
                index++;
            }
        return nichtausreichendNoten;
    }




    public static double berechneNotendurchschnitt(int[] noten) {
        if (noten.length == 0) {
            return 0;
        }
        int summe = 0;
        for (int note : noten) {
            summe += note;
        }
        return (double) summe / noten.length;
    }

    private static int rundeNote(int note) {
        if (note < 38) {
            return note;
        }

        int rest = note % 5;

        if (rest >= 3) {
            return note + (5 - rest);
        } else {
            return note;
        }
    }

    public static int[] getrundeNoten(int[] noten) {
        int[] gerundeteNoten = new int[noten.length];
        for (int i = 0; i < noten.length; i++) {
            gerundeteNoten[i] = rundeNote(noten[i]);
        }
        return gerundeteNoten;
    }

    public static int getMaximalGerundeteNote(int[] noten) {
        int[] gerundete = getrundeNoten(noten);
        if (gerundete.length == 0) {
            return -1;
        }
        int maxNote = 0;
        for (int i = 0; i < gerundete.length; i++) {
            if (maxNote < gerundete[i]) {
                maxNote = gerundete[i];
            }
        }
        return maxNote;
    }

}
