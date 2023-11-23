package Day16;

public class Car_string {
	
	//자동차 이름
	private String carName;
	//자동차 회사
	private String company;
	
	//인스턴스를 생성할 때 차량이름과 제조사를 초기화하는 오버로딩을 만든다.
	public Car_string(String carName,String company) {
		this.carName = carName;
		this.company = company;
	}
	
	//toString()오버라이딩 클래스.toSrting() -> 차량이름 이름 : 소나타, 제조사 : 현대
	public String toString() {
		
		return "차량이름 :" + this.carName + ",제조사 : " + this.company;
		
	}
}
