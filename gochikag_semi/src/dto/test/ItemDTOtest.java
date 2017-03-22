package dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import dto.ItemDTO;

public class ItemDTOtest {

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#itemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setMainPicture(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId4() {
		ItemDTO test = new ItemDTO();
		try {
			int ItemIdMax = Integer.parseInt("2147483648");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.ItemDTO#getItemId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemId5() {
		ItemDTO test = new ItemDTO();
		try {
			int ItemIdMax = Integer.parseInt("-2147483648");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.ItemDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;

		test.setItemId(expected);
		int actual = test.getItemId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		ItemDTO test = new ItemDTO();
		try {
			int ItemIdMax = Integer.parseInt("2147483648");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link dto.ItemDTO#setItemId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		ItemDTO test = new ItemDTO();
		try {
			int ItemIdMax = Integer.parseInt("-2147483648");
			test.setItemId(ItemIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	/**
	 * {@link dto.ItemDTO#getMainPicture()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture1_8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture1_1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture1()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture1_2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture1_3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture1()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture1_4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture15() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture1_6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture17() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture1()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture1_8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSubPicture1(expected);
		String actual = test.getSubPicture1();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture2_1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getMainPicture()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture2_2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture2_3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture2_4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture2_5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture2_6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testSubPicture2_7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture2_8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture2()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture2_8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSubPicture2(expected);
		String actual = test.getSubPicture2();

		assertEquals(expected, actual);
	}

	@Test
	public void testGetSubPicture3_1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#getSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture3_2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#SubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture3_3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#SubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture3_4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#SubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture3_5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#SubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture3_6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#SubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture3_7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link dto.ItemDTO#SubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubPicture3_8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_1() {
		ItemDTO test = new ItemDTO();
		String expected = null;

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_2() {
		ItemDTO test = new ItemDTO();
		String expected = "";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()}} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}

	/**
	 * {@link link dto.ItemDTO#setSubPicture3()} のためのテスト・メソッド。
	 */
	@Test
	public void testSetSubPicture3_8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setSubPicture3(expected);
		String actual = test.getSubPicture3();

		assertEquals(expected, actual);
	}


		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetPrice1() {
			ItemDTO test = new ItemDTO();
			float expected = 0f;

			test.setPrice(expected);

			assertEquals(expected, test.getPrice(),0.00000000001f);
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetPrice2() {
			ItemDTO test = new ItemDTO();
			float expected =  3.4028235E38f;

			test.setPrice(expected);

			assertEquals(expected, test.getPrice(),0.00000000001f);
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetPrice3() {
			ItemDTO test = new ItemDTO();
			float expected = 1.4E-45f;

			test.setPrice(expected);

			assertEquals(expected, test.getPrice(),0.00000000001f);
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetPrice4() {
			ItemDTO test = new ItemDTO();
			try {
				float PriceMin = Integer.parseInt("4.4028235E38f");
				test.setPrice(PriceMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
			}
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testGetPrice5() {
			ItemDTO test = new ItemDTO();
			try {
				float PriceMin = Integer.parseInt("-4.4028235E38f");
				test.setPrice(PriceMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
			}
		}


		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testSetPrice1() {
			ItemDTO test = new ItemDTO();
			float expected = 0f;

			test.setPrice(expected);

			assertEquals(expected, test.getPrice(),0.00000000001f);
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testSetPrice2() {
			ItemDTO test = new ItemDTO();
			float expected =  3.4028235E38f;

			test.setPrice(expected);

			assertEquals(expected, test.getPrice(),0.00000000001f);
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testSetPrice3() {
			ItemDTO test = new ItemDTO();
			float expected = 1.4E-45f;

			test.setPrice(expected);

			assertEquals(expected, test.getPrice(),0.00000000001f);
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testSetPrice4() {
			ItemDTO test = new ItemDTO();
			try {
				float PriceMin = Integer.parseInt("4.4028235E38f");
				test.setPrice(PriceMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
			}
		}

		/**
		 * {@link link dto.ItemDTO#getPrice()} のためのテスト・メソッド。
		 */
		@Test
		public void testSetPrice5() {
			ItemDTO test = new ItemDTO();
			try {
				float PriceMin = Integer.parseInt("-4.4028235E38f");
				test.setPrice(PriceMin);

			} catch (RuntimeException e) {
				assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
			}
		}

		@Test
		public void testGetDetailJa1() {
			ItemDTO test = new ItemDTO();
			String expected = null;

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link dto.ItemDTO#getDetailJa()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetDetailJa2() {
			ItemDTO test = new ItemDTO();
			String expected = "";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link dto.ItemDTO#getDetailJa()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetDetailJa3() {
			ItemDTO test = new ItemDTO();
			String expected = " ";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link dto.ItemDTO#getDetailJa()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetDetailJa4() {
			ItemDTO test = new ItemDTO();
			String expected = "　";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link dto.ItemDTO#getDetailJa()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetDetailJa5() {
			ItemDTO test = new ItemDTO();
			String expected = "abc123";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link dto.ItemDTO#getDetailJa()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetDetailJa6() {
			ItemDTO test = new ItemDTO();
			String expected = "あいう１２３";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link dto.ItemDTO#getDetailJa()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetDetailJa7() {
			ItemDTO test = new ItemDTO();
			String expected = "abc123あいう１２３";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link dto.ItemDTO#getDetailJa()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetDetailJa8() {
			ItemDTO test = new ItemDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa1() {
			ItemDTO test = new ItemDTO();
			String expected = null;

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa2() {
			ItemDTO test = new ItemDTO();
			String expected = "";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa3() {
			ItemDTO test = new ItemDTO();
			String expected = " ";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa4() {
			ItemDTO test = new ItemDTO();
			String expected = "　";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa5() {
			ItemDTO test = new ItemDTO();
			String expected = "abc123";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa6() {
			ItemDTO test = new ItemDTO();
			String expected = "あいう１２３";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa7() {
			ItemDTO test = new ItemDTO();
			String expected = "abc123あいう１２３";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.flowers.dto.ItemDTO#setDetailJa(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetDetailJa8() {
			ItemDTO test = new ItemDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setDetailJa(expected);
			String actual = test.getDetailJa();

			assertEquals(expected, actual);

		}


	@Test
	public void testGetStockNumber() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetStockNumber() {
		fail("まだ実装されていません");
	}

}
