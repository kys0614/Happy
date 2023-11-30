package Day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class subStream_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) 성능 향상 보조 스트림
		//input
		FileInputStream readFile = null; //기반스트림
		BufferedInputStream bis = null; //보조스트림
		
		
		//output
		FileOutputStream writeFile = null; //기반스트림
		BufferedOutputStream bos = null; //보조스트림
		
		System.out.println("보조 스트림 시작");
		try {
			
			readFile = new FileInputStream("src/image/pika1.jpg"); //파일의 위치에서 스트림을 시작한다라는 경로를 만든다.(기반)
			writeFile = new FileOutputStream(""); //파일의 위치에서 스트림을 시작한다라는 경로를 만든다.(기반)
			
			//보조 스트림으로 결합한다.
			bis = new BufferedInputStream(readFile); //파일을 읽어온다.
			bos = new BufferedOutputStream(writeFile); //파일을 쓴다.
			
			
			
			while(bis.read() != -1) {
				bos.write(bis.read());
			}
			
			
			
		}catch(Exception e) {
			
		}
		
		
		
		
		

	}

}
