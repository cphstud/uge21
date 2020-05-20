package Third;

import java.util.Scanner;

public class client {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GrassCut grassCut = new GrassCut();
        double actualHeight = sc.nextDouble();
        double desiredHeight = sc.nextDouble();
        int daysToNextCut = grassCut.daysToNextCut(actualHeight,desiredHeight);
        String output = String.format("Efter %d når græsset %2f\n",daysToNextCut,desiredHeight);
        System.out.println(output);
    }
}
