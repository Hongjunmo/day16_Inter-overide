package overrideing;

public class Ferrari {
	private int ye, speed;

	public Ferrari(int ye, int speed) {
		this.ye = ye;
		this.speed = speed;
	}

	public void speed() {
		System.out.println(ye + "넌 페라리 속도 " + speed + "km 입니다");
	}

	public int getYe() {
		return ye;
	}

	public int getSpeed() {
		return speed;
	}
	
}
