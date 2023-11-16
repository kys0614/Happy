package Day13;

//외부 클래스 static 메서드 안에서 내부 클래스 객체 생성하기
public class A3 {
	//정적 멤버 클래스
	private int val; //인스턴스 변수
	private static int cnt = 1; //정적변수
	static class B3{
		//int val2 = val; //인스턴스 멤버변수는 정적 내부 클래스 사용하지 않다.
		int cnt2 = cnt; // 정적변수 사용가능하다.
		//메서드를 만들자
		void methodB() {
			System.out.println("methodB 실행");
		}
	}
	
	//인스턴스 필드 값으로 B객체 대입
	B3 filed1 = new B3();
	//정적 필드 값으로 B객체 대입
	static B3 filed2 = new B3();
	
	//생성자 가능
	A3(){
		B3 filed1 = new B3();
	}
	
	//인스턴스 메서드 가능
	void method1() {
		B3 filed1 = new B3(); //외부 클래스 A3를 통해서 인스턴스 메서드를 활용한 B3내부클래스를 접근가능
	}
	//정적 메서드 가능
	static void method2() {
		B3 filed1 = new B3(); //외부 클래스 A3를 통해서 정적 메서드를 활용한 B3내부클래스를 접근가능
	}

}
