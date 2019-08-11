public class PrintNumberVertically {
    public void print(int number) {
        helper(Math.abs(number));
    }

    public void helper(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            helper(number / 10);
            System.out.println(number % 10);
        }
    }
}
