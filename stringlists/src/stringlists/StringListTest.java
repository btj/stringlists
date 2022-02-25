package stringlists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringListTest {

	@Test
	void test() {
		String[] myStrings = {"Hello, ", "world!"};
		StringList myStringList = new StringList(myStrings);
		
		assertEquals("Hello, ", myStrings[0]);
		
		myStringList.set(0, "Bye, ");
		
		assertEquals("Hello, ", myStrings[0]);
	}

}
