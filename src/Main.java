import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};
        System.out.println(Arrays.toString(noten));

        //1
        int[] ausreichendNoten = NotenBehandlung.getAusreichendNoten(noten);
        System.out.println("Ausreichende Noten:" + Arrays.toString(ausreichendNoten));

        //2
        double durchschnitt = NotenBehandlung.berechneNotendurchschnitt(noten);
        System.out.println("Notendurchschnitt: " + durchschnitt);

        //3
        int[] runden = NotenBehandlung.getrundeNoten(noten);
        System.out.println("Runde Note: " + Arrays.toString(runden));

        //4
        System.out.println("Maximal Runden Note: " + NotenBehandlung.getMaximalGerundeteNote(runden));


    }
}
