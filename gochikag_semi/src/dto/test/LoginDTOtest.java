/**
 *
 */
package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.LoginDTO;

/**
 * @author internousdev
 *
 */
public class LoginDTOtest {

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#setPassword(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserId(expected);
		String actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg1() {

		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getLoginFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetLoginFlg8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginFlg(expected);
		String actual = test.getLoginFlg();

		assertEquals(expected, actual);
	}
	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg1() {

		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getUserFlg()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserFlg(expected);
		String actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {

		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPassword()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}




	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getPhoneEmail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail1() {
		LoginDTO test = new LoginDTO();
		String expected = null;

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail2() {
		LoginDTO test = new LoginDTO();
		String expected = "";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail3() {
		LoginDTO test = new LoginDTO();
		String expected = " ";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail4() {
		LoginDTO test = new LoginDTO();
		String expected = "　";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail5() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail6() {
		LoginDTO test = new LoginDTO();
		String expected = "あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail7() {
		LoginDTO test = new LoginDTO();
		String expected = "abc123あいう１２３";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setExpirationMonth(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPhoneEmail8() {
		LoginDTO test = new LoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPhoneEmail(expected);
		String actual = test.getPhoneEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.LoginDTO#getCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount1() {
		LoginDTO test = new LoginDTO();
		int expected = 0;

		test.setCount(expected);
		int actual = test.getCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount() {
		LoginDTO test = new LoginDTO();
		int expected = 2147483647;

		test.setCount(expected);
		int actual = test.getCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount3() {
		LoginDTO test = new LoginDTO();
		int expected = -2147483648;

		test.setCount(expected);
		int actual = test.getCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount4() {
		LoginDTO test = new LoginDTO();
		try {
			int CountMax = Integer.parseInt("2147483648");
			test.setCount(CountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link  dto.LoginDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount5() {
		LoginDTO test = new LoginDTO();
		try {
			int CountMax = Integer.parseInt("-2147483649");
			test.setCount(CountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link  dto.LoginDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCount1() {
		LoginDTO test = new LoginDTO();
		int expected = 0;

		test.setCount(expected);
		int actual = test.getCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCount2() {
		LoginDTO test = new LoginDTO();
		int expected = 2147483647;

		test.setCount(expected);
		int actual = test.getCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCount3() {
		LoginDTO test = new LoginDTO();
		int expected = -2147483648;

		test.setCount(expected);
		int actual = test.getCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link  dto.LoginDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCount4() {
		LoginDTO test = new LoginDTO();
		try {
			int CountMax = Integer.parseInt("2147483648");
			test.setCount(CountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link  dto.LoginDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCount5() {
		LoginDTO test = new LoginDTO();
		try {
			int CountMax = Integer.parseInt("-2147483649");
			test.setCount(CountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}
}
