package mimiproject.kh.mini.view;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class FoodMain extends JFrame{
	
	public FoodMain() {
		
		setSize(500, 700); //���������� ������
		getContentPane().setLayout(null); 
//		JPanel panel = new JPanel(); // �г� ��ü����
//		frame.getContentPane().setLayout(null);
		setLocationRelativeTo(null); //���������� �����ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel mainTitle = new JLabel("***** Ǫ����Ʈ�Դϴ� *****"); //���������� ���Ÿ��Ʋ
		mainTitle.setFont(new Font("Serif", Font.BOLD, 11)); // ����Ÿ��Ʋ ���� ����
		mainTitle.setFont(mainTitle.getFont().deriveFont(30.0f)); //����Ÿ��Ʋ ����ũ������
		mainTitle.setBounds(50, 50, 500, 50); // ����Ÿ��Ʋ ��ġ
		getContentPane().add(mainTitle); //����Ÿ��Ʋ �����ӿ� �߰�
		
		JButton kfood_btn = new JButton("�ѽ��Դϴ�"); //�ѽĹ�ư
		getContentPane().add(kfood_btn); 
		kfood_btn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) { 
				new koreanMenu(); 
			} 
		}); 
		kfood_btn.setBounds(150, 150, 200, 50); //��ġ����
		getContentPane().add(kfood_btn); // �����ӿ� ��ġ�߰�
		
		
		JButton wfood_btn = new JButton("����Դϴ�");
		wfood_btn.setBounds(150, 250, 200, 50);
		getContentPane().add(wfood_btn);
		
		
		JButton cfood_btn = new JButton("�߽��Դϴ�");
		cfood_btn.setBounds(150, 350, 200, 50);
		getContentPane().add(cfood_btn);
		
		
		JButton manager_btn = new JButton("������");
		manager_btn.setBounds(150, 500, 200, 50);
		getContentPane().add(manager_btn);
		
		
		
		
		
//		Dialog dialog = new Dialog(frame,"�ѽ�");
//		dialog.setBounds(0, 0, 625, 1000);
//		JLabel koreaFood = new JLabel("�ѽĸ޴�");
//		koreaFood.setHorizontalAlignment(JLabel.CENTER);
//		
//		dialog.add(koreaFood, "North");
//		
//		kfood_btn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dialog.setVisible(true);
//			}
//		});
//		
//		JButton close_btn = new JButton("close");
//		close_btn.setBounds(0, 0, 50, 50);
////		dialog.add(close_btn);
////		
//		close_btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				dialog.dispose();
//			}
//		});
		
		
	
	
		
//		frame.add(panel);
		
		setVisible(true);
		
	}
	
}
