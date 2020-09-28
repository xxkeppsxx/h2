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

    public NumberTester(String fileName) {
        Map<Integer,Integer> numbers = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line = br.readLine();
            numberOfTests = Integer.parseInt(line);
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

    public void setOddevenTester(NumberTest oddTester){
    this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
    this.primeTester = primeTester;
    }
    public void setPalindromeTester(NumberTest palindromeTester){

        
    }
    public void testFile(){

    }
}
