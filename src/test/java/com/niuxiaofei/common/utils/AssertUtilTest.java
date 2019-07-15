package com.niuxiaofei.common.utils;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/**
 * 
 * @ClassName: AssertUtilTest 
 * @Description: 测试断言类
 * @author:nxf 
 * @date: 2019年7月15日 上午9:02:41
 */
public class AssertUtilTest {

	/**
	 * 
	 * @Title: testIsTrue 
	 * @Description:测试AssertUtil.isTrue()方法，通过断言测一次（2分），不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testIsTrue() {
		AssertUtil.isTrue(1>0, "为假");
	}

	/**
	 * 
	 * @Title: testIsFalse 
	 * @Description:测试AssertUtil.isFalse()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
		AssertUtil.isFalse(1<0, "为真");
	}

	/**
	 * 
	 * @Title: testNotNull 
	 * @Description:测试AssertUtil.notNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	 * @return: void
	 */
	@Test
	public void testNotNull() {
		Object obj = "aaa";
		AssertUtil.notNull(obj, "为空");
	}

	/**
	 * 
	 * @Title: testIsNull 
	 * @Description:测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	 * @return: void
	 */
	@Test
	public void testIsNull() {
		Object obj = null;
		AssertUtil.isNull(obj, "不为空");
	}
	
	/**
	 * 
	 * @Title: testNotEmptyCollectionOfQString 
	 * @Description:用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
	 * @return: void
	 */
	@Test
	public void testNotEmptyCollectionOfQString() {
		List list = new ArrayList<>();
		list.add(11);
		AssertUtil.notEmpty(list, "为空");
	}

	/**
	 * 
	 * @Title: testNotEmptyMapOfQQString 
	 * @Description:用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testNotEmptyMapOfQQString() {
		Map map = new HashMap<>();
		map.put("aas", "aaa");
		AssertUtil.notEmpty(map, "为空");
	}

	/**
	 * 
	 * @Title: testHasText 
	 * @Description:用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testHasText() {
		AssertUtil.hasText("aaa", "为空");
	}

	/**
	 * 
	 * @Title: testGreaterThanZero 
	 * @Description测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分），不能通过断言测一次（2分）
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero() {
		BigDecimal b = new BigDecimal(1);
		AssertUtil.greaterThanZero(b, "小于或等于0");
	}

}
