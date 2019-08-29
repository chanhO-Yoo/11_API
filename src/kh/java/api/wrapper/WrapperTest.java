package kh.java.api.wrapper;

/*
 * Wrapper Class
 * 기본형을 객체화할 수 있도록 준비한 클래스
 * List<Integer> list = new ArrayList<Integer>();
 * List<Int> list(x)
 * 
 * boolean -> java.lang.Boolean
 * char -> java.lang.Character
 * byte -> java.lang.Byte
 * short -> java.lang.Short
 * int -> java.lang.Integer
 * long -> java.lang.Long
 * float -> java.lang.Float
 * double -> java.lang.Double
 * 
 */
public class WrapperTest {

	public static void main(String[] args) {
		WrapperTest w = new WrapperTest();
		w.test1();
		
	}
	
	/*
	 * 자동 boxing & unboxing
	 * boxing : 기본형 -> 참조형으로 형변환
	 * unboxing : 참조형 -> 기본형으로 형변환
	 */
	public void test1() {
		int num = 100;
		//Wrapper클래스는 기본형(값)을 감싸는 클래스
		Integer i = new Integer(100);
		
		//객체로써 필드/메서드의 사용이 가능하다.
		i.intValue();//실제 값을 리턴
		
		//autoboxing & autounboxing
		Integer j = 200; //기본형 -> 참조형으로 자동형변환
		//참조형 -> 기본형으로 자동 형변환
		System.out.println(j+num);
//		System.out.println(j.intValue()+num);
	}
	

}
