package kh.java.api.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		CalendarTest c = new CalendarTest();
//		c.test1();
		c.test2();
//		c.test3();
//		c.test4();
//		c.test5();
	}
	
	public void test1() {
//		Calendar today = new Calendar();
		Calendar today = Calendar.getInstance();
//		Calendar today = new GregorianCalendar();
		
		System.out.println(today);
		
		//year
		System.out.println(today.get(Calendar.YEAR));
//		System.out.println(today.get(1)); //상수처리 되어있지만 알아보기 힘들다
		
		//month인 경우, index로 1월이 0으로 처리
		System.out.println(today.get(Calendar.MONTH)+1);
		
		//day
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		
		//요일 : 1:일요일, 2:월요일, 3:화요일 ... 7:토요일
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		
		char[] dayOfWeek = {'일','월','화','수','목','금','토'};
		System.out.println("오늘은 "+dayOfWeek[today.get(Calendar.DAY_OF_WEEK)]+"요일 입니다.");
		
		System.out.println(today.get(Calendar.AM_PM)==0?"오전":"오후");
		
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		
		//@실습문제 : 24시간 hh:mm:ss
		System.out.printf("%02d:%02d:%02d\n",today.get(Calendar.HOUR_OF_DAY), today.get(Calendar.MINUTE), today.get(Calendar.SECOND));
		
		int hh_ = today.get(Calendar.HOUR_OF_DAY);
		int mm_ = today.get(Calendar.MINUTE);
		int ss_ = today.get(Calendar.SECOND);
		System.out.println(hh_+":"+mm_+":"+ss_);
		
//		String hh = hh_<10?"0"+hh_:""+hh_;
//		String mm = mm_<10?"0"+mm_:""+mm_;
//		String ss = ss_<10?"0"+ss_:""+ss_;
		
		String hh = get2digit(hh_);
		String mm = get2digit(mm_);
		String ss = get2digit(ss_);
		
		System.out.println(hh+":"+mm+":"+ss);
	}
	
	public String get2digit(int n) {
		if(n<10)
			return "0"+n;
		return ""+n;
	}
	
	/*
	 * 특정 날자 세팅하기
	 */
	public void test2() {
		Calendar date1 = Calendar.getInstance();
		date1.set(2020, 3-1, 2, 15,30,0);
		showDate(date1);
		
		Calendar date2 = new GregorianCalendar(2020,3-1,2,15,30,0);
		showDate(date2);
		
	}
	
	public void showDate(Calendar c) {
		String info = c.get(Calendar.YEAR)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.DATE)+" "+get2digit(+c.get(Calendar.HOUR_OF_DAY))+":"+get2digit(+c.get(Calendar.MINUTE))+":"+get2digit(+c.get(Calendar.SECOND));
		System.out.println(info);
	}
	
	//날짜 차이 구하기
	public void test3() {
		Calendar startDay = Calendar.getInstance();
		startDay.set(2019, 8-1,5,9,0,0);
		showDate(startDay);
		
		Calendar today = Calendar.getInstance();
		showDate(today);
		
		//두 날짜/시각의 차이 구하기
		//millisecond단위 연산
		//getTimeInMills() : utc second 반환
		//1970/01/01 00:00:00으로부터 누적된 millisecond 누적
		System.out.println(today.getTimeInMillis());
		
		long diff = today.getTimeInMillis() - startDay.getTimeInMillis();
		System.out.println(diff);
		
		//시(24) - 분(60) - 초(60) - 밀리초(1000)
		System.out.println((diff/1000)/60/60/24+"일이 지났습니다.");
	}
	
	//@실습문제 : D-day구하기
	//수료일로부터 남은 일수 구하기
	//출력 : 오늘은 수료일로부터 D-180일입니다.
	//수료일 : 2020/03/02
	public void test4() {
		//오늘 설정
		Calendar today = Calendar.getInstance();
		showDate(today);

		//수료일 설정
		Calendar endDay = Calendar.getInstance();
		endDay.set(2020, 03-1, 02, 0, 0, 0);
		showDate(endDay);

		//수료일 - 오늘의 millisecond
		long diffMills = endDay.getTimeInMillis()-today.getTimeInMillis();
		long diffDays = ((((diffMills/1000)/60)/60)/24);
		System.out.println("오늘은 수료일로부터 D-"+(diffDays+1)+"일입니다.");
	}
	
	/*
	 * Date - Calendar 형변환
	 *  - 기본생성자 new Date()
	 *  - 파라미터 생성자 new Date(유닉스타임(millisecond단윈))
	 * 
	 */
	
	public void test5() {
		Date d = new Date();
		System.out.println(d);
		
		//Date -> Calendar : cal.setTime(Date);
		Calendar cal1 = new GregorianCalendar();
		cal1.setTime(d);
		System.out.println(cal1);
		
		//Calendar -> Date : cal.getTimeInMillis():long
		Calendar cal2 = Calendar.getInstance();
		Date date = new Date(cal2.getTimeInMillis());
		System.out.println(date);
	}
}
