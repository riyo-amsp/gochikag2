/**
 *
 */
package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.CartSelectDTO;

/**
 * @author internousdev
 *
 */
public class CartSelectDTOtest {

	/**
	 * {@link dto.CartSelectDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int expected = Integer.parseInt("2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int expected = Integer.parseInt("-2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483647\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int expected = Integer.parseInt("2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483647\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int expected = Integer.parseInt("-2147483647");
			test.setItemId(expected);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483647\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName1() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = null;
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName2() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = " ";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName3() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "  ";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName4() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "　";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName5() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "abc123";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName6() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName7() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "abc123あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName8() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "ABC１２３あいう漢字";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName1() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = null;
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName2() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = " ";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName3() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "  ";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName4() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "　";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName5() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "abc123";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName6() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemName(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName7() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "abc123あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	public void testSetItemName8() {
		CartSelectDTO test = new CartSelectDTO();
		String expected = "ABC１２３あいう漢字";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483648;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int PriceMax = Integer.parseInt("2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int PriceMax = Integer.parseInt("-2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483648;

		test.setPrice(expected);
		int actual = test.getPrice();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int PriceMax = Integer.parseInt("2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int PriceMax = Integer.parseInt("-2147483648");
			test.setPrice(PriceMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int ItemCountMax = Integer.parseInt("2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int ItemCountMax = Integer.parseInt("-2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int ItemCountMax = Integer.parseInt("2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setItemCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int ItemCountMax = Integer.parseInt("-2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}

	/**
	 * {@link dto.CartSelectDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int AmountMax = Integer.parseInt("2147483648");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int AmountMax = Integer.parseInt("-2147483648");
			test.setItemCount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}

	/**
	 * {@link dto.CartSelectDTO#setAmount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setAmount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setAmount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setAmount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int AmountMax = Integer.parseInt("2147483648");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setAmount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int AmountMax = Integer.parseInt("-2147483648");
			test.setItemCount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}

	/**
	 * {@link dto.CartSelectDTO#getStockCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStockCount1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setStockCount(expected);
		int actual = test.getStockCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getStockCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStockCount2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setStockCount(expected);
		int actual = test.getStockCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getStockCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStockCount3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setStockCount(expected);
		int actual = test.getStockCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getStockCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStockCount4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int StockCountMax = Integer.parseInt("2147483648");
			test.setAmount(StockCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getStockCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetStockCount5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int StockCountMax = Integer.parseInt("-2147483648");
			test.setItemCount(StockCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}

	/**
	 * {@link dto.CartSelectDTO#setStockCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStockCount1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setStockCount(expected);
		int actual = test.getStockCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setStockCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStockCount2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setStockCount(expected);
		int actual = test.getStockCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setStockCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStockCount3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setStockCount(expected);
		int actual = test.getStockCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setStockCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStockCount4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int StockCountMax = Integer.parseInt("2147483648");
			test.setAmount(StockCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setStockCount(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetStockCount5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int StockCountMax = Integer.parseInt("-2147483648");
			test.setItemCount(StockCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}

	/**
	 * {@link dto.CartSelectDTO#getStockCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIndex1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setIndex(expected);
		int actual = test.getIndex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getIndex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIndex2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setIndex(expected);
		int actual = test.getIndex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getIndex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIndex3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setIndex(expected);
		int actual = test.getIndex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#getIndex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIndex4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int IndexMax = Integer.parseInt("2147483648");
			test.setIndex(IndexMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#getIndex()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetIndex5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int IndexMax = Integer.parseInt("-2147483648");
			test.setIndex(IndexMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}

	/**
	 * {@link dto.CartSelectDTO#setIndex(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIndex1() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 0;

		test.setIndex(expected);
		int actual = test.getIndex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setIndex(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIndex2() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = 2147483647;

		test.setIndex(expected);
		int actual = test.getIndex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setIndex(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIndex3() {
		CartSelectDTO test = new CartSelectDTO();
		int expected = -2147483647;

		test.setIndex(expected);
		int actual = test.getIndex();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.CartSelectDTO#setIndex(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIndex4() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int IndexMax = Integer.parseInt("2147483648");
			test.setAmount(IndexMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.CartSelectDTO#setIndex(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetIndex5() {
		CartSelectDTO test = new CartSelectDTO();
		try {
			int IndexMax = Integer.parseInt("-2147483648");
			test.setItemCount(IndexMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
		;
	}
}
