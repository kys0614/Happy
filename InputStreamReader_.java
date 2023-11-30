package Day18;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InputStreamReader_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reader -> InputStream/FileReader
		
		//파일을 읽어오는 변수다.
		int read = 0;
		Reader reader = null;
		//스트림 선언
		char[] buffer = new char[256];
		try {
			reader = new FileReader("src/Day18/file_korean.txt");  //파일을 만든 경로를 찾아서 넣는다.
			while(true) {
				//파일읽기
				read = reader.read();
				//-1이면 종료
				if(read == -1) {
					break;
				}
				System.out.print(String.valueOf(buffer,0,read));
			}
		}catch(Exception e) {
			
		}
		
				
		

	}

}
