package interface_ex;

class A지상군 {
	public void 공격() {
		System.out.println("지상군이 공격");
	}

	public void 방어() {
		System.out.println("지상군이 방어함");
	}
}

class A공군 {
	public void 미사일공격() {
		System.out.println("비행기가 공격함");
	}

	public void 막자() {
		System.out.println("비행기가 방어함");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A지상군 ar = new A지상군();
		ar.공격();
		ar.방어();

		A공군 ai = new A공군();
		ai.미사일공격();
		ai.막자();

	}
}
