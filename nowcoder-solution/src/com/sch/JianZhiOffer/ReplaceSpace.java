package com.sch.JianZhiOffer;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == ' ') {
    			str.deleteCharAt(i);
    			str.insert(i, "%20");
    			i += 2;
    		}
    	}
    	return str.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBuffer = new StringBuffer("We Are Happy ");
		ReplaceSpace rs = new ReplaceSpace();
		System.out.println(rs.replaceSpace(strBuffer));
	}

}
