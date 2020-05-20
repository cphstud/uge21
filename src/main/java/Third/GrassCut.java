package Third;

public class GrassCut {
    public double heightRate;

    public GrassCut() {
        this.heightRate = 0.8;
    }

    public int daysToNextCut(double actualHeight, double desiredHeight ) {
        int daysToCut = 0;
        double computedHeight = actualHeight;
        while(computedHeight < desiredHeight) {
            daysToCut++;
            computedHeight += heightRate;
            System.out.println(computedHeight);
        }
        return  daysToCut;
    }
}
