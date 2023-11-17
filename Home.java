package Day14;

public class Home {
	
	//객체변수를 만든다 -> 인터페이스를 활용한 익명 자식 객체
	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV를 끕니다.");
		}
		
	};
	//메서드1 use1
	public void use1() { //객체 대입 변수를 이용 -> 익명자식 객체를 만든다.
		
		//TV를 켭니다. -> 익명 자식 객체 메서드 : turnOn();
		rc.turnOn();
		//TV를 끕니다. -> 익명 자식 객체 메서드 : turnOff();
		rc.turnOff();
	}
	//메서드2 use2
	public void use2() {
		//자체 변수를 만들어서 익명객체를 선언한다.
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 켭니다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("에어컨을 끕니다.");
			}
			
		};
		//객체변수를 호출
		rc.turnOn();
		rc.turnOff();
	}

}

interface RemoteControl{
	void turnOn(); //끈다
	void turnOff(); //켠다.
}













