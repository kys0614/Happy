package Day4;

import java.util.Scanner;

public class day04_20131020_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		// if��
		//score ������ ���� 60�� �ְ�
		//score ������ 60���� ũ�ų� ���� ��� �հ��Դϴ�. ���
		int score = 60;
		if (score>=60) {
			System.out.println("�հ��Դϴ�.");
		}
		
		// System.out.println();		
		
		//��ĳ�� �̿� : input
		//���̸� �Է��ϼ��� ��� ����ϰ� �Է��մϴ�.
		//���̰� 19���� Ŭ ���� �����Դϴٶ�� ����غ�����.
		
		System.out.println("���̸� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt(); // �Է°��� ������ �޴´�.
		if(age>19) {
			System.out.println("�����Դϴ�. �����ϼ���");
		}
		
		//2) if-else : ���ǽĿ� ���� ������ �����ؾ��ϴ� ��ɹ��̴�.
		//number ������ �����ϰ� 5�� �����Ѵ�.
		//5�� 4���� Ŭ��� ũ�ٶ�� ������ְ� �ƴҰ��� �۴ٶ�� ����Ѵ�.
		int number = 5;
		if(number>4) {
			System.out.println("5�� 4���� ũ��.");
		}else {
			System.out.println("5�� 4���� �۴�.");
		}
		
		
		//a�� b�� ���ؼ� ū ���� ��� max�ȿ� ������ �����Ѵ�.
		//�������� �ƽ��� ���� ���ִ� ������ max �ִ밪�� ����Ѵ�.
		//if-else ó���ؼ� ����� ������.
		
		int a = 4;
		int b = 10;
		int max = 0;
		
		// ����� a>b�� ������ ��Ƽ� ���ǹ����� �����.
		
		if(a>b) {
			max = a;
		} else {
			max = b;
		}
		
		System.out.println("a:"+a+"�� b :"+b+" �߿��� ū ����"+max+"�Դϴ�.");
		
		//else-if : ���ǽ��� ������ ���� ��� ����Ѵ�.
		//����1 : �����ϴ� �����Ѵ�. = ������ �ִ´�. (������ ���� �����.)
		//	1)�����ϴ� ���ڰ� 5���� Ŭ ���� "�����ϴ� ���ڰ� 5���� Ů�ϴ�."
		//	2)�����ϴ� ���ڰ� 7�� ��쿡�� "�����ϴ� ���ڴ� 7�Դϴ�." ��� ����Ѵ�.
		
		int fav = 2; // 7�� ������ �ִ´�.
		
		if(fav==7) {
			System.out.println("�����ϴ� ���ڴ� 7�Դϴ�.");
		} else if(fav>5) {
			System.out.println("�����ϴ� ���ڰ� 5���� Ů�ϴ�.");
		} else {
			System.out.println("�����ϴ� ���ڴ� 5���� �۽��ϴ�.");
		}	
		
		//����2 : ������ �Է��Ѵ�.
		//90���� ũ�ų� ������ = "A" Ǯ���Ѵ�.
		//80���� ũ�ų� ������ = "B" Ǯ���Ѵ�.
		//70���� ũ�ų� ������ = "C" Ǯ���Ѵ�.
		//�������� = "D" ����Ѵ�.
		
		Scanner input = new Scanner(System.in);
		int score_ = input.nextInt(); //������ �Է¹޴´�.
		//if-else if ����ؼ� ������ ����غ���.
		
		if(score_>=90) {
			System.out.println("A");
		} else if(score_>=80) {
			System.out.println("B");
		} else if (score_>=70) {
			System.out.println("c");
		} else {
			System.out.println("D");
		}
		
		*/
		
		//switch�� : if���� �Ǵ�(true/false)�� ���� ���๮�� �����Ǿ��ٸ� switch���� ������ ���� ���� ���๮�� �����ȴ�.
		//����1 : 
		//��°�� : number 7 �Դϴ�. �������
		//case 1 : number1�Դϴ�. / case 7 : number7�Դϴ�. / default : �� �� �ƴϴ�. = break
		
		
		/*
		
		int result = 7;
		
		switch(result) {
			case 1:
				System.out.println("number1�Դϴ�.");
				break;
			case 7:
				System.out.println("number7�Դϴ�.");
				break;
			default:
				System.out.println("�� �� �ƴϴ�.");
		}
		
		
		//����2: ���� �Է��ϰ� ������ �������
		//case 3������ 11�������� ���� ������ ������.
		//�� �������� "������ ������ 000�Դϴ�."
		//3~5�� : �� 6~8�� : ���� 9~11�� : ���� 12~2�� : �ܿ�
		
		System.out.println("������ ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		//case 3������ 11�������� ���� ������ ������.
		//switch = ����� = �Է°� (����)
		
		
		switch (month) {
			case 3:
				System.out.println("������ ������ ���Դϴ�.");
				break;
			case 4:
				System.out.println("������ ������ ���Դϴ�.");
				break;
			case 5:
				System.out.println("������ ������ ���Դϴ�.");
				break;
			case 6: case 7: case 8:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("������ ������ �����Դϴ�.");
				break;
			default: 
			//case12 : case1 : case2 : 
				System.out.println("������ ������ �ܿ��Դϴ�.");
		}
		
		
		
		//System.out.println("");
		
		*/
		
		
		
		//����3 : ��ĭ�� �ڵ带 switch������ ��������
		
		int a_ = 25;
		
		switch(a_/10) { // a_/10 = 2.5
				case 2:
				System.out.println("a�� 20 �̻��� �����Դϴ�.");
		}
		
	}

}
