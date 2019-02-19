import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	private BabySitter sitter;
	private BabySitter s;
	
	@Before
	public void setUp(){
		sitter = new BabySitter();
		s = new BabySitter(11,4);
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
	
	@Test
	public void validateWorkHourRangeInput2And9ShouldReturnFalse() {
		assertEquals(false,sitter.validateWorkHourRange(2, 9));
	}
	
	@Test
	public void validateWorkHourRangeInput6And3ShouldReturnTrue() {
		assertEquals(true,sitter.validateWorkHourRange(6, 3));
	}
	
	@Test
	public void getHourRangeInput5And11ShouldReturn6() {
		assertEquals(6,sitter.getHourRange(5, 11));
	}
	
	@Test
	public void getPartialPaymentInput5And11And15ShouldReturn90() {
		assertEquals(90,sitter.getPartialPayment(5, 11, 15));
	}
	
	@Test
	public void getPartialPaymentInput12And4And16ShouldReturn90() {
		assertEquals(64,sitter.getPartialPayment(12, 4, 16));
	}
	
	@Test
	public void shouldReturnConvertedStartTime() {
		
		assertEquals(6,s.getStartTime());
	}
	
	@Test
	public void shouldReturnConvertedFinishTime() {
		assertEquals(11,s.getFinishTime());
	}
	
	@Test
	public void shouldReturnAvailable() {
		assertEquals(true,s.getAvailability());
	}
	
	@Test
	public void shouldgetTotalPayment() {
		
		assertEquals(s.getPartialPayment(11, 4, 20),s.getTotalPay());
	}
	
	
	@Test
	public void testForFamilyA() {
		BabySitter familyA = new BabySitter(5,4);
		familyA.getPartialPayment(5, 11, 15);
		familyA.getPartialPayment(11, 4, 20);
		assertEquals(190,familyA.getTotalPay());
	}
	
	@Test
	public void testForFamilyB() {
		BabySitter familyB = new BabySitter(5,4);
		familyB.getPartialPayment(5, 10, 12);
		familyB.getPartialPayment(10, 12, 8);
		familyB.getPartialPayment(12, 4, 16);
		assertEquals(140,familyB.getTotalPay());
	}
	
	@Test
	public void testForFamilyC() {
		BabySitter familyC = new BabySitter(5,4);
		familyC.getPartialPayment(5, 9, 21);
		familyC.getPartialPayment(9, 4, 15);
		assertEquals(189,familyC.getTotalPay());
	}
	
}
