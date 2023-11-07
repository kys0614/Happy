package Day10;
import Day9.Mouse_;

public class day10_20231107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩 : 부모와 자식에게 있는 메서드다.
		//자식은 부모와 다르게 메서드를 구현해서 새로운 방법으로 사용한다.
		
		//삼송 컴퓨터 객체생성 = 오버라이딩
		Samsong s = new Samsong();
		s.powerOn();
		s.powerOff();
		//컴퓨터 객체 생성
		Computer c = new Computer();
		c.powerOn();
		c.powerOff();
		//c.comname;
		System.out.println("컴퓨터 이름은"+c.getName());
		
		//내부 패키지(같은폴더)
		Mouse m = new Mouse();
		//다른 패키지가 포함될 경우는 접근이 제한된다.
		Mouse_ m2 = new Mouse_();
		m2.getName();
		
		//final 클래스와 메서드
		Comic co = new Comic("주머니 괴물", "미상", true);
		co.info_title();
		co.info_author();
		co.info_color();
		
		//@다형성 : 다른 타입으로 변환을 한다는 것이다. (상속 : 조상에게 자식이 형타입을 맞춘다.)
		DeskCalendar dc = new DeskCalendar("보라색",6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println(); // 한줄 뛰기!!
		Calendar dc2 = new DeskCalendar("보라색",6);
		dc2.info();
		dc2.hanging();
		//dc2.onTheDesk(); //오류 : 부모의 자료형은 없다.
		
		Car c1 = new SchoolBus();
		
		Bus b1 = new Bus(); //자동 형변환 가능
		Bus b2 = new SchoolBus(); //자동 형변환 가능
		
		Car c2 = new OpenCar(); //자동 형변환
		OpenCar oc = new sportsCar(); //자동 형변환
		//Bus b3 = new OpenCar(); //자동 형변환 가능하지 않다.
		//Bus b4 = new sportsCar(); //자동 형변환 가능하지 않다.
		
		//조상이 같더라도 부모가 다르면 자동형 변환이 불가능하다.
		FireEngine f = new FireEngine(); //물뿌리기기능까지 포함 객체
		
		Car_ nc = new Car_(); //물뿌리기 기능은 없지만 자동차 객체
		Car_ nc2 = null; //자동차 타입형변환은 가능하지만 객체는 생성되지 않았다.
		//Car_ nc3_ = (Car_)f;
		//ireEngine f3 = (FireEngine)nc;
		
		
	}

}
//System.out.println();

//부모클래스 : Book
class Car_{
	String color;
	int door;
	void drive() {
		System.out.println("드라이브 중입이다.");
	}
	void stop() {
		System.out.println("멈춘다.");
	}
}


//클래스1
class Car{}
class Bus extends Car{}
class SchoolBus extends Bus{}

//클래스2
class OpenCar extends Car{}
class sportsCar extends OpenCar{}


//부모클래스 : Calendar (달력)
class Calendar{
	String color;
	int months;
	Calendar(String color, int months){
		this.color = color;
		this.months = months;
	}
	
	void info() { //달력의 정보
		System.out.println(color+"달력은"+months+"월까지 있습니다.");
	}
	
	void hanging() { //벽걸이 여부 정보
		System.out.println(color+"달력은 벽에 걸 수 있습니다.");
}

//자식클래스 : DeskCalendar (책상에 올려놓는 달력)
class DeskCalendar extends Calendar{
	
	DeskCalendar(String color, int months) {
		super(color, months);
		// TODO Auto-generated method stub
	}
	
	@Override
	void hanging() {
		System.out.println(color+"달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	void onTheDesk() {
		System.out.println(color+"달력은 책상에 세울수 있습니다.");
	}
}





class Book{
	String title;
	String author;
	
	//기본생성자 : 객체 생성시 초기화
	Book(String title,String author){
		this.title = title;
		this.author = author;
	}
	
	//final 메서드 만든다.
	final void info_title() {
		System.out.println("책의 제목은" +title+ "입니다.");
	}
	
	//멤버메서드 : 객체 생성될 때 사용하는 메서드(힙영역)
	void info_author() {
		System.out.println("책의 저자는" +author+ "입니다.");
	}
}
//자식클래스 : Comic
class Comic extends Book{
	boolean isColor;
	Comic(String title,String author,boolean isColor) {
		super(title, author); //부모생성자
		// TODO Auto-generated method stub
		this.isColor = isColor; //색깔 구분
	}
	
	//@override
	//파이널 메서드 오버라이딩
	/*void info_title() {
		System.out.println("책의 제목은" +title+ "입니다.");
	}*/
	//에러코드 없음
	void info_author() {
		System.out.println("책의 저자는" +author+ "입니다.");
	}
	
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러야");
		}else {
			System.out.println("이 만화책은 흑백이야");
		}
	}
}
class Mouse {
	String name = "LG";
	public String getName() {
		return "마우스";
	}

}

//클래스 1: 컴퓨터
class Computer{
	private String comname;
	void powerOn() {
		System.out.println("삑삑삑 컴퓨터가 켜졌습니다.");
	}
	
	String getName() {
		this.comname = "부모컴퓨터";
		return this.comname;
		
	}
	void powerOff() {
		System.out.println("삑삑삑 컴퓨터가 꺼졌습니다.");
	}
}

//클래스 2 : 삼성
class Samsong extends Computer{
	
	@Override
	void powerOn() {
		System.out.println("아이러브 삼송"+"삑삑삑 컴퓨터가 켜졌습니다.");
	}
}