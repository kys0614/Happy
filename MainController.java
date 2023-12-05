package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionLister {
	
	MainView mainView;
	
	public MainController() {
		mainView = new MainView();
		mainView.btn_game.addActionListener(this);  //게임시작이벤트 탐지
		mainView.btn_rank.addActionListener(this);  //게임시작이벤트 탐지
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
