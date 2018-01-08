package com.xdestx.json;

public class JString implements JOk {
    private final String jstr;
    public JString(String s) {
        this.jstr = s;
    }
    public String toJSONString() {
        return "\""+jstr+"\"";
    }
    
    public String getValue() {
        return this.jstr;
    }
}
