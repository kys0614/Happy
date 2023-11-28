package Day17;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<TextMessage> msgSet = new HashSet<>();
		
		//TextMessage 생성 -> 인스턴스 -> 클래스의 공간을 HashSet(중복을 체크한다.)
		TextMessage msg1 = new TextMessage(1001, "안녕하세요");
		TextMessage msg2 = new TextMessage(1001, "안녕하세요");
		TextMessage msg3 = new TextMessage(1001, "안녕하세요");
		TextMessage msg4 = new TextMessage(1002, "안녕하세요");
		TextMessage msg5 = new TextMessage(1003, "안녕");
		
		//메세지 객체 생성
		
		//Set 추가 : 인스턴스화 시킨 객체를 따로 추가해서 Set자료구조 각각 저장해본다.
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		
		//저장된 크기 확인 : Set 자료구조 ㄱ길이를 알기 위해서 메소드 : size()
		System.out.println("사이즈:"+msgSet.size());
		
		//출력 : for문 이용해서 자료구조를 탐색해서 출력해보자. Foreach -> 배열이나 구조화된 공간에 값을 한꺼번에 정의해서 꺼낼 수 있다.
		for(TextMessage msg: msgSet) {
			System.out.println("번호:"+msg.getMsgNumber()+"메세지:"+msg.getMsg());
		}
		
		//데이터 삭제
		msgSet.remove(msg5);
		
		//저장된 크기 확인 : Set 자료구조 길이를 알기 위해서 메소드 : size()
		System.out.println("사이즈:"+msgSet.size());
		
		//출력 : for문을 이렬해서 자료구조를 탐색해서 출력해보자. Foreach -> 배열이나 구조화된 공간에 값을 한꺼번에 정의해서 꺼낼 수 있다.
		for(TextMessage msg : msgSet) {
			System.out.println("번호:"+msg.getMsgNumber()+",메세지:"+msg.getMsg());
		}
		
	}

}
