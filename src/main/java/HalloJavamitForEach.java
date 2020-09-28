import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {

    ArrayList<String> list = new ArrayList<>();

    public void forEachoutput(){
        for (String s:list) {
            System.out.println(s);
        }
    }
    public void forEachwithinterface(){
    list.forEach(System.out::println);
    }
}
