import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        JSONObject testObject = new JSONObject();
        testObject.put("username","skrrtskrrt81");
        testObject.put("age",2);
        
        
        JSONObject testStats = new JSONObject();
        testStats.put("kills",53);
        testStats.put("deaths",48);
        testStats.put("past_kdrs",1.4,1.6,0.92,3);
        
        testObject.put("stats",testStats);
        testObject.put("alive_well", true,false);
        
        System.out.println(testObject.toString());
    }
}
