package callduration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Mobilenumber
{
	private long mobile;
	private String duration;
	
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getDuration() {
		return duration;
	}
	public String setDuration(String duration) {
		this.duration = duration;
		return null;
	}
	
	
}

public class Callduration {

	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		Mobilenumber mn=new Mobilenumber();
		System.out.println("enter the mobile number");
		Scanner sc=new Scanner(System.in);
		mn.setMobile(sc.nextLong());
		int val;
		System.out.println("enter the number of callers");
		val=sc.nextInt();
		for(int i=1;i<=val;i++)
		{
			System.out.println("call duration for caller: "+i);
			String dur=sc.next();
		//	l.add(mn.setDuration(dur));
			l.add(dur);
		}
		Collections.sort(l);
		
		for(int j=0;j<l.size();j++)
		{
			System.out.println(l.get(j));
		}
		sc.close();
			
		
	
		

	}

}
