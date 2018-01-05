import java.util.Map;
import java.util.HashMap;

public class JSONObject implements JOk {
    
    private Map<String,JOk> jsonMap;
    
    public JSONObject(Map<String,JOk> objectMap) {
        this.jsonMap = objectMap;
    }
    
    public JSONObject() {
        this.jsonMap = new HashMap<String, JOk>();
    }
    
    //These put methods are for ease of use
    
    public void put(String s, int n) {
        put(s, new JNumber(n));
    }
    
    public void put(String s, double n) {
        put(s, new JNumber(n));
    }
    
    public void put(String s, float n) {
        put(s, new JNumber(n));
    }
    
    public void put(String s, short n) {
        put(s, new JNumber(n));
    }

    public void put(String s, long n) {
        put(s, new JNumber(n));
    }
    
    public void put(String s, Number...n) {
        JOk[] numbers = new JOk[n.length];
        for(int i = 0; i < n.length; i++) {
            numbers[i] = new JNumber(n[i]);
        }
        put(s,numbers);
    }
    
    public void put(String s, boolean...b) {
        JOk[] bools = new JOk[b.length];
        for(int i = 0; i < b.length; i++) {
            bools[i] = new JBoolean(b[i]);
        }
        put(s,bools);
    }
    
    public void put(String s, String...strs) {
        JOk[] jstrings = new JOk[strs.length];
        for(int i = 0; i < jstrings.length; i++) {
            jstrings[i] = new JString(strs[i]);
        }
        put(s,jstrings);
    }
    
    public void put(String s, JOk[] arr) {
        put(s, new JArray(arr));
    }
    
   
    public void put(String s, String str) {
        put(s,new JString(str));
    }
    
    public void put(String s, JString str) {
        jsonMap.put(s,str);
    }
    
     public void put(String s, JArray arr) {
        jsonMap.put(s, arr);
    }
    
    public void put(String s, JBoolean b) {
        jsonMap.put(s,b);
    }
    
    public void put(String s, JNumber n) {
        jsonMap.put(s,n);
    }
    
    public void put(String s, JOk j) {
        jsonMap.put(s,j);
    }
    
    
    
    public Number getNumber(String s) {
        return ((JNumber)jsonMap.get(s)).getValue();
    }
    
    public String getString(String s) {
        return ((JString)jsonMap.get(s)).getValue();
    }
    
    public JOk[] getArray(String s) {
        return ((JArray)jsonMap.get(s)).getArray();
    }
    
    public boolean getBoolean(String s) {
        return ((JBoolean)jsonMap.get(s)).getValue();
    }
    
    public JSONObject getObject(String s) {
        return (JSONObject)jsonMap.get(s);
    }
    
    
    public String toJSONString() {
        String finString = "";
        finString+="{";
        for(String s : jsonMap.keySet()) {
            finString+="\"" + s + "\":"+ jsonMap.get(s).toJSONString() +",";
        }
        finString = finString.substring(0,finString.length()-1);
        finString+="}";
        return finString;
    }
    
    public String toString() {
        return this.toJSONString();
    }
    
}