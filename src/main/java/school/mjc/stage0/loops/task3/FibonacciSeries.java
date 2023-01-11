package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

/*        int firstFib = 0;
        System.out.println(firstFib);
        int secondFib = 1;
        System.out.println(secondFib);
        int fib = 1;
        System.out.println(fib);
        for (int i = 4; i <= lastFibonacci; i++) {

            firstFib = secondFib;
            secondFib = fib;
            fib = firstFib + secondFib;

            System.out.println(fib);*/

        int firstFib = 0;
        int secondFib = 1;
        for (int i = 0; i < lastFibonacci; i++) {

            System.out.println(firstFib);
            int fib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = fib;


        }

    }
}
