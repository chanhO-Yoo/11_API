package kh.java.api.string;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		StringTokenizerTest s = new StringTokenizerTest();

//		s.test1();
		s.test2();
	}
	
	public void test1() {
		String s= "Java, oracle, jdbc, heml5, css3";
		
		//1.split
		String[] arr = s.split(", ");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("["+arr[i]+"]");
//		}
		for(String e:arr) {
			System.out.println("["+e+"]");
		}
		
		//2.StringTokenizer
		StringTokenizer st = new StringTokenizer(s,", ");
		System.out.println("countTokens = "+st.countTokens());
		
		while(st.hasMoreTokens()) {  //조건식
			String t = st.nextToken();
			System.out.println("["+t+"]");
		}
	}
	
	public void test2() {
		//csv = comma separated  value
		String s = "a, b, c,d e";
		
		//1.split
		String[] arr = s.split(", ");
		for(String str: arr) {
			System.out.println("["+str+"]");
		}
		
		//2.StringTokenizer : 구분하는 문자 ','와 ' '둘 모두로 구분하여 확인, 
		StringTokenizer st = new StringTokenizer(s,", ");
		while(st.hasMoreTokens()) {
			System.out.println("["+st.nextToken()+"]");
		}
	}
}
