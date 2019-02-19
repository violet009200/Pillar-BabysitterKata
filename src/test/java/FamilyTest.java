import static org.junit.Assert.*;

import org.junit.Test;

public class FamilyTest {

	@Test
	public void shouldGetFamilyName() {
		Family familyA = new Family(5,4,"A");
		assertEquals("A",familyA.getFamilyName());
	}

}
