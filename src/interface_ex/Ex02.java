package interface_ex;

import java.util.Scanner;

class B지상군 implements A공방 {
	public void 총알구비() {
		System.out.println("총알장전");
	}

	@Override
	public void attack() {
		총알구비();
		System.out.println("지상군이 공격함");
	}

	public void 방패() {
		System.out.println("방패 착용");
	}

	@Override
	public void defense() {
		방패();
		System.out.println("지상군이 방어함");
	}

}

class B공군 implements A공방 {

	@Override
	public void attack() {
		System.out.println("공군이 공격함");
	}

	@Override
	public void defense() {
		System.out.println("공군이 방어함");
	}

}

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			A공방  aa = new B지상군();
		System.out.println("1. 지상군 2. 공군");
		int choice;
		int num = scan.nextInt();
		if (num == 1)
			System.out.println("지상군 선택");
		else
			System.out.println("공군선택");
		System.out.println("1. 공격 2. 방어");
		choice = scan.nextInt();
		if (choice == 1 && num == 1)
			aa.attack();
		else if (choice == 2 && num == 1) {
			aa.defense();
		}
		aa = new B공군();
		if (choice == 1 && num == 2)
			aa.attack();
		else if (choice == 2 && num == 2)
			aa.defense();
		}
		
	}
}
