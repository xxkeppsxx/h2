public class Main {
    public static void main(String[] args) {
        NumberTester tester = new NumberTester("data");
        tester.setOddevenTester((number) -> (number %2) ==0);
    }
}
