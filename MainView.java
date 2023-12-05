package game;

import java.awt.FlowLayout;

import javax.swing.*; //*전체를 받아오기 import

public class MainView extends JFrame {
	JButton btn_game = new JButton("게임 시작");
	JButton btn_rank = new JButton("랭킹 확인");
	
	public MainView() {
		setLayout(new FlowLayout());
		
		add(btn_game);
		add(btn_rank);
		
		setSize(600,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainView();

	}*/

}
