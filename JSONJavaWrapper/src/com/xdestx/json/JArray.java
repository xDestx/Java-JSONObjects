package com.xdestx.json;

class JArray implements JOk {

    private final JOk[] jarr;

    public JArray(JOk[] jarr) {
        this.jarr = jarr;
    }

    public String toJSONString() {
        String jsonString = "";
        jsonString+='[';
        for(int i = 0; i < jarr.length-1; i++) {
            jsonString+=jarr[i].toJSONString() + ",";
        }
        jsonString+=jarr[jarr.length-1].toJSONString();
        jsonString+="]";
        return jsonString;
    }
    
    public JOk[] getArray() {
        return this.jarr;
    }

}