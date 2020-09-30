import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberTester {

    ArrayList<Operation> list = new ArrayList<>();


    public NumberTester(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = br.readLine();
            line = br.readLine();
            while (line != null ) {
                if(!line.isEmpty()){
                    String[] splitted = line.split(" ");
                    Operation op = new Operation(Integer.parseInt(splitted[0]), Integer.parseInt(splitted[1]));
                    list.add(op);
                    line = br.readLine();
                }

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
        for ( Operation op: list) {
            if (op.n1 == 1) {
                if (oddTester.testNumber(op.n2)) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("UNEVEN");
                }
            } else if (op.n1 == 2) {
                if (primeTester.testNumber(op.n2)) {
                    System.out.println("PRIME");
                } else {
                    System.out.println("NOTPRIME");
                }
            } else if (op.n1== 3) {
                if(palindromeTester.testNumber(op.n2)) {
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
