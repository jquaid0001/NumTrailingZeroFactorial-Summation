public class NumZerosFactorial {

    public static int zeros(int n) {

        // No need to do anything with this just return zero
        if (n == 0) { return 0; }

        // Get the result of log5 of n
        double kMax = Math.floor(Math.log(n) / Math.log(5));

        double numTrailingZeros = 0;
        for (int k = 1; k <= kMax; k++) {
            numTrailingZeros += Math.floor(n/Math.pow(5.0, k));
        }

        return (int) numTrailingZeros;
    }
}