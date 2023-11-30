package Day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStream_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream in = null; //읽어온다.
		OutputStream out = null; //입력한다.
		try {
			out = new FileOutputStream("src/Day18/write.txt",false); //true:이어쓰기 옵션 false : 새로 만든다.
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');
			
			out.write('W');
			out.write('O');
			out.write('R');
			out.write('L');
			out.write('D');
			
			in = new FileInputStream("src/image/pika1.jpg"); //복사할 사진 파일을 읽어온다.
			out = new FileOutputStream("src/image/pika1_copy.jpg"); //읽어온 파일을 복사한다 -> 쓰고 저장한다.
			//byte[] buffer = new byte[512];
			
			//파일을 복사할 시간 단위를 만들어서 얼마나 걸리는지 알아본다.
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read = 0;
			
			while((read = in.read()) != -1) {
				out.write(read);
			}
			
			System.out.println("이미지 읽기 종료");
			
			long end = System.currentTimeMillis();
			double time = (double)(end-start); //종료초-시작초
			
			System.out.println(time+"초");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
