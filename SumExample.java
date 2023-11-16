package Day13;

class Calculator{ //외부 계산기 : 외부 클래스
	//private : 지역적인 접근제한자
	private int val1;
	private int val2; //이항연산자 : val1 + val2
	//static int val3; //JDK17버전 가능하다.
	
	//기본생성자 : 초기값을 대입을 해서 만들어준다.
	Calculator(int val1,int val2){
		//초기화
		this.val1 = val1; //입력값1
		this.val2 = val2; //입력값2
	}
	
	class Calc{ //내부 계산기 : 더하기 버튼 : 하나의 기능
		public int add() {
			return val1+val2;
		}
	}
}



public class SumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스 멤버 클래스 활용한 계산기를 만든다.
		//외부 클래스가 먼저 생성된다.
		Calculator cal = new Calculator(10,11);
		//내부 클래스가 선언되면서 호출될 수 있다. -> 외부 객체 의존
		Calculator.Calc c = cal.new Calc();
		System.out.println("합:"+c.add());
	}

}
