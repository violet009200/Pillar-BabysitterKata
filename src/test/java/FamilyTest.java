import static org.junit.Assert.*;

import org.junit.Test;

public class FamilyTest {

	public void shouldReturnFamilyName() {
		Family A = new Family(5,4,"A");
		assertEquals("A",A.getFamilyName());
	}

}
