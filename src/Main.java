import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] noten = {29, 37, 38, 41, 84, 67};
        System.out.println(Arrays.toString(noten));

        int[] ausreichendNoten = NotenBehandlung.getAusreichendNoten(noten);
        System.out.println("Ausreichende Noten:" + Arrays.toString(ausreichendNoten));

        double durchschnitt = NotenBehandlung.berechneNotendurchschnitt(noten);
        System.out.println("Notendurchschnitt: " + durchschnitt);
    }
}
