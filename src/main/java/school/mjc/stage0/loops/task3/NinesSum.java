package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        String strNines = "";

        for (int i = 0; i < lengthOfLastNumber; i++) {
            strNines += "9";
        }

        int sum = 0;
        for (int i = 0; i < strNines.length(); i++) {

            String nines = strNines.substring(i);
            int digit = Integer.parseInt(nines);
            sum += digit;
        }

        System.out.println(sum);
    }

}
