

Name of the project:AutoTechChallenge

This is a Selnium Based Project. We can run it by testNG and Maven.

How to run this Project:
1.we can run this by Appdirect.java based on TestNg
2.or with the help of maven 

In this project ,we have two packages src/main/java and src/test/java
1.In src/main/java pacakge :which further contains five packages:

		1.com.apdirect.checker
		2.com.appdirect.autotechchallenge
		3.com.appdirect.pages
		4.ExceptionHandling
		5.Utils
		
		In com.appdirect.pages:
		we have the java classes for each webpage.
		1.Homapge
		2.LoginPage
		3.SignUpPage
		4.EmailValid
		
		In the Checker Package :
		we have all the java classes which checks the classs present in com.appdirect.pages packages
		1.Browser checker
		2.HomePage Checker
		3.LoginPage Checker
		4.SignOrLog checker
		
		in com.appdirect.autotechchallenge pacakge:
		we have the option of the browser: and it loads the browser:
		Browser.java
		
		In Exceptionhandling:
		we handleed the exception.
		
		Utils:
		we have the methods which are commonly used .
		
		
2.In src/test/java Package:which contains the test cases:
1.AppdirectTest Case:run all the test cases
2.LoadDriver Case:for loading and closing the browser

3.We have the folder named Properties which contains all the properties files used in the classes. 