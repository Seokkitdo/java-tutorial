package window_help_gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JList;

public class test extends JFrame implements MouseListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public test() {
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(1300, 800);
		
		
		JLabel Title = new JLabel("KH음식점"); //메인프레임 상단타이틀
		Title.setFont(new Font("돋움", Font.PLAIN, 30)); // 메인타이틀 글자 굵게
		
		JPanel panel = new JPanel();
		panel.setBounds(761, 172, 450, 420);
		frame.getContentPane().add(panel);
		
		
		Title.setForeground(Color.white);
		Title.setBounds(600, 20, 500, 40);
		frame.getContentPane().add(Title);
				
		
		JButton kfood_btn = new JButton("한식");
		kfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		kfood_btn.setBackground(new Color(0, 14, 39));
		kfood_btn.setForeground(Color.WHITE);
		kfood_btn.setBounds(45, 91, 161, 59);
		frame.getContentPane().add(kfood_btn);
		
		JButton cfood_btn = new JButton("중식");
		cfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		cfood_btn.setForeground(Color.WHITE);
		cfood_btn.setBounds(218, 91, 161, 59);
		cfood_btn.setBackground(new Color(0, 14, 39));
		frame.getContentPane().add(cfood_btn);
		
		JButton wfood_btn = new JButton("양식");
		wfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		wfood_btn.setForeground(Color.WHITE);
		wfood_btn.setBounds(391, 91, 161, 59);
		wfood_btn.setBackground(new Color(0, 14, 39));
		frame.getContentPane().add(wfood_btn);
		
		JButton jfood_btn = new JButton("일식");
		jfood_btn.setFont(new Font("돋움", Font.PLAIN, 20));
		jfood_btn.setForeground(Color.WHITE);
		jfood_btn.setBounds(564, 91, 161, 59);
		jfood_btn.setBackground(new Color(0, 14, 39));
		frame.getContentPane().add(jfood_btn);
		
		JButton btn_0 = new JButton("음식 1");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton button = new JButton("테스트");
				button.setBounds(780, 172, 100, 50);
				panel.add(button);
				frame.getContentPane().add(panel);
			}
		});
		btn_0.setBounds(45, 199, 202, 187);
		frame.getContentPane().add(btn_0);
		
		JButton btn_1 = new JButton("음식 2");
		btn_1.setBounds(269, 199, 202, 187);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("음식 3");
		btn_2.setBounds(495, 199, 202, 187);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("음식 4");
		btn_3.setBounds(45, 478, 202, 187);
		frame.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("음식 5");
		btn_4.setBounds(269, 478, 202, 187);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("음식 6");
		btn_5.setBounds(495, 478, 202, 187);
		frame.getContentPane().add(btn_5);
		
		
		
		
		
		kfood_btn.addMouseListener(this);
		cfood_btn.addMouseListener(this);
		wfood_btn.addMouseListener(this);
		jfood_btn.addMouseListener(this);
		
		
		
		frame.getContentPane().setBackground(new Color(37, 23, 22));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 172, 713, 516);
		frame.getContentPane().add(panel_1);
		
		
	
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(223,195,130));
        b.setForeground(Color.black);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(223,195,130));
        b.setForeground(Color.black);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(new Color(0, 14, 39));
        b.setForeground(Color.white);
	
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
