/**
 *
 */
package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.LoginOauthDTO;

/**
 * @author internousdev
 *
 */
public class LoginOauthDTOtest {

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = null;

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = " ";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "　";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "abc123";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName6() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName7() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "abc123あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName8() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = null;

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName2() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName3() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = " ";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName4() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "　";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName5() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "abc123";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName6() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName7() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "abc123あいう１２３";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName8() {
		LoginOauthDTO test = new LoginOauthDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserName(expected);
		String actual = test.getUserName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginOauthDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		LoginOauthDTO test = new LoginOauthDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		LoginOauthDTO test = new LoginOauthDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		LoginOauthDTO test = new LoginOauthDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		LoginOauthDTO test = new LoginOauthDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.LoginOauthDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		LoginOauthDTO test = new LoginOauthDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
}
