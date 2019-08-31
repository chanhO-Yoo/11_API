package kh.java.api.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		DateFormatTest d = new DateFormatTest();
		d.test1();
	}
	
	/*
	 * 2019-08-30
	 * 2019/08/30
	 * 30/08/2019
	 * 19-08-30
	 */
	public void test1() {
		Date d = new Date();
		
		//형식 객체
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd E요일 a hh시 mm분 ss초");
		String result = sdf1.format(d);
		System.out.println(result);
	}

}
