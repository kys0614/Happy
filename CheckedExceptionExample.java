package Day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

		// TODO Auto-generated method stub
		//일반 예외 : 입출력 오류 (체크될 상황이 강제적이다.)
		BufferedReader reader = null;
		try {
			//입출력 코드는 에러처리가 일반예외 처리
			reader = new BufferedReader(new FileReader("example.txt"));
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//finally : 사용자가 선책가능  try-catch
			try {
				//reader 입출력 버퍼가 있는 경우 버퍼를 닫는다.
				if(reader!=null) {
					reader.close();
				}
			}catch(IOException e) {
				//
				
				e.printStackTrace();
			}
				
			//reader 입출력 버퍼가 없는 경우는 다시 에러코드를 발생시켜서 확인한다.
		}		
		
}
		
}
