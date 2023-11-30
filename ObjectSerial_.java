package Day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectSerial_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체로 만들어줘야하는 클래스
		Person_ p1 = new Person_("SBS",10);
		Person_ p2 = new Person_("SBS2",20);
		
		FileOutputStream out = null;
		FileInputStream in = null;
		
		try {
			
			out = new FileOutputStream("object_data.dat");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			
			System.out.println("파일 객체 스트림 완성");
			
			
		}catch(Exception e) {
			
		}

	}

}
