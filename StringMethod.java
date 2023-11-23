package Day16;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println();
		
		
		//String 클래스(java.lang) : charAt() 메서드
		//문자열을 하나의 단어 단위로 출력
		
		String word = "1I2LOVE6YOU";
		
		//문자열에서 숫자를 찾아 제거하고 문자만 출력
		String text = "";
		
		//System.out.println(word.length());
		
		//length() : 문자열 길이를 반환 해당 문자열의 길이를 반환하는 메서드를 통해서 word:11문자열
		for(int i=0; i<word.length(); i++) {
			
			//charAt(index) : String을 char[] : 글자다 하나 들어가는 캐릭터 하나의 문자로 변환
			char ch = word.charAt(i);
			//System.out.println(ch);
			
			int asciNum = ch;  //문자를 아스키코드에 의해서 10진수로 변환
			
			//System.out.println(asciNum);
			//아스키 코드 번호표를 이용해서 숫자는 결합하지 않고 문자만 결합시킨다.
			
			//소문자 a~z : 97~122 / 대문자 A~Z : 65~90
			if((asciNum >= 65 && asciNum <= 90) || (asciNum >= 97 && asciNum <= 122)) {
				//문자열 통과
				text += ch;
			}else {
				text += " ";
			}
			
		}
		System.out.println(text);
		
		
		
		//indexOf() 메서드 : 문자열에 포함된 단어 또는 문자열의 위치를 검색했을 때
		//위치의 인덱스 값을 반환
		String strindex = "HelloWorld_MyWorld";
		
		//World 처음 인덱스 번호가 어디서 시작되었는지를 알고싶어요
		System.out.println(strindex.indexOf("World"));
		
		//World 처음 인덱스 번호가 어디서 시작되었는지를 알고싶어요
		System.out.println(strindex.indexOf("World",10));
		
		
		//replaceAll(변경대상,변경할 단어) : 변경대상을 변경할 단어로 모두 바꿔준다.
		String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있어요.";
		String newstr = str.replaceAll("자바", "Java");
		
		System.out.println(str);
		System.out.println(newstr);
		
		
		//substring(시작하는 인덱스, 끝나는 인덱스) : 원하는 위치에 문자열을 잘라서 사용하는 메서드이다.
		
		String subStr = "1234-5678";
		String subStr_ = subStr.substring(5);
		System.out.println(subStr_);
		
		String rangeStr = subStr.substring(0,4);
		System.out.println(rangeStr);
		//split() : 문자를 배열로 구분해서 잘라준다.
		String subStr2 = "1234-5678";
		String[] phone = subStr2.split("-");
		System.out.println(phone[0]);
		System.out.println(phone[1]);
		
		
		//- StringBuffer / StringBuilder
		
		StringBuilder buil_str = new StringBuilder("Hello");
		buil_str.append("World");
		System.out.println(buil_str);
		System.out.println(buil_str.length());
		
		//문자열 삭제 delete
		buil_str.delete(0, 5);
		System.out.println(buil_str);
		
		//문자열 추가 insert
		buil_str.insert(0,"Hello");
		System.out.println(buil_str);
		
		//문자열 반전효과 reverse()
		buil_str.reverse();
		System.out.println(buil_str);
		
		
	}

}
