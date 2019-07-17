package com.niuxiaofei.common.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
/**
 * 
 * @ClassName: DateUtilTest 
 * @Description:测试日期类
 * @author:nxf 
 * @date: 2019年7月17日 上午8:29:07
 */
public class DateUtilTest {

	/**
	 * 
	 * @Title: getAge 
	 * @Description:根据传入的日期获取年龄
	 * @param src
	 * @return
	 * @return: int
	 */
	@Test
	public void testGetAge() {
		int age = DateUtil.getAge(new Date(1996,10,12));
		System.out.println("年龄是:"+age);
	}

	/**
	 * 
	 * @Title: getDateByMonthInit 
	 * @Description:根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，
	 * 返回“2019-09-01 00:00:00”
	 * @param src
	 * @return
	 * @return: Date
	 */
	@Test
	public void testGetDateByMonthInit() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date src = new Date();
		Date date = DateUtil.getDateByMonthInit(src);
		String format = sd.format(date);
		System.out.println(format);
	}

	/**
	 * 
	 * @Title: getDateByMonthLast 
	 * @Description:根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，
	 * 返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	 * @param src
	 * @return
	 * @return: Date
	 */
	@Test
	public void testGetDateByMonthLast() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date src = new Date();
		Date date = DateUtil.getDateByMonthLast(src);
		String format = sd.format(date);
		System.out.println(format);
	}

	/**
	 * 
	 * @Title: getDaysByFuture 
	 * @Description:求未来日期离今天还剩的天数
	 * @param future
	 * @return
	 * @return: int
	 */
	@Test
	public void testGetDaysByFuture() {
		Calendar c = Calendar.getInstance();
		c.set(2019, 10,19);
		Date time = c.getTime();
		System.out.println("现在离未来有"+DateUtil.getDaysByFuture(time)+"天");
	}

	/**
	 * 
	 * @Title: getDaysByDeparted 
	 * @Description:求过去日期离今天过去的天数
	 * @param departed
	 * @return
	 * @return: int
	 */
	@Test
	public void testGetDaysByDeparted() {
		Calendar c = Calendar.getInstance();
		c.set(1999,10,19);
		Date time = c.getTime();
		System.out.println("过去到现在有"+DateUtil.getDaysByDeparted(time)+"天");
	}

}
