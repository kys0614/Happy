package Day13;

public class A5 {
	//문제1 : 외부 클래스의 멤버 접근 제한 : 정적/인스턴스 비교
	//인스턴스 필드와 메서드
	int filed1;
	void method1() { System.out.println("1"); }
	
	//정적 필드와 메서드
	static int filed2;
	static void method2() { System.out.println("2"); }
	
	class B{ //인스턴스 멤버 클래스
		//메서드 호출
		void method() {
			//A5 인스턴스 필드와 메서드
			filed1 = 10;
			method1();
			//A5 정적 필드와 메서드
			filed2 = 20;
			method2();
		}
	}
	
	static class C{ //정적 멤버 클래스
		//메서드 호출
		void method() {
			//A5 인스턴스 필드와 메서드 허용하지 않는다.
			//static 정적(method area)는 객체가 없어도 사용하기 때믄에
			//객체가 생성되지 않아도 사용할 수 있는 상태에서 에러가 발생할 수 있다!
			//filed1 = 10;
			//method1();
			//A5 전적 필드와 메서드
			filed2 = 20;
			method2();
			
		}
	}

}
