public class JNumber implements JOk {

    private final double d;
    
    public JNumber(double d) {
        this.d = d;
    }
    
    public JNumber(Number n) {
        this.d = n.doubleValue();
    }
    
    public JNumber(int n) {
        this.d = (double)n;
    }
    
    public JNumber(float n) {
        this.d = (double)n;
    }
    
    public JNumber(short n) {
        this.d = (double)n;
    }
    
    public JNumber(long n) {
        this.d = (double)n;
    }
    
    public String toJSONString() {
        return ""+d;
    }
    
    public double getValue() {
        return this.d;
    }

}