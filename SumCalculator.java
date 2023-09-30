public class SumCalculator {
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int n = 5;
        int result = calculator.calculateSum(n);
        System.out.println("The sum of positive integers from 1 to " + n + " is: " + result);
    }
}
