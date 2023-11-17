package Day14;
//System.out.println();

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술면산자로 계산을 할 경우 산술이 잘못된 처리를 해서 에러가 발생한 경우
		int result = 0;
		
		try {
			
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0으로 나누기를 할 수 없습니다.");
		}finally {
			System.out.println("프로그램 종료");
		}
		//result = 10/0;
		//System.out.println(result);

	}

}
