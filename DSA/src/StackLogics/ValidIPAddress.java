package StackLogics;

public class ValidIPAddress {

    static boolean isValidIP(String ip) {

    String [] s= ip.split("\\.");
    if(s.length!=4) {
    	return false;
    }
    for(String ss:s) {
    	if(ss.length()==0) {
    		return false;
    	}
    	if(ss.length()>1&& ss.charAt(0)=='0') {
    		return false;
    		
    	}
    	try {
    		int no=Integer.parseInt(ss);
    		if(no<0||no>255) {
    			return false;
    		}
    	
    	}
    	catch(Exception e) {
    		return false;
    	}
    }
    return true;
    }

    public static void main(String[] args) {

        String ip = "1.0.0.0";

        if (isValidIP(ip)) {
            System.out.println("Valid IP Address");
        } else {
            System.out.println("Invalid IP Address");
        }
    }
}
