package kh.java.api.format;

import java.text.DecimalFormat;

public class NumberFormatTest {
	public static void main(String[] args) {
		NumberFormatTest n = new NumberFormatTest();
		n.test1();
	}
	
	public void test1() {
		double num = 1234567890.127;
		DecimalFormat df = new DecimalFormat("0.#####"); // 모자란 자리의 숫자를 안채운다
		String result = df.format(num);
		System.out.println(result);
		
		df.applyPattern("0.00000000"); //모자란 자리의 숫자를 0으로 채워 넣는다.
		result = df.format(num);
		System.out.println(result);
		
		//원화
		df.applyPattern("￦#,###");
		result = df.format(num);
		System.out.println(result);
	}
}
