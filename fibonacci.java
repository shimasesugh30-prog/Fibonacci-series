import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger previous = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;

        while (previous.compareTo(BigInteger.valueOf(100)) <= 0) {
            System.out.print(previous + " ");
            BigInteger next = previous.add(current);
            previous = current;
            current = next;
        }
    }
}