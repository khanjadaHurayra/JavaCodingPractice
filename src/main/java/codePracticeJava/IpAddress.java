package codePracticeJava;

import java.net.InetAddress;

public class IpAddress {
	
	public static void main(String args[]) throws Exception
	
	{
	System.out.println(InetAddress.getLocalHost());
	System.out.println(InetAddress.getByName(null));
	}

}
