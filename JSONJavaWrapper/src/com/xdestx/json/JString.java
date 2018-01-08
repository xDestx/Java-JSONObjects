package com.xdestx.json;

/**
 * A String wrapper class
 * @author xDestx
 *
 */
public class JString implements JOk {
    private final String jstr;
    /**
     * Construct a JString object with the specified String
     * @param s The String
     */
    public JString(String s) {
        this.jstr = s;
    }
    public String toJSONString() {
        return "\""+jstr+"\"";
    }
    
    /**
     * Retrieve the String value of this object
     * @return The String
     */
    public String getValue() {
        return this.jstr;
    }
}
