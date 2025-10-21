public class NotenBehandlung {

    public static int[] getAusreichendNoten(int[] noten) {
        int count = 0;
        for (int i = 0; i < noten.length; i++) {
            if (noten[i] < 40) {
                count++;
            }
        }

        int[] ausreichendNoten = new int[count];
        int index = 0;
        for (int i = 0; i < noten.length; i++)
            if (noten[i] < 40) {
                ausreichendNoten[index] = noten[i];
                index++;
            }
        return ausreichendNoten;
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




}
