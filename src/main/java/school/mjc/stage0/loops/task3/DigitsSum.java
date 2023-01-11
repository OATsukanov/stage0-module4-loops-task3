package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        int tModul = Math.abs(t);
        int sum = 0;
        String tStr = "" + tModul;

        for(int i = 0; i < tStr.length(); i++) {
            int digit = Character.getNumericValue(tStr.charAt(i));
            sum += digit;
        }
        System.out.println(sum);

    }
}
