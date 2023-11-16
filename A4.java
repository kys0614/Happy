package Day13;

public class A4 {
	//지역 클래스 : 생성자 또는 메서드 안에다 내부 클래스 만든다.
	
	//A4라는 클래스 생성자 만든다.
	A4(){
		class B{ //내부 클래스
			
			B(){ //생성자 만들 수 있다.
				System.out.println("B-생성자실행");
			}
			
			void method1() {
				System.out.println("B-method1()");
			}
			
		}
		//외부 클래스 메서드 안에서 B라는 내부 클래스를 생성하고 호출한다.
		B b = new B();
		b.method1();
	}
	//B라는 내부 클래스를 만든다.
	//B라는 내부 클래스 method1을 호출한다.
	
	void UseB(int arg) { //메서드 내부 클래스 작성해서 호출하는 방법
		int var = 2;
		
		class B{ //내부 클래스
			
			B(){ //생성자 만들 수 있다.
				System.out.println("B-생성자실행");
			}
			
			void method1() {
				System.out.println("B-method1()");
				System.out.println(var);
				System.out.println(arg);
				
				//var = 3;
				//var = 2;
			}
			
		}
		
		//외부 클래스 메서드 안에서 B라는 내부 클래스를 생성하고 호출한다.
		B b = new B();
		b.method1();
	}
}
