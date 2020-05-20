package Seventh;

public class Calculator {
    public void calculator(int a, int b) {
        if (a<50 && b<50 && a > 0 && b > 0) {
            System.out.printf("Adding: %d+%d=%d%n",a,b,a+b);
            System.out.printf("Subtracting: %d-%d=%d%n",a,b,a-b);
            System.out.printf("Multiplying: %d*%d=%d%n",a,b,(a*b));
            System.out.printf("Division: %d/%d=%2f%n",a,b,(a/(float)b));
        }
    }
}
