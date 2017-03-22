/**
 *
 */
package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.CategoryDTO;

/**
 * @author internousdev
 *
 */
public class CategoryDTOtest {

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName1() {
		CategoryDTO test = new CategoryDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName2() {
		CategoryDTO test = new CategoryDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName3() {
		CategoryDTO test = new CategoryDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName4() {
		CategoryDTO test = new CategoryDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName5() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName6() {
		CategoryDTO test = new CategoryDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName7() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName8() {
		CategoryDTO test = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName1() {
		CategoryDTO test = new CategoryDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName2() {
		CategoryDTO test = new CategoryDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName3() {
		CategoryDTO test = new CategoryDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName4() {
		CategoryDTO test = new CategoryDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName5() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName6() {
		CategoryDTO test = new CategoryDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName7() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName8() {
		CategoryDTO test = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		CategoryDTO test = new CategoryDTO();
		int expected = 0;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		CategoryDTO test = new CategoryDTO();
		int expected = 2147483647;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		CategoryDTO test = new CategoryDTO();
		int expected = -2147483648;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		CategoryDTO test = new CategoryDTO();
		try {
			int PriceMax = Integer.parseInt("2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		CategoryDTO test = new CategoryDTO();
		try {
			int PriceMax = Integer.parseInt("-2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		CategoryDTO test = new CategoryDTO();
		int expected = 0;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		CategoryDTO test = new CategoryDTO();
		int expected = 2147483647;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		CategoryDTO test = new CategoryDTO();
		int expected = -2147483648;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		CategoryDTO test = new CategoryDTO();
		try {
			int PriceMax = Integer.parseInt("2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		CategoryDTO test = new CategoryDTO();
		try {
			int PriceMax = Integer.parseInt("-2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl1() {
		CategoryDTO test = new CategoryDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl2() {
		CategoryDTO test = new CategoryDTO();
		String expected = "";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl3() {
		CategoryDTO test = new CategoryDTO();
		String expected = " ";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl4() {
		CategoryDTO test = new CategoryDTO();
		String expected = "　";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl5() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl6() {
		CategoryDTO test = new CategoryDTO();
		String expected = "あいう１２３";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl7() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123あいう１２３";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUrl8() {
		CategoryDTO test = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl1() {
		CategoryDTO test = new CategoryDTO();
		String expected = null;

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl2() {
		CategoryDTO test = new CategoryDTO();
		String expected = "";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl3() {
		CategoryDTO test = new CategoryDTO();
		String expected = " ";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl4() {
		CategoryDTO test = new CategoryDTO();
		String expected = "　";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl5() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl6() {
		CategoryDTO test = new CategoryDTO();
		String expected = "あいう１２３";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl7() {
		CategoryDTO test = new CategoryDTO();
		String expected = "abc123あいう１２３";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.CategoryDTO#setUrl()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetUrl8() {
		CategoryDTO test = new CategoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUrl(expected);
		String actual = test.getUrl();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId1() {
		CategoryDTO test = new CategoryDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId2() {
		CategoryDTO test = new CategoryDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId3() {
		CategoryDTO test = new CategoryDTO();
		int expected = -2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId4() {
		CategoryDTO test = new CategoryDTO();
		try {
			int expected = Integer.parseInt("2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId5() {
		CategoryDTO test = new CategoryDTO();
		try {
			int expected = Integer.parseInt("-2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483647\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId() {
		CategoryDTO test = new CategoryDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		CategoryDTO test = new CategoryDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		CategoryDTO test = new CategoryDTO();
		int expected = -2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		CategoryDTO test = new CategoryDTO();
		try {
			int expected = Integer.parseInt("2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		CategoryDTO test = new CategoryDTO();
		try {
			int expected = Integer.parseInt("-2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483647\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount1() {
		CategoryDTO test = new CategoryDTO();
		int expected = 0;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount2() {
		CategoryDTO test = new CategoryDTO();
		int expected = 2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount3() {
		CategoryDTO test = new CategoryDTO();
		int expected = -2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount4() {
		CategoryDTO test = new CategoryDTO();
		try {
			int ItemCountMax = Integer.parseInt("2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount5() {
		CategoryDTO test = new CategoryDTO();
		try {
			int ItemCountMax = Integer.parseInt("-2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount1() {
		CategoryDTO test = new CategoryDTO();
		int expected = 0;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount2() {
		CategoryDTO test = new CategoryDTO();
		int expected = 2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount3() {
		CategoryDTO test = new CategoryDTO();
		int expected = -2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CategoryDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount4() {
		CategoryDTO test = new CategoryDTO();
		try {
			int ItemCountMax = Integer.parseInt("2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CategoryDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount5() {
		CategoryDTO test = new CategoryDTO();
		try {
			int ItemCountMax = Integer.parseInt("-2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}
}
