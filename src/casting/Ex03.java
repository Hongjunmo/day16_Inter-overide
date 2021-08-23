package casting;

import java.util.ArrayList;

class AAA {
	public String getText() {
		return "aaa클래스";
	}

}

public class Ex03 {
	public static void main(String[] args) {
		Object a = new AAA();
		AAA aa = (AAA) a;
		aa.getText();

		ArrayList arr = new ArrayList();
		arr.add("test");

		String s = (String) arr.get(0);

	}
}
