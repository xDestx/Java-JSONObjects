public class JBoolean implements JOk {

    private final boolean b;
    public JBoolean(boolean b) {
        this.b = b;
    }
    
    public String toJSONString() {
        return ""+this.b;
    }

    public boolean getValue() {
        return this.b;
    }
}