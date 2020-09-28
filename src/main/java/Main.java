public class Main {
    public static void main(String[] args) {
        NumberTester tester = new NumberTester("data");
        tester.setOddevenTester((number) -> (number %2) ==0);
        tester.setPrimeTester(number ->{
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        });
    }
}
