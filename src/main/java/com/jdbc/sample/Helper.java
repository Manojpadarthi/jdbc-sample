package com.jdbc.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper 
{
	public String isOk(){
	System.out.println("enter yes or no");
    
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	 
	 try {
	return br.readLine().toString();
	} 
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return "no";
	}
	
	public void fun(int i, int j,int k)
	{
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	
	
}
