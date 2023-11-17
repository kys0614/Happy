package Day14;

public class Exception_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. NullPointerException : 객체를 선언하면 인스턴스 주소가 가지게 되는데 객체는 정의되는데 실제 메모리가 없는 상태
		System.out.println("##########NullPointerException##########");
		
		String[] strArray = null;
		//System.out.println("strArray[0]:"+strArray[0]);
		
		
		//2. NumberFormateException : 잘못된 숫자로 형변환이 발생하거나 숫자 형태의 문자열은 정수타입으로 가능하나 실수형은 문자형으로 반환할 때 오류가 생김
		System.out.println("##########NumberFormateException##########");
		String str01 = "11";
		String str02 = "11.0";
		int num01 = Integer.parseInt(str01);
		System.out.println("String int "+ num01);
		//int num01 = Integer.parseInt(str02);
		
		
		//3. ArrayIndexOutofBoundsException : 배열에서 인덱스 범위게서 초과할 때 발생하는 오류이다.
		System.out.println("##########ArrayIndexOutofBoundsException##########");
		int[] arr = {1,6,7,9,10};
		System.out.println(arr[6]);
	}

}
