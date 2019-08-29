package kh.java.api.string;

/*
 * String | StringBuilder | StringBuffer
 *  - String : immutable 불변성,
 *    + or concat()메서드 사용시, StringPool에 새로운 문자열 값을 만들고 참조.
 *  
 *  - StringBuilder : mutable 가변성. 싱글쓰레드용
 *  - StringBuffer : mutable 가변성. 멀티쓰레드용(thread-safe)
 * 
 * 성능 : StringBuiler > StringBuffer > String
 */
public class StringTest {
	public static void main(String[] args) {
		StringTest s = new StringTest();
//		s.test1();
//		s.test2();
		s.test3(); 
	}
	
	public void test1() {
		String a = "abc";
		String b = "def";
		String c = a+b;
		String d = "abc";
	}
	
	public void test2() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		//주소값 비교
		System.out.printf("s1==s2 => %s%n",s1==s2);
		System.out.printf("s1==s3 => %s%n",s1==s3);
		System.out.printf("s3==s4 => %s%n",s3==s4);
		
		//값 비교
		System.out.printf("s1.equals(s2) => %s%n",s1.equals(s2));
		System.out.printf("s1.equals(s3) => %s%n",s1.equals(s3));
		System.out.printf("s3.equals(s4) => %s%n",s3.equals(s4));
		
		//equals메서드의 결과가 true면, hashCode값이동일해야한다. 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		s1 += "oracle";
		s2 += "oracle";
		s3 += "oracle";
		s4 += "oracle";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
	
	/*
	 * StringBuilder / StringBuffer
	 * 문자열을 저장하기 위한 객체
	 * StringPool의 값을 참조하지 않는다.
	 */
	public void test3() {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		//값 변경
		sb.append("oracle");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
	}
	
}
