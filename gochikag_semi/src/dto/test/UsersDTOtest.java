package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.UsersDTO;

public class UsersDTOtest {

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		UsersDTO test = new UsersDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		UsersDTO test = new UsersDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		UsersDTO test = new UsersDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		UsersDTO test = new UsersDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		UsersDTO test = new UsersDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		UsersDTO test = new UsersDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		UsersDTO test = new UsersDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		UsersDTO test = new UsersDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassWord8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPostal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPostal8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPostal(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPostal8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPostal(expected);
		String actual = test.getPostal();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getAddress()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAddress8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setAddress(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAddress8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setAddress(expected);
		String actual = test.getAddress();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneNumber8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneNumber8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getPhoneEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setPhoneEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setPhoneNumber(expected);
		String actual = test.getPhoneNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileNumber8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileNumber(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileNumber8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMobileNumber(expected);
		String actual = test.getMobileNumber();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMobileEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetMobileEmail8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMobileEmail(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMobileEmail8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMobileEmail(expected);
		String actual = test.getMobileEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getSex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSex8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setSex(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSex8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSex(expected);
		String actual = test.getSex();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getBirthday()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetBirthday8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setBirthday(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetBirthday8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setBirthday(expected);
		String actual = test.getBirthday();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#isUserdelFlg()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testIsUserdelFlg1() {
		UsersDTO test = new UsersDTO();
		boolean expected = true;

		test.setUserdelFlg(expected);
		boolean actual = test.isUserdelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#isUserdelFlg()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testIsUserdelFlg2() {
		UsersDTO test = new UsersDTO();
		boolean expected = false;

		test.setUserdelFlg(expected);
		boolean actual = test.isUserdelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserdelFlg(boolean)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserdelFlg1() {
		UsersDTO test = new UsersDTO();
		boolean expected = true;

		test.setUserdelFlg(expected);
		boolean actual = test.isUserdelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserdelFlg(boolean)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserdelFlg2() {
		UsersDTO test = new UsersDTO();
		boolean expected = false;

		test.setUserdelFlg(expected);
		boolean actual = test.isUserdelFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#isLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testIsLoginFlg1() {
		UsersDTO test = new UsersDTO();
		boolean expected = true;

		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#isLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testIsLoginFlg2() {
		UsersDTO test = new UsersDTO();
		boolean expected = false;

		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setLoginFlg(boolean)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg1() {
		UsersDTO test = new UsersDTO();
		boolean expected = true;

		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setLoginFlg(boolean)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg2() {
		UsersDTO test = new UsersDTO();
		boolean expected = false;

		test.setLoginFlg(expected);
		boolean actual = test.isLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg2() {
		UsersDTO test = new UsersDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg3() {
		UsersDTO test = new UsersDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg4() {
		UsersDTO test = new UsersDTO();
		try {
			int UserFlgMin = Integer.parseInt("2147483648");
			test.setUserFlg(UserFlgMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg5() {
		UsersDTO test = new UsersDTO();
		try {
			int UserFlgMin = Integer.parseInt("-2147483649");
			test.setUserFlg(UserFlgMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserFlg(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserFlg(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg2() {
		UsersDTO test = new UsersDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserFlg(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg3() {
		UsersDTO test = new UsersDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserFlg(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg4() {
		UsersDTO test = new UsersDTO();
		try {
			int UserFlgMax = Integer.parseInt("2147483648");
			test.setUserFlg(UserFlgMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUserFlg(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg5() {
		UsersDTO test = new UsersDTO();
		try {
			int UserFlgMax = Integer.parseInt("-2147483649");
			test.setUserFlg(UserFlgMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getYear()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetYear8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setYear(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetYear8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setYear(expected);
		String actual = test.getYear();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getMonth()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetMonth8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetMonth8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMonth(expected);
		String actual = test.getMonth();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthId8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthId(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthId8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOauthId(expected);
		String actual = test.getOauthId();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthName1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthName2() {
		UsersDTO test = new UsersDTO();
		int expected = 2147483647;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthName3() {
		UsersDTO test = new UsersDTO();
		int expected = -2147483648;

		test.setOauthName(expected);

		assertEquals(expected, test.getOauthName());
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthName4() {
		UsersDTO test = new UsersDTO();
		try {
			int OauthNameMin = Integer.parseInt("2147483648");
			test.setOauthName(OauthNameMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthName5() {
		UsersDTO test = new UsersDTO();
		try {
			int OauthNameMin = Integer.parseInt("-2147483649");
			test.setOauthName(OauthNameMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthName(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthName1() {
		UsersDTO test = new UsersDTO();
		int expected = 0;

		test.setOauthName(expected);
		int actual = test.getOauthName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthName(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthName2() {
		UsersDTO test = new UsersDTO();
		int expected = 2147483647;

		test.setOauthName(expected);
		int actual = test.getOauthName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthName(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthName3() {
		UsersDTO test = new UsersDTO();
		int expected = -2147483648;

		test.setOauthName(expected);
		int actual = test.getOauthName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthName(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthName4() {
		UsersDTO test = new UsersDTO();
		try {
			int OauthNameMax = Integer.parseInt("2147483648");
			test.setOauthName(OauthNameMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthName(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthName5() {
		UsersDTO test = new UsersDTO();
		try {
			int OauthNameMax = Integer.parseInt("-2147483649");
			test.setOauthName(OauthNameMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getOauthAccount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetOauthAccount8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setOauthAccount(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetOauthAccount8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setOauthAccount(expected);
		String actual = test.getOauthAccount();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getRegisterDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetRegisterDay8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setRegisterDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetRegisterDay8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setRegisterDay(expected);
		String actual = test.getRegisterDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#getUpdateDay()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdateDay8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay1() {
		UsersDTO test = new UsersDTO();
		String expected = null;

		test.setRegisterDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay2() {
		UsersDTO test = new UsersDTO();
		String expected = "";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay3() {
		UsersDTO test = new UsersDTO();
		String expected = " ";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay4() {
		UsersDTO test = new UsersDTO();
		String expected = "　";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay5() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay6() {
		UsersDTO test = new UsersDTO();
		String expected = "あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay7() {
		UsersDTO test = new UsersDTO();
		String expected = "abc123あいう１２３";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.flowers.dto.UsersDTO#setUpdateDay(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdateDay8() {
		UsersDTO test = new UsersDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdateDay(expected);
		String actual = test.getUpdateDay();

		assertEquals(expected, actual);

	}
}
