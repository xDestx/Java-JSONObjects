package com.xdestx.json;

/**
 * A wrapper class for an Array of {@link com.xdest.json.JOk JOk} objects.
 * @author xDestx
 *
 */
class JArray implements JOk {

    private final JOk[] jarr;
    /**
     * Construct an Object with the specified array
     * @param jarr
     */
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
    
    /**
     * Retrieve the array stored by this obejct
     * @return
     */
    public JOk[] getArray() {
        return this.jarr;
    }

}