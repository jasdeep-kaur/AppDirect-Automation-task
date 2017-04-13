package com.apdirect.checker;

import com.appdirect.autotechchallenge.Browser;

public class BrowserCheck {
	public void check(Browser browser)
	{ 
	
		if(browser==null)
		{
			 System.out.println("Browser should return somerthing");
				
		throw new NullPointerException("Null Pointer Exeption");
	    
		}
		else
		{
			System.out.println("Browser checked");
		}
	}
}