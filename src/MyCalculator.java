public class MyCalculator {
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();
        System.out.println(c.power(1, 1));
    }

    /**
     * Method to calculate value of n to the power of p.
     *
     * @param n base
     * @param p exponent
     * @return n<sup>p</sup>
     */
    private long power(int n, int p) {
        return (long) Math.pow(n, p);
    }
}
