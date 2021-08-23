package interface_ex;

interface Test {
	public static final int a = 12345;

	public static String id = "홍길동";
	public static String pw = "12345";

}

class Test01 implements Test {

	public void test() {
		System.out.println("값");
	}

}

public class Ex03 {
	public static void main(String[] args) {

		System.out.println(Test.id);
		System.out.println(Test.pw);

	}
}
