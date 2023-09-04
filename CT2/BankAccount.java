package CT2;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankAccount extends JPanel implements ActionListener{
	
	JButton deposit = new JButton("Deposit");

	JButton withdraw = new JButton("Withdraw");

	JButton exit = new JButton("Exit");
	TextField t1, t2, output;
	Label depositAcc, withdrawAcc, currentbalance;
	double accountBalance=0.0;
	
	public BankAccount(JFrame frame) {

		/*

		*

		* creating label , setting boundaries and adding to frame

		*/

		depositAcc = new Label(" Deposit Amount :");

		depositAcc.setBounds(50, 100, 100, 50);

		frame.add(depositAcc);
		
		//creating text box and seting boundaries and adding to frame
		t1 = new TextField("");

		t1.setBounds(150, 110, 100, 50);

		frame.add(t1);
		
		withdrawAcc = new Label(" Withdraw Amount :");

		withdrawAcc.setBounds(50, 180, 100, 50);

		frame.add(withdrawAcc);
		
	//creating text box and seting boundaries and adding to frame
		
		t2 = new TextField("");

		t2.setBounds(150, 180, 100, 50);

		frame.add(t2);

		deposit.addActionListener(this);

		deposit.setBounds(150,250, 150,30);

		frame. add(deposit);

		withdraw.addActionListener(this);

		withdraw.setBounds(300,250, 150,30);

		frame.add(withdraw);
		//creating label , setting boundaries and adding to frame
		currentbalance = new Label(" Current Balance :");

		currentbalance.setBounds(300, 180, 100, 50);

		frame.add(currentbalance);
		//creating text box and setting boundaries and adding to frame
		output = new TextField("");

		output.setBounds(400, 180, 100, 50);

		frame.add(output);

		exit.addActionListener(this);

		exit.setBounds(450,250, 150,30); ;

		frame.add(exit);

		}
	
		
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame();

		frame.getContentPane().add(new BankAccount(frame));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(700, 400);

		frame.setVisible(true);

		}
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Deposit")) {

		System.out.println("Deposit has been clicked");

		String currentbalance = t1.getText();

		double depositAmount = Double.parseDouble(currentbalance);

		accountBalance=accountBalance+depositAmount;

		output.setText(String.valueOf(accountBalance));

		t1.setText("");

		} else if (e.getActionCommand().equals("Withdraw")) {

		System.out.println("Withdraw has been clicked");

		String currentbalance = t2.getText();

		double withdrawAmount = Double.parseDouble(currentbalance);

		accountBalance=accountBalance-withdrawAmount;

		output.setText(String.valueOf(accountBalance));

		t2.setText("");

		}else if(e.getActionCommand().equals("Exit")){

		System.out.println("You are exited : Thank you");

		System.exit(0);

		}

		}

		

	}


