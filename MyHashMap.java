package Day17;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		
		//데이터 삽입 : map -> key : 숫자가 아니다. 문자형태로 키 값을 저장할 수 있다. => 코드값으로 정의된다.
		map.put("spring", "봄");
		map.put("summer", "여름");
		map.put("fall", "가을");
		map.put("winter", "겨울");
		
		//데이터 삭제
		map.remove("winter");
		
		//특정 키가 존재하는지 확인
		System.out.println("Is Exist Key :"+map.containsKey("winter"));
		
		//특정 키 값이 존재확인 - 중복 신경쓰지않는 확인
		System.out.println("Is Exist Value :"+map.containsValue("가을"));
		
		//출력
		System.out.println("get Data:"+map.get("spring"));

	}

}
