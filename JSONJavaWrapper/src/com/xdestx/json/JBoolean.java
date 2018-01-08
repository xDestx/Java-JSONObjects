package com.xdestx.json;

/**
 * A boolean wrapper class.
 * @author xDestx
 *
 */
public class JBoolean implements JOk {

    private final boolean b;
    /**
     * Construct a boolean object
     * @param b The boolean value
     */
    public JBoolean(boolean b) {
        this.b = b;
    }
    
    public String toJSONString() {
        return ""+this.b;
    }

    /**
     * Get the boolean value of this object
     * @return The boolean value
     */
    public boolean getValue() {
        return this.b;
    }
}