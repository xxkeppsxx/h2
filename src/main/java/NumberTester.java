import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberTester {
    int numberOfTests;
    Map<Integer, Integer> numbers = new HashMap<>();


    public NumberTester(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] splitted = line.split(" ");
                numbers.put(Integer.parseInt(splitted[1]), Integer.parseInt(splitted[0]));
                line = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public void setOddevenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        for (int i : numbers.keySet()) {
            if (i == 1) {
                if (oddTester.testNumber(numbers.get(i))) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("UNEVEN");
                }
            } else if (i == 2) {
                if (primeTester.testNumber(numbers.get(i))) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("NOTPRIME");
                }
            } else if (i == 3) {
                if(palindromeTester.testNumber(numbers.get(i))) {
                    System.out.println("PALINDROME");
                }else{
                    System.out.println("NON PALINDROME");
                }
            }else{
                System.out.println("ERROR");
            }
        }
    }
}
