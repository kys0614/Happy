package Day18;

import java.io.FileInputStream;
import java.io.InputStream;

public class fileInputStream_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//InputStream(입출력 최상위객체) - fileInputStream : 파일에서 바이트 단위로 자료를 읽는 기본 스트림
		
		//파일을 읽어올 변수
		int read = 0;
		
		byte[] buffer = new byte[5];
		
		//스트림 선언
		InputStream in = null; //최상위 클래스를 상속받을 수 있는 형타입으로 선언
		//파일 읽는다.
		
		try {
			
			in = new FileInputStream("src/Day18/my_file.txt"); //메모장의 경로로 스트림을 받아 들인다.
			
			while(true) { //무한반복을 사용해서 버퍼를 읽어보자.
				//파일 읽기
				read = in.read(buffer);
				
				//파일이 끝나는 지점 -1
				if(read==-1) {
					break;
				}
				System.out.println(new String(buffer,0,5));
				
			}
			
			
		}catch(Exception e) {
			System.out.println("Error:"+ e.getMessage());	
		}finally { //예외처리 종료된 시점에 처리를 한다.
			
			//객체가 사용중이라면 닫는다.
			try {
				if(in!=null) {
				in.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		//파일의 끝지점 -1 반환 --> 파일을 닫는다.
		
		

	}

}