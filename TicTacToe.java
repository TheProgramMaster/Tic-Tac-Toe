import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe {
	public JFrame frame = new JFrame("Tic Tac Toe Game");
	public JPanel panel = new JPanel();
	public JButton button1 = new JButton();
	public JButton button2 = new JButton();
	public JButton button3 = new JButton();
	public JButton button4 = new JButton();
	public JButton button5 = new JButton();
	public JButton button6 = new JButton();
	public JButton button7 = new JButton();
	public JButton button8 = new JButton();
	public JButton button9 = new JButton();
	public boolean buttonOnePressed;
	public boolean buttonTwoPressed;
	public boolean buttonThreePressed;
	public boolean buttonFourPressed;
	public boolean buttonFivePressed;
	public boolean buttonSixPressed;
	public boolean buttonSevenPressed;
	public boolean buttonEightPressed;
	public boolean buttonNinePressed;
	public boolean gameOver;
	public boolean[] buttonsPressed = {buttonOnePressed,buttonTwoPressed,buttonThreePressed,
			buttonFourPressed,buttonFivePressed,buttonSixPressed,buttonSevenPressed,buttonEightPressed,buttonNinePressed};
	public JButton[] buttons = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
	public ActionListener listener = new ButtonListener();
	public int turn;
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
	}
	public class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Top-Left button is pressed.
			if(e.getSource() == button1) {
				//Show error message if button is already pressed.
				if(buttonsPressed[0] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 pressed button.
					if(turn%2==0) {
						button1.setText("X");
					}
					//Player 2 pressed button.
					else {
						button1.setText("O");
					}
					buttonsPressed[0] = true;
					turn += 1;
					}
				}
			//Top-middle button is pressed.
			if(e.getSource() == button2) {
				//Show error message if button already pressed.
				if(buttonsPressed[1] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 presses button.
					if(turn%2==0) {
						button2.setText("X");
					}
					//Player 2 presses button.
					else {
						button2.setText("O");
					}
					buttonsPressed[1] = true;
					turn += 1;
					}
				}
			//Top-Right button is pressed.
			if(e.getSource() == button3) {
				//Show error message if button already pressed.
				if(buttonsPressed[2] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}
				else {
					//Player 1 presses button.
					if(turn%2==0) {
						button3.setText("X");
					}
					//Player 2 presses button.
					else {
						button3.setText("O");
					}
					buttonsPressed[2] = true;
					turn += 1;
					}
				}
			//Middle-left button is pressed.
			if(e.getSource() == button4) {
				//Show error message if button already pressed.
				if(buttonsPressed[3] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 presses button.
					if(turn%2==0) {
						button4.setText("X");
					}
					//Player 2 presses button.
					else {
						button4.setText("O");
					}
					buttonsPressed[3] = true;
					turn += 1;
					}
				}
			//Center button is pressed.
			if(e.getSource() == button5) {
				//Show error message if button already pressed.
				if(buttonsPressed[4] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 presses button.
					if(turn%2==0) {
						button5.setText("X");
					}
					//Player 2 presses button.
					else {
						button5.setText("O");
					}
					buttonsPressed[4] = true;
					turn += 1;
					}
				}
			//Middle-Right button is pressed.
			if(e.getSource() == button6) {
				//Show error message if button already pressed.
				if(buttonsPressed[5] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 presses button.
					if(turn%2==0) {
						button6.setText("X");
					}
					//Player 2 presses button.
					else {
						button6.setText("O");
					}
					buttonsPressed[5] = true;
					turn += 1;
					}
				}
			//Bottom-Left button is pressed.
			if(e.getSource() == button7) {
				//Show error message if button already pressed.
				if(buttonsPressed[6] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 presses button.
					if(turn%2==0) {
						button7.setText("X");
					}
					//Player 2 presses button.
					else {
						button7.setText("O");
					}
					buttonsPressed[6] = true;
					turn += 1;
					}
				}
			//Bottom-middle button is pressed.
			if(e.getSource() == button8) {
				//Show error message if button already pressed.
				if(buttonsPressed[7] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 presses button.
					if(turn%2==0) {
						button8.setText("X");
					}
					//Player 2 presses button.
					else {
						button8.setText("O");
					}
					buttonsPressed[7] = true;
					turn += 1;
					}
				}
			//Bottom-Right button is pressed.
			if(e.getSource() == button9) {
				//Show error message if button already pressed.
				if(buttonsPressed[8] == true) {
					JOptionPane.showMessageDialog(frame,"That button is already selected. Please select another option.","",JOptionPane.ERROR_MESSAGE);
				}else {
					//Player 1 pressed button.
					if(turn%2==0) {
						button9.setText("X");
					}
					//Player 2 pressed button.
					else {
						button9.setText("O");
					}
					buttonsPressed[8] = true;
					turn += 1;
					}
				}
			}
		}
	public boolean checkWin() {
		//Check vertical wins.
		if(buttons[0].getText()==buttons[3].getText()&&button3.getText()==buttons[6].getText()) {
			if(!buttons[0].getText().equals("")&&!buttons[3].getText().equals("")&&!buttons[6].getText().equals("")) {
				return true;
			}
		}else if(buttons[1].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[7].getText()) {
			if(!buttons[1].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[7].getText().equals("")) {
				return true;
			}
		}else if(buttons[2].getText()==buttons[5].getText()&&buttons[5].getText()==buttons[8].getText()) {
			if(!buttons[2].getText().equals("")&&!buttons[5].getText().equals("")&&!buttons[8].getText().equals("")) {
				return true;
			}
		}
		//Check Horizontal wins.
		else if(buttons[0].getText()==buttons[1].getText()&&buttons[1].getText()==buttons[2].getText()) {
			if(!buttons[0].getText().equals("")&&!buttons[1].getText().equals("")&&!buttons[2].getText().equals("")) {
				return true;
			}
		}else if(buttons[3].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[5].getText()) {
			if(!buttons[3].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[5].getText().equals("")) {
				return true;
			}
		}else if(buttons[6].getText()==buttons[7].getText()&&buttons[7].getText()==buttons[8].getText()) {
			if(!buttons[6].getText().equals("")&&!buttons[7].getText().equals("")&&!buttons[8].getText().equals("")) {
				return true;
			}
		}
		//Check diagonal wins.
		else if(buttons[0].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[8].getText()) {
			if(!buttons[0].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[8].getText().equals("")) {
				return true;
			}
		}else if(buttons[6].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[2].getText()) {
			if(!buttons[6].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[2].getText().equals("")) {
				return true;
			}
		}
		//Return false if no wins.
		return false;
	}
	public String checkWinner() {
		String win = "";
		//Check vertical wins.
				if(buttons[0].getText()==buttons[3].getText()&&button3.getText()==buttons[6].getText()) {
					if(!buttons[0].getText().equals("")&&!buttons[3].getText().equals("")&&!buttons[6].getText().equals("")) {
						win = buttons[0].getText();
					}
				}else if(buttons[1].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[7].getText()) {
					if(!buttons[1].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[7].getText().equals("")) {
						win = buttons[1].getText();
					}
				}else if(buttons[2].getText()==buttons[5].getText()&&buttons[5].getText()==buttons[8].getText()) {
					if(!buttons[2].getText().equals("")&&!buttons[5].getText().equals("")&&!buttons[8].getText().equals("")) {
						win = buttons[2].getText();
					}
				}
				//Check Horizontal wins.
				else if(buttons[0].getText()==buttons[1].getText()&&buttons[1].getText()==buttons[2].getText()) {
					if(!buttons[0].getText().equals("")&&!buttons[1].getText().equals("")&&!buttons[2].getText().equals("")) {
						win = buttons[0].getText();
					}
				}else if(buttons[3].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[5].getText()) {
					if(!buttons[3].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[5].getText().equals("")) {
						win = buttons[3].getText();
					}
				}else if(buttons[6].getText()==buttons[7].getText()&&buttons[7].getText()==buttons[8].getText()) {
					if(!buttons[6].getText().equals("")&&!buttons[7].getText().equals("")&&!buttons[8].getText().equals("")) {
						win = buttons[6].getText();
					}
				}
				//Check diagonal wins.
				else if(buttons[0].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[8].getText()) {
					if(!buttons[0].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[8].getText().equals("")) {
						win = buttons[0].getText();
					}
				}else if(buttons[6].getText()==buttons[4].getText()&&buttons[4].getText()==buttons[2].getText()) {
					if(!buttons[6].getText().equals("")&&!buttons[4].getText().equals("")&&!buttons[2].getText().equals("")) {
						win = buttons[6].getText();
					}
				}
		return win;
	}
	public void checkTurn() {
		if(checkWin()==true) {
			if(checkWinner()=="X") {
				JOptionPane.showMessageDialog(frame,"Player 1 won!","",JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(frame, "Player 2 won!","",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	public TicTacToe(){
		//Set game to run.
		gameOver = false;
		//Determine boolean nature of pressed state of each button.
		for(int i = 0;i < buttonsPressed.length;i++) {
			buttonsPressed[i] = false;
		}
		//Add action listeners to each button.
		for(int i = 0;i < buttons.length;i++) {
			buttons[i].addActionListener(listener);
		}
		//Create frame and panel of application.
		panel.setLayout(new GridLayout(3,3));
		for(int i = 0;i < buttons.length;i++) {
			panel.add(buttons[i]);
		}
		frame.add(panel);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//First turn.
		JOptionPane.showMessageDialog(frame,"Player 1 Please Start","",JOptionPane.INFORMATION_MESSAGE);
		while(turn==0&&gameOver==false) {
			frame.setTitle("Player 1 is now playing.");
		}
		//Second turn.
		JOptionPane.showMessageDialog(frame, "Player 2 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		while(turn==1&&gameOver==false) {
			frame.setTitle("Player 2 is now playing.");
		}
		//Third turn.
		JOptionPane.showMessageDialog(frame, "Player 1 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		while(turn==2&&gameOver==false) {
			frame.setTitle("Player 1 is now playing.");
		}
		//Fourth turn.
		if(gameOver==false) {
			checkTurn();
		}
		if(checkWin()==true) {
			gameOver=true;
		}
		if(gameOver==false) {
			JOptionPane.showMessageDialog(frame, "Player 2 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		}
		while(turn==3&&gameOver==false) {
			frame.setTitle("Player 2 is now playing.");
		}
		//Fifth turn.
		if(gameOver==false) {
			checkTurn();
		}
		if(checkWin()==true) {
			gameOver=true;
		}
		if(gameOver==false) {
			JOptionPane.showMessageDialog(frame, "Player 2 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		}
		while(turn==4&&gameOver==false) {
			frame.setTitle("Player 1 is now playing.");
		}
		//Sixth turn.
		if(gameOver==false) {
			checkTurn();
		}
		if(checkWin()==true) {
			gameOver=true;
		}
		if(gameOver==false) {
			JOptionPane.showMessageDialog(frame, "Player 2 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		}
		while(turn==5&&gameOver==false) {
			frame.setTitle("Player 2 is now playing.");
		}
		//Seventh turn.
		if(gameOver==false) {
			checkTurn();
		}
		if(checkWin()==true) {
			gameOver=true;
		}
		if(gameOver==false) {
			JOptionPane.showMessageDialog(frame, "Player 2 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		}
		while(turn==6&&gameOver==false) {
			frame.setTitle("Player 1 is now playing.");
		}
		//Eight turn.
		if(gameOver==false) {
			checkTurn();
		}
		if(checkWin()==true) {
			gameOver=true;
		}
		if(gameOver==false) {
			JOptionPane.showMessageDialog(frame, "Player 2 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		}
		while(turn==7&&gameOver==false) {
			frame.setTitle("Player 2 is now playing.");
		}
		//Ninth turn.
		if(gameOver==false) {
			checkTurn();
		}
		if(checkWin()==true) {
			gameOver=true;
		}
		if(gameOver==false) {
			JOptionPane.showMessageDialog(frame, "Player 2 Please Take a Turn","",JOptionPane.INFORMATION_MESSAGE);
		}
		while(turn==8&&gameOver==false) {
			frame.setTitle("Player 1 is now playing.");
		}
		if(checkWinner()=="") {
			JOptionPane.showMessageDialog(frame, "The game is a draw","",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
