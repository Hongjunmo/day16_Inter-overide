package casting;

class Parents {
	public void familyName() {
		System.out.print("이");
	}

	public void name() {
		familyName();
		System.out.println("순신");
	}
}

class Daugter extends Parents {
	public void name() {
		familyName();
		System.out.println("국주");
	}
}

class son extends Parents {
	public void name() {
		familyName();
		System.out.println("기광");
	}
}

public class Ex02 {
	public static void main(String[] args) {
//		Parents p = new Parents();
//		p.name();
//		Daugter d = new Daugter();
//		d.name();
//		son s = new son();
//		s.name();

		Parents p = new Parents();
		p.name();
		p= new Daugter();
		p.name();
		p = new son();
		p.name();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
