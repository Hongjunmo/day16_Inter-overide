package overrideing;

public class NewFerrari extends Ferrari {

	public NewFerrari(int ye, int speed) {
		super(ye, speed);

	}
	public void autosys() {
		System.out.println("자동 운전 모드를 시작");
	}
	@Override
	public void speed() {
		System.out.println(getYe() + "넌 페라리 속도 " + super.getSpeed() + "km 입니다");
		System.out.println("터보 엔진 동작함");

	}
}
