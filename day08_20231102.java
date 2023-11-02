package Day8;

//실행용 클래스 : main 메서드를 포함한 클래스 파일을 생성하면 만들어진다.
//			  프로그햄 실행을 맡고 있는 클래스이다.

public class day08_20231102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//클래스 선언
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		//클래스 추가 (Tree라는 클래스를 선언하고 객체변수 tree 생성하자
		Tree tr1 = new Tree();
		tr1.leaf = "red";
		Tree tr2 = new Tree();
		
		//객체 : 인스턴스화
		Tv tv1 = new Tv(); //Tv 객체를 사용한다.
		Tv tv2 = new Tv(); //Tv 객체를 사용한다.
		
		tv1.channel = 7;
		tv1.channelDown(); //소리가 6으로 줄어든다.
		
		//System.out.println();
		//채널의 값을 출력해보자
		System.out.println("t1 현재 볼륨은"+tv1.channel+"입니다.");
		System.out.println("t2 현재 볼륨은"+tv2.channel+"입니다.");
		
		
		//tv1의 객체의 주소값을 tv2의 주소값으로 바꿔준다.
		tv2 = tv1; //X200-->X100(tv1 같은 주소의 메모리를 참조한다.)
		//채널의 값을 출력해보자.
		System.out.println("t1 현재 볼륨은"+tv1.channel+"입니다.");
		System.out.println("t2 현재 볼륨은"+tv2.channel+"입니다.");
		
		//외부파일 class 설계도를 이용한 객체 생성
		Car_option car_ = new Car_option ();
		car_.wheel_gold = 2;
		System.out.println("자동차의 휠은"+car_.wheel_gold+"입니다.");
		car_.ride();
		car_.ride();
		car_.ride();
		car_.ride();
		car_.ride();

	}

}

//라이브러리 클래스 : 실행용 클래스는 항상 1개 이면서 벌도로 만들어진 클래스
class Tv{
	String color;
	boolean power;
	int channel;
	void power() { power = !power; } //전원가능 : 꺼져있다.
	void channelUp() { ++channel; } // 소리가 켜진다.
	void channelDown() { --channel; } // 소리가 작아진다.
}
class Car {
	
}
class Tree {
	String leaf = "green";
}