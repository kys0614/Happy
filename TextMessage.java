package Day17;

public class TextMessage {
	//메세지를 식별하는 번호
	private int megNumber; //번호
	private String msg;  //메세지 내용
	
	public TextMessage(int msgNumber,String msg) {
		this.megNumber = msgNumber;
		this.msg = msg;
	}
	
	//메소드를 활용해서 private 접근제한자를 꺼내는 메서드
	public int getMsgNumber() {
		return megNumber;
	}
	
	//메소드를 활용해서 private 접근제한자를 꺼내는 메서드
	public String getMsg() {
		return msg;
	}
	
	public int hashcode() {
		//식별 번호 리턴
		return megNumber;
	}
	
	//equals : 동등비교 == 동등비교 (주소==주소) || equals()
	//내용을 식별할 수 있는 메소드 재정의해서 만든다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TextMessage) { //TextMessage 클래스를 사용하는 인스턴스가 True야
			TextMessage compare = (TextMessage)obj;
			if(this.msg.equals(compare.getMsg())) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
	}

}
