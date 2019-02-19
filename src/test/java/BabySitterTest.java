import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter sitter;
	
	@Before
	public void setUp(){
		sitter = new BabySitter();
	}
	
	@Test
	public void timeConverterTestInput5SholudReturnZero() {
		assertEquals(0,sitter.timeConverter(5));
	}
	
	@Test
	public void timeConverterTestInput1SholudReturn8() {
		assertEquals(8,sitter.timeConverter(1));
	}
	
	@Test
	public void validateWorkHourRangeInput4And2ShouldReturnFalse() {
		assertEquals(false,sitter.validateWorkHourRange(4, 2));
	}
}
