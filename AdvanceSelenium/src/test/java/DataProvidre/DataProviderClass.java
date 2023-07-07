package DataProvidre;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass 
{
@DataProvider(name="123")
public Object[] M1() {
	Object [] s= {"java","sql"};
	return s;
}
@Test(dataProvider="123")
public void M2(String s) {
	System.out.println(s);
}

}
