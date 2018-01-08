package com.xdestx.json;

/**
 * A Number wrapper. All numbers are converted to a double.
 * @author xDestx
 *
 */
public class JNumber implements JOk {

    private final double d;
    
    /**
     * Construct a number using a double
     * @param d the number
     */
    public JNumber(double d) {
        this.d = d;
    }
    
    /**
     * Construct a number using {@link java.lang.Number}
     * @param n
     */
    public JNumber(Number n) {
        this.d = n.doubleValue();
    }
    
    /**
     * Construct a number using an int
     * @param n
     */
    public JNumber(int n) {
        this.d = (double)n;
    }
    
    /**
     * Construct a number using a float
     * @param n
     */
    public JNumber(float n) {
        this.d = (double)n;
    }
    
    /**
     * Constructa number using a short
     * @param n
     */
    public JNumber(short n) {
        this.d = (double)n;
    }
    
    /**
     * Construct a number using a long (Converted to a double, use caution)
     * @param n
     */
    public JNumber(long n) {
        this.d = (double)n;
    }
    
    
    public String toJSONString() {
        return ""+d;
    }
    
    /**
     * Retrieve the value of this number
     * @return the double value
     */
    public double getValue() {
        return this.d;
    }

}