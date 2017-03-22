/**
 *
 */
package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.CreditConfirmDTO;

/**
 * @author internousdev
 *
 */
public class CreditConfirmDTOtest {

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId1() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = null;

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = " ";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "　";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId6() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId7() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginId8() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId1() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = null;

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = " ";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "　";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId6() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId7() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetLoginId8() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getLoginId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE1() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = null;

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getNameE()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getNameE()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = " ";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getNameE()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "　";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getNameE()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getNameE()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE6() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getNameE()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE7() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#getNameE()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE8() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE1() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = null;

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setLoginId(java.lang.String)}}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = " ";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setNameE(java.lang.String)}}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "　";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE6() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE7() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123あいう１２３";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.test.dto.CreditConfirmDTO#setNameE(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testsetNameE8() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getSecurityCode()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		int expected = 0;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		int expected = 2147483647;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		int expected = -2147483648;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		try {
			int SecurityCodeMax = Integer.parseInt("2147483648");
			test.setSecurityCode(SecurityCodeMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetStock5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		try {
			int SecurityCodeMax = Integer.parseInt("-2147483649");
			test.setSecurityCode(SecurityCodeMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode1() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		int expected = 0;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		int expected = 2147483647;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		int expected = -2147483648;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		try {
			int SecurityStockMax = Integer.parseInt("2147483648");
			test.setSecurityCode(SecurityStockMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		try {
			int SecurityStockMax = Integer.parseInt("-2147483649");
			test.setSecurityCode(SecurityStockMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = null;

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = " ";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "　";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay6() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "あいう１２３";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay7() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123あいう１２３";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CreditConfirmDTO#getExpirationDay()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationDay8() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay1() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = null;

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay2() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay3() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = " ";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay4() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "　";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay5() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay6() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "あいう１２３";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay7() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "abc123あいう１２３";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.CreditConfirmDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationDay8() {
		CreditConfirmDTO test = new CreditConfirmDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setExpirationDay(expected);
		String actual = test.getExpirationDay();

		assertEquals(expected, actual);
	}

}