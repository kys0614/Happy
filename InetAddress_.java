package Day18;

import java.net.InetAddress;

public class InetAddress_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//-IP : 주소 앋기
		try {
			
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소:"+local.getHostAddress());
			System.out.println("내 컴퓨터 IP 주소:"+local.getHostName());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소:"+remote.getHostAddress());
			}
			
		}catch(Exception e) {
			
		}

	}

}
