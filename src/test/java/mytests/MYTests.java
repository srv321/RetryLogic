package mytests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MYTests {
//	at test level
//	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
//	public void Test1() {
//		Assert.assertEquals(false, true);
//	}
//	
//	@Test
//	public void Test2() {
//		Assert.assertEquals(false, true);
//	}
	

	//At runtime
	@Test()
	public void Test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3() {
		Assert.assertEquals(true, true);
	}

}
