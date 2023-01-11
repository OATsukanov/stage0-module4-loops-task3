package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {

        int f = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            f = f + i;
        }
        System.out.println(f);
    }
}
