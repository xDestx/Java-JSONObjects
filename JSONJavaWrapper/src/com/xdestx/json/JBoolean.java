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
     * @param b
     */
    public JBoolean(boolean b) {
        this.b = b;
    }
    
    public String toJSONString() {
        return ""+this.b;
    }

    /**
     * Get the boolean value of this object
     * @return
     */
    public boolean getValue() {
        return this.b;
    }
}