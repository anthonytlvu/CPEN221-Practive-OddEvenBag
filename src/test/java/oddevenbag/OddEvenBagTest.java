package oddevenbag;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenBagTest {

	@Test
	public void test1() {
		OddEvenBag oeb = new OddEvenBag();
		oeb.add(10);
		assertTrue(oeb.contains(10));
		assertEquals(10, oeb.sum());
	}

	@Test
	public void test2() {
		OddEvenBag oeb = new OddEvenBag(new int[] { 1, 3, 5, 2, 4, 6 });
		assertTrue(oeb.contains(5));
		assertEquals(21, oeb.sum());
	}

	@Test
	public void test3() {
		OddEvenBag oeb = new OddEvenBag(new int[] { 1, 3, 5, 2, 4, 6 });
		oeb.increment();
		assertEquals(27, oeb.sum());
	}

	@Test
	public void test4() {
		OddEvenBag oeb = new OddEvenBag(new int[] { 1, 3, 5, 2, 4, 6 });
		oeb.decrement();
		assertEquals(15, oeb.sum());
	}

	@Test
	public void test5() {
		OddEvenBag oeb1 = new OddEvenBag(new int[] { 1, 3, 5, 2, 4, 6 });
		OddEvenBag oeb2 = new OddEvenBag(new int[] { 12, 14, 18, 3, 9, 11 });
		assertNotEquals(oeb1, oeb2);
		assertNotEquals(oeb2, oeb1);
		assertNotEquals(oeb1.hashCode(), oeb2.hashCode());
	}

	@Test
	public void test7() {
		OddEvenBag oeb1 = new OddEvenBag(new int[] { 1, 3, 5, 2, 4, 6 });
		OddEvenBag oeb2 = new OddEvenBag(new int[] { 1, 3, 6, 2, 4, 6 });
		assertTrue(!oeb1.equals(oeb2));
		assertTrue(!oeb2.equals(oeb1));
	}

	@Test
	public void test8() {
		OddEvenBag oeb1 = new OddEvenBag(new int[] { 1, 3, 5, 2, 4, 6, 8 });
		OddEvenBag oeb2 = new OddEvenBag(new int[] { 1, 3, 7, 2, 4, 6, 10 });
		oeb1.increment();
		assertTrue(!oeb1.equals(oeb2));
		assertTrue(!oeb2.equals(oeb1));
	}
	
	@Test
	public void test9() {
		OddEvenBag oeb = new OddEvenBag();
		String s = "abc";
		assertTrue(!oeb.equals(s));
	}

	@Test
	public void test10() {
		OddEvenBag oeb = new OddEvenBag(new int[] { 5, 1, 3, 5, 2, 4, 6, 5, 5 });
		oeb.remove(5);
		assertFalse(oeb.contains(5));
		assertEquals(16, oeb.sum());
	}

	@Test
	public void test11() {
		OddEvenBag oeb = new OddEvenBag(new int[] { 5, 1, 3, 5, 2, 4, 6, 5, 5 });
		assertEquals(4 , oeb.getCount(5));
	}
}
