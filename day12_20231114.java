package Day12;

public class day12_20231114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		buyer.buy(new Video());
		buyer.buy(new Audio());
		
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn(); //빨간 스피커가 켜졌습니다.

		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn(); //파란 스피커가 켜졌습니다.

		//인터페이스 다형성 가능하다.
		Fighter f = new Fighter(); //의존하는 클래스를 객체로 생성
		f.move(100,200);
		
		Unit2 f2 = new Fighter();
		//f2.attack(); 사용할 수 없다. 형변환이 다르다.
		Fightable f3 = new Fighter();
		f3.attack(new Fighter);
		//f3.x; 자식 클래스로 생성했지만 인터페이스 형변환만 사용하니까
		Fightable nf = f.getFighterable(); // 자식 클래스 메서드 부모인터페이스 형변환리턴 출력
		
		
		//자식클래스 객체 생성 BlutootMIC
		BlutootMIC bm = new BlutootMIC();
		//객체가 생성되면 음악이 나온다.
		bm.music();
		//객체가 생성되면 노래를 부른다.
		bm.sing();
		
		System.out.println("--태진미디어 객체--");
		//자식 클래스 객체 생성
		TJmic tj = new TJmic();
		tj.connect();
		tj.sing();
		tj.music();
		
		System.out.println("--태진미디어 객체를 BlutootMIC 타입변환--");
		BlutootMIC bm = tj; //BlutootMIC 형타입 변환
		bm.connect();
		bm.sing();
		bm.music();
		
		System.out.println("--태진미디어 객체를 Microphone 타입변환--");
		Microphone bm = tj; //BlutootMIC 형타입 변환
		//bm.connect();
		bm.sing();
		//bm.music();
		
		System.out.println("--태진미디어 객체를 BlutootMIC 타입변환--");
		Speaker bm = tj; //BlutootMIC 형타입 변환
		//bm.connect();
		//bm.sing();
		bm.music();
	}
}

//마이크폰
interface Microphone{
	abstract void sing();
}
//스피커
interface Speaker{
	abstract void music();
}
//블루투스 마이크

/*
class BlutootMIC implements Microphone, Speaker{ //다중 인터페이스

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}
}
*/
interface BlutootMIC extends Microphone, Speaker{ //다중 인터페이스
	abstract void connect(); //연결
}

class TJmic implements BlutootMIC{

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("마이크에 대고 노래를 부릅니다.");
	}

	@Override
	public void music() {
		// TODO Auto-generated method stub
		System.out.println("마이크에 장착된 스피커로 반주가 나옵니다.");
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("블루투스 장치가 연결되었습니다.");
	}
}



//클래스 unit2 : 추상클래스 abstract 메서드
abstract class Unit2{
	int x,y;
	abstract void move(int x, int y); //추상 메서드
	void stop() { System.out.println("멈춥니다.");
	}
}
//클래스 interface : Fightable
interface Fightable{
	public void move(int x, int y); //move 추상메서드
	public void attack(Fightable f); //attack 추상메서드
}
abstract //클래스 Fighter : extends unit2 (추상클래스) implemets Fightable
class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
	//인터페이스 리턴 : 형변환으로 가능하다.
	//Fightable f = new Fighter();
	Fightable getFighterable() {
		//자식이 한마리 구현한다.
		Fighter f = new Fighter();
		return f;
		
	}
}



class Speaker{
	String getName() {
		return "스피커";
	}

}
class RedSpeaker extends Speaker{
	String getName() {
		return "빨간";
	}

}
class BlueSpeaker extends Speaker{
	String getName() {
		return "파란";
	}

}

class Person{ //사람 클래스
	//객체변수
	Speaker speaker;
	//기본생성자
	Person(Speaker speaker){
	   this.speaker = speaker;
	}
	//메서드 : 색깔(클래스:매개변수다형성)스피커가 켜졌습니다.
	void turnOn(){
	      System.out.println(speaker.getName()+"이 커졌습니다.");
	}
}


class Buyer {
	void buy(Product p) {
		System.out.println(p);
	}
}
class Product {}
class Video extends Product {
	public String toString() {
		return "video";
	}
} //5. 아래와 같이 출력하기 위해 오버라이딩하세요(15점)

class Audio extends Product {
	public String toString() {
		return "Audio";
	}
} //6. 아래와 같이 출력하기 위해 오버라이딩하세요(15점)