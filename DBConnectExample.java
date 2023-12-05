package dbconn;

import java.sql.*;
import java.util.Scanner;

public class DBConnectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbDriver = "org.mariadb.jdbc.Driver"; //디비 드라이버 설정
		String dbUrl = "jdbc:mariadb://localhost:23306/jdbc"; //디비 URL
		String id = "root";  //계정이름
		String passwd = "1234";
		Connection conn = null;  //디비실행(CRUD)
		PreparedStatement pstmt = null;
		
		//Scanner 선언 : select Rows()
		Scanner scan = new Scanner(System.in);
		try {
			//내부적으로 데이터베이스 드라이버 로드
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbUrl,id,passwd); //디비 연결
			
			if(conn != null) {
				System.out.println("DB 연결 완료");
				
				//SQL 문법 작성
				String query = "select * from jdbc.student_info";
				
				//데이터 문서 객체를 만들어서 전달
				Statement st = conn.createStatement();
				
				ResultSet res = st.executeQuery(query);
				
				while(res.next()) {
					
					System.out.println("학생 번호:"+res.getString("std_id"));
					System.out.println("학생 이름:"+res.getString("std_name"));
					System.out.println("학생 나이:"+res.getInt("std_age"));
					System.out.println("학생 학년:"+res.getInt("std_grade"));
					System.out.println("학생 성별:"+res.getString("std_gender"));
					System.out.println("학생 연락처:"+res.getString("std_phone"));
					
					System.out.println();
				}
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				//scan 값 닫기
				if(scan!=null) {
					scan.close();
				}
				//pstmt
				if(pstmt!=null) {
					pstmt.close();
				}
				//conn
				if(conn!=null) {
					conn.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		

	}

}
