package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
private List<String>  friends;
private Map<String, Integer> fess;
private Properties prop;


public Properties getProp() {
	return prop;
}

public void setProp(Properties prop) {
	this.prop = prop;
}

public Map<String, Integer> getFess() {
	return fess;
}

public void setFess(Map<String, Integer> fess) {
	this.fess = fess;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", fess=" + fess + ", prop=" + prop + "]";
}


}
