package com.bajie;
import org.common.util.DateUtils;
import org.junit.Test;

public class TestCase {
	/**
	 * 根据传入的日期获取年龄
	 */
	@Test
	public void getAge () {
		long years = DateUtils.getYears("1998-06-03");
		System.out.println(years);
	}
	/**
	 * 根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19”，返回“2019-09-01 00:00:00”
	 */
	@Test
	public void getDateByMonthInit() {
		String dateByMonthInit = DateUtils.getDateByMonthInit("2019-09-19");
		System.out.println(dateByMonthInit);
	}
	/**
	 * 根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	 */
	@Test
	public void getDateByMonthLast() {
		String dateByMonthLast = DateUtils.getDateByMonthLast("2019-09-30");
		System.out.println(dateByMonthLast);
	}
	/**
	 * 求未来日期离今天还剩的天数
	 */
	@Test
	public void getDaysByFuture() {
		long daysByDeparted = DateUtils.getDaysByDeparted("2999-07-06");
		System.out.println(daysByDeparted);
	}
	/**
	 * 求过去日期离今天过去的天数
	 */
	@Test
	public void getDaysByDeparted() {
		long daysByDeparted = DateUtils.getDaysByDeparted("1756-07-06");
		System.out.println(daysByDeparted);
	}

}
