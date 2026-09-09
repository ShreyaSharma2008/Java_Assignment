class Number {

    private double num;

    Number(double num) {
        this.num = num;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {

        if (num != (int) num) {
            return false;
        }

        return ((int) num) % 2 != 0;
    }

    boolean isEven() {

        if (num != (int) num) {
            return false;
        }

        return ((int) num) % 2 == 0;
    }

    boolean isPrime() {

        if (num != (int) num || num < 2) {
            return false;
        }

        int n = (int) num;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    boolean isAmstrong() {

        if (num != (int) num || num < 0) {
            return false;
        }

        int n = (int) num;
        int temp = n;

        int digits;

        if (n == 0) {
            digits = 1;
        } else {
            digits = String.valueOf(n).length();
        }

        int sum = 0;

        while (temp > 0) {

            int digit = temp % 10;

            sum = sum + (int) Math.pow(digit, digits);

            temp = temp / 10;
        }

        return sum == n;
    }
}

public class Ques7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double value = sc.nextDouble();

        Number n = new Number(value);

        System.out.println("Zero = " + n.isZero());
        System.out.println("Positive = " + n.isPositive());
        System.out.println("Negative = " + n.isNegative());
        System.out.println("Odd = " + n.isOdd());
        System.out.println("Even = " + n.isEven());
        System.out.println("Prime = " + n.isPrime());
        System.out.println("Amstrong = " + n.isAmstrong());
    }
}
