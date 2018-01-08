package com.xdestx.json;

import java.util.Map;
import java.util.HashMap;

/**
 * JSON Object Wrapper class
 * 
 * @author xDestx
 *
 */
public class JSONObject implements JOk {

	private Map<String, JOk> jsonMap;

	/**
	 * Construct a JSON Object with the specified attributes
	 * 
	 * @param objectMap A Map of Strings with JOk objects attached
	 */
	public JSONObject(Map<String, JOk> objectMap) {
		this.jsonMap = objectMap;
	}

	/**
	 * Create an empty JSON Object
	 */
	public JSONObject() {
		this.jsonMap = new HashMap<String, JOk>();
	}

	// These put methods are for ease of use

	/**
	 * Map a Number to the Key s (Overwrites)
	 * 
	 * @param s
	 *            The key
	 * @param n
	 *            The number
	 */
	public void put(String s, int n) {
		put(s, new JNumber(n));
	}

	/**
	 * Map a Number to the Key s (Overwrites)
	 * 
	 * @param s
	 *            The key
	 * @param n
	 *            The number
	 */
	public void put(String s, double n) {
		put(s, new JNumber(n));
	}

	/**
	 * Map a Number to the Key s (Overwrites)
	 * 
	 * @param s
	 *            The key
	 * @param n
	 *            The number
	 */
	public void put(String s, float n) {
		put(s, new JNumber(n));
	}

	/**
	 * Map a Number to the Key s (Overwrites)
	 * 
	 * @param s
	 *            The key
	 * @param n
	 *            The number
	 */
	public void put(String s, short n) {
		put(s, new JNumber(n));
	}

	/**
	 * Map a Number to the Key s (Overwrites)
	 * 
	 * @param s
	 *            The key
	 * @param n
	 *            The number
	 */
	public void put(String s, long n) {
		put(s, new JNumber(n));
	}

	/**
	 * Map Numbers to the Key s (Overwrites)
	 * 
	 * @param s
	 *            The key
	 * @param n
	 *            The number
	 */
	public void put(String s, Number... n) {
		JOk[] numbers = new JOk[n.length];
		for (int i = 0; i < n.length; i++) {
			numbers[i] = new JNumber(n[i]);
		}
		put(s, numbers);
	}

	/**
	 * Map (a) Boolean(s) to the Key s (Overwrites)
	 * 
	 * @param s
	 *            The key
	 * @param b
	 *            The boolean(s)
	 */
	public void put(String s, boolean... b) {
		JOk[] bools = new JOk[b.length];
		for (int i = 0; i < b.length; i++) {
			bools[i] = new JBoolean(b[i]);
		}
		put(s, bools);
	}

	/**
	 * Map Strings to the Key s
	 * 
	 * @param s
	 *            The key
	 * @param strs
	 *            The strings
	 */
	public void put(String s, String... strs) {
		JOk[] jstrings = new JOk[strs.length];
		for (int i = 0; i < jstrings.length; i++) {
			jstrings[i] = new JString(strs[i]);
		}
		put(s, jstrings);
	}

	/**
	 * Map an array of JSONObject accepted objects to a String
	 * 
	 * @param s
	 *            The key
	 * @param arr
	 *            The JOk array
	 */
	public void put(String s, JOk[] arr) {
		put(s, new JArray(arr));
	}

	/**
	 * Map a String to a String
	 * 
	 * @param s
	 *            The key
	 * @param str
	 *            The String
	 */
	public void put(String s, String str) {
		put(s, new JString(str));
	}

	/**
	 * Map a String to a String
	 * 
	 * @param s
	 *            The key
	 * @param str
	 *            The String
	 */
	public void put(String s, JString str) {
		jsonMap.put(s, str);
	}

	/**
	 * Map an Array to a String
	 * 
	 * @param s
	 *            The key
	 * @param arr
	 *            The Array
	 */
	public void put(String s, JArray arr) {
		jsonMap.put(s, arr);
	}

	/**
	 * Map a boolean to a String
	 * @param s The key
	 * @param b The boolean
	 */
	public void put(String s, JBoolean b) {
		jsonMap.put(s, b);
	}

	/**
	 * Map a Number to a String
	 * @param s The key
	 * @param n The number
	 */
	public void put(String s, JNumber n) {
		jsonMap.put(s, n);
	}

	/**
	 * Map an unknown accepted object to a String
	 * @param s The key
	 * @param j The object
	 */
	public void put(String s, JOk j) {
		jsonMap.put(s, j);
	}

	/**
	 * Retrieve a Number from the Key. An exception will occur if the type does not match.
	 * @param s The key
	 * @return The number if it exists, or null otherwise
	 */
	public Number getNumber(String s) {
		return ((JNumber) jsonMap.get(s)).getValue();
	}

	/**
	 * Retrieve a String from the Key. An exception will occur if the type does not match.
	 * @param s The key
	 * @return The String, if it exists. Null otherwise
	 */
	public String getString(String s) {
		return ((JString) jsonMap.get(s)).getValue();
	}

	/**
	 * Retrieve an array from the Key. An exception will occur if the type does not match.
	 * @param s The key
	 * @return The Array if it exists, null otherwise.
	 */
	public JOk[] getArray(String s) {
		return ((JArray) jsonMap.get(s)).getArray();
	}

	/**
	 * Retrieve a boolean from the Key. An exception will occur if the type does not match.
	 * @param s The key
	 * @return A boolean
	 */
	public boolean getBoolean(String s) {
		return ((JBoolean) jsonMap.get(s)).getValue();
	}

	/**
	 * Retrieve a JSONObject from the key. An exception will occur if the type does not match.
	 * @param s The key
	 * @return A JSONObject, null otherwise.
	 */
	public JSONObject getObject(String s) {
		return (JSONObject) jsonMap.get(s);
	}

	public String toJSONString() {
		String finString = "";
		finString += "{";
		for (String s : jsonMap.keySet()) {
			finString += "\"" + s + "\":" + jsonMap.get(s).toJSONString() + ",";
		}
		finString = finString.substring(0, finString.length() - 1);
		finString += "}";
		return finString;
	}

	/**
	 * Returns {@link JOk#toJSONString}
	 */
	public String toString() {
		return this.toJSONString();
	}

}