package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int gcd = 0;

        for (int i = 1; i <= first || i <= second; i++) {

            int f = 0;
            f = (first%i == 0 && second%i == 0)? i: 0;

            if (f != 0) gcd = f;

        }

        System.out.println(gcd);

    }
}
