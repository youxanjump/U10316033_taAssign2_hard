import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class QandA extends JFrame{

	int score = 0;

	public QandA(){
		
		q1 Q1 = new q1();

		add(Q1.detail());
		add(Q1.answer());
		add(Q1.scoreNext());
		
		
	}
	
	public static void main(String[] args){
		JFrame frame = new QandA();
		frame.setTitle("Q and A");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setVisible(true);	
		frame.setLayout(new GridLayout(3,1));
	}

}

class q1{
	JLabel qDetail = new JLabel("What notes compose chord C ?");
	JRadioButton a = new JRadioButton("C E G");
	JRadioButton b = new JRadioButton("D #F A");
	JRadioButton c = new JRadioButton("C A B");
	JRadioButton d = new JRadioButton("G D B");
	ButtonGroup choice = new ButtonGroup();
	JLabel score = new JLabel("Score: ");
	JTextField Score = new JTextField(5);
	int scoreInt = 0;
	JButton next = new JButton("NEXT");
	
	public q1(){
		choice.add(a);
		choice.add(b);
		choice.add(c);
		choice.add(d);
		
		next.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(a.isSelected()){
					scoreInt += 10;
					Score.setText(String.format("%d" , scoreInt));
				}
				else{
					Score.setText(String.format("%d" , scoreInt));
				}
			}
		});
	
	}
	
	
	JPanel detail(){
		JPanel detail = new JPanel();
		detail.setSize(250,200);
		detail.setLayout(new FlowLayout(FlowLayout.LEFT));
		detail.setBorder(new TitledBorder("Q1 / 10"));
		detail.setBackground(Color.WHITE);
		detail.add(qDetail);
		
		return detail;
	}
	
	JPanel answer(){
		JPanel answer = new JPanel();
		answer.setLayout(new GridLayout(4,1));
		answer.add(a);
		answer.add(b);
		answer.add(c);
		answer.add(d);
		
		return answer;
	}
	
	JPanel scoreNext(){
		JPanel scoreNext = new JPanel();
		scoreNext.setLayout(new FlowLayout(FlowLayout.LEFT));
		scoreNext.add(score);
		scoreNext.add(Score);
		scoreNext.add(next);
		
		return scoreNext;
	}
}
