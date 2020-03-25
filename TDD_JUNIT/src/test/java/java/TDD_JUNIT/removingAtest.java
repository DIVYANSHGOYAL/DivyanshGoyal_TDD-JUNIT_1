package java.TDD_JUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removingAtest {
	/*
	 * TO-DO LIST
	 * 1. “ABCD” => “BCD” 
	 * 2. “AACD” => “CD”  
	 * 3. “BACD” => “BCD” 
	 * 4. “BBAA” => “BBAA” 
	 * 5. “AABAA” => “BAA” 
	 * 6. "A" => ""
	 * 7. "AA" => ""
	 * 8. "PQRS" => "PQRS"
	 * 9. "" => ""
	 */
	
	removefirst2A Removefirst2A;
	@BeforeEach
	void setup() {
		Removefirst2A = new removefirst2A();
	}

	@Test
	void test2A_test1() {
		assertEquals("BCD",Removefirst2A.remove("ABCD"));
	}
	
	@Test
	void test2A_test2() {
		assertEquals("CD",Removefirst2A.remove("AACD"));
	}
	
	@Test
	void test2A_test3() {
		assertEquals("BCD",Removefirst2A.remove("BACD"));
	}
	
	@Test
	void test2A_test4() {
		assertEquals("BBAA",Removefirst2A.remove("BBAA"));
	}
	
	@Test
	void test2A_test5() {
		assertEquals("BAA",Removefirst2A.remove("AABAA"));
	}
	
	@Test
	void test2A_test6() {
		assertEquals("",Removefirst2A.remove("A"));
	}
	
	@Test
	void test2A_test7() {
		assertEquals("",Removefirst2A.remove("AA"));
	}
	
	@Test
	void test2A_test8() {
		assertEquals("PQRS",Removefirst2A.remove("PQRS"));
	}
	
	@Test
	void test2A_test9() {
		assertEquals("",Removefirst2A.remove(""));
	}

}
