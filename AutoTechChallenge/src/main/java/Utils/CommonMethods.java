package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
public class CommonMethods {
	static WebDriver driver;
	

static List<Integer> containsRandom=new ArrayList<Integer>();



public Properties FileRead(String fileName) throws IOException
{
	FileInputStream fin ;
	fin = new FileInputStream(new File(fileName));
    Properties pr=new Properties();
    pr.load(fin);
    return pr;
    }

public int getUniqueUniqueRandom() {
	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(1000);
	while (containsRandom.contains(randomInt)) {
		randomInt = randomGenerator.nextInt(1000);
	}
	return randomInt;
}
	

//@Test(dependsOnMethods = { "LoadSignUpPage" })
//public void LoadEMailPage() throws IOException {
//	webDriver = (WebDriver) new Mail(webDriver)
//			.mailToUser().
//			isMailNull();
//}


}
