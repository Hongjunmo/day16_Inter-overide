package overrideing;

import java.util.ArrayList;

class AA extends ArrayList {
	public void aa() {
		System.out.println("내 기 능");
	}
	public Object get(int i) {
		return "내가만든 get이다";
	}
}
public class Ex02_Main {
	public static void main(String[] args) {

		AA a = new AA();
		a.add("hi");
		System.out.println("저장값 : " +a.get(0));

	
	
	}
}
