/**
 *
 */
package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.PayConfirmDTO;

/**
 * @author internousdev
 *
 */
public class PayConfirmDTOtest {

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = -2147483648;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int ItemIdMax = Integer.parseInt("2147483648");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int ItemIdMax = Integer.parseInt("-2147483649");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link dto.PayConfirmDTO#getItemCount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemCount1() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 0;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount2() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount3() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = -2147483648;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount4() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int ItemCountMax = Integer.parseInt("2147483648");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCount5() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int ItemCountMax = Integer.parseInt("-2147483649");
			test.setItemCount(ItemCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount1() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 0;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount2() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 2147483647;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount3() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = -2147483648;

		test.setItemCount(expected);
		int actual = test.getItemCount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount4() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int SecurityCountMax = Integer.parseInt("2147483648");
			test.setItemCount(SecurityCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setCount(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemCount5() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int SecurityCountMax = Integer.parseInt("-2147483649");
			test.setItemCount(SecurityCountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link dto.PayConfirmDTO#getAmount()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount1() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 0;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount2() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount3() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = -2147483648;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount4() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int AmountMax = Integer.parseInt("2147483648");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetAmount5() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int AmountMax = Integer.parseInt("-2147483649");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount1() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 0;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount2() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = 2147483647;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount3() {
		PayConfirmDTO test = new PayConfirmDTO();
		int expected = -2147483648;

		test.setAmount(expected);
		int actual = test.getAmount();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount4() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int AmountMax = Integer.parseInt("2147483648");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.flowers.dto.PayConfirmDTO#setStock(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetAmount5() {
		PayConfirmDTO test = new PayConfirmDTO();
		try {
			int AmountMax = Integer.parseInt("-2147483649");
			test.setAmount(AmountMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

}
