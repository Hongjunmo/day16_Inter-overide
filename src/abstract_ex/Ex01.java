package abstract_ex;

import java.util.Scanner;
	/*
	 abstract
	 메서드 오버라이딩을 필수적으로 하기 위해 큰 틀을 마련해놓는것
	 클래스에도 abstract 붙여야함 실체화코드 , 추상적 코드 둘다 가능
	   접근제한자 abstract 자료형 변수명();
	 */


abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num=num;
	}
	public abstract void combo();
}

class NewAbstract extends Abstract{
	@Override
	public void combo() {
		System.out.println(num+"단 콤보 공격 & 2대 더 때림");
	}
	
}


public class Ex01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Abstract ab = new NewAbstract();
		ab.setNum(3);
		ab.combo();
		
		
		
		
		
	}
}
