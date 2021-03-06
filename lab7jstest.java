import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class lab7jstest extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox3", "http://webtesting.idyll.org/");
		selenium.start();
	}

	@Test
	public void testLab7jstest() throws Exception {
		selenium.open("/");
		selenium.click("link=JavaScript alert box");
		assertEquals("Hi, I'm a JavaScript alert box!", selenium.getAlert());
		selenium.type("num1", "20");
		selenium.type("num2", "150");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
