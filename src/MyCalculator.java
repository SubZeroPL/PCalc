
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyCalculator {
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    String line = br.readLine();
                    if (line.isEmpty())
                        break;
                    StringTokenizer st = new StringTokenizer(line, " ");
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    System.out.println(c.power(a, b));
                } catch (NumberFormatException nfe) {
                    System.out.println("Wrong input:");
                    nfe.printStackTrace();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("Input error");
            e.printStackTrace();
        }
    }

    /**
     * Method to calculate value of n to the power of p.
     *
     * @param n base
     * @param p exponent
     * @return n<sup>p</sup>
     * @throws Exception when n is negative or p is negative or when n and p is zero
     */
    private long power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n or p should not be negative");
        if (n == 0 && p == 0)
            throw new Exception("n and p should not be zero");
        return (long) Math.pow(n, p);
    }
}
