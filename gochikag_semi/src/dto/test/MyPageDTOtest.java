/**
 *
 */
package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.MyPageDTO;

/**
 * @author internousdev
 *
 */
public class MyPageDTOtest {

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getDate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetDate8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDate8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setDate(expected);
		String actual = test.getDate();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName1() {
		MyPageDTO test = new MyPageDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName2() {
		MyPageDTO test = new MyPageDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName3() {
		MyPageDTO test = new MyPageDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName4() {
		MyPageDTO test = new MyPageDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName5() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName6() {
		MyPageDTO test = new MyPageDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName7() {
		MyPageDTO test = new MyPageDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName8() {
		MyPageDTO test = new MyPageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.MyPageDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount1() {
		MyPageDTO test = new MyPageDTO();
		int expected = 0;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setStock()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock2() {
		MyPageDTO test = new MyPageDTO();
		int expected = 2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setStock()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock3() {
		MyPageDTO test = new MyPageDTO();
		int expected = -2147483648;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setStock()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock4() {
		MyPageDTO test = new MyPageDTO();
		try {
			int AmountMax = Integer.parseInt("2147483648");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link  dto.MyPageDTO#setStock()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock5() {
		MyPageDTO test = new MyPageDTO();
		try {
			int AmountMax = Integer.parseInt("-2147483649");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link  dto.MyPageDTO#setAmount}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount1() {
		MyPageDTO test = new MyPageDTO();
		int expected = 0;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setAmount}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount2() {
		MyPageDTO test = new MyPageDTO();
		int expected = 2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setAmount}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount3() {
		MyPageDTO test = new MyPageDTO();
		int expected = -2147483648;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.MyPageDTO#setAmount}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount4() {
		MyPageDTO test = new MyPageDTO();
		try {
			int SecurityStockMax = Integer.parseInt("2147483648");
			test.setAmount(SecurityStockMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link  dto.MyPageDTO#setAmount}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount5() {
		MyPageDTO test = new MyPageDTO();
		try {
			int SecurityStockMax = Integer.parseInt("-2147483649");
			test.setAmount(SecurityStockMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
}
