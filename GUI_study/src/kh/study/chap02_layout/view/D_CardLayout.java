package kh.study.chap02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame{
	public D_CardLayout() {
		super("D_CardLayout");
		setBounds(300, 200, 500, 500);
		
		
		/// CardLayout
		// Panel�� �̿��ؼ� ī�� ���� ���ĳ���(�̺�Ʈ�� �ٸ� ���� ���̰� �����ؾ���)
		CardLayout card = new CardLayout();
		setLayout(card);
		
		// �г� �����
		// �г��� �����Ʈ���� �ٸ� �����Ʈ�� ������ �� �־� �����̳��� ������ ���ϰ� ����
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// �гο� ���� ����
		card1.setBackground(Color.black);
		card2.setBackground(Color.blue);
		card3.setBackground(Color.pink);
		
		// �гο� �� �߰�  �ȿ����� �����̶�� �����
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		add(card1);
		add(card2);
		add(card3);
		
		// �гο� �̺�Ʈ �߰�
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //��Ŭ����������
					card.next(card1.getParent());
				}else if(e.getButton() == 3){
					card.previous(card1.getParent());
				}
			}
		});
		
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //��Ŭ����������
					card.next(card2.getParent());
				}else if(e.getButton() == 3){
					card.previous(card2.getParent());
				}
			}
		});
		
		
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //��Ŭ����������
					card.next(card3.getParent());
				}else if(e.getButton() == 3){
					card.previous(card3.getParent());
				}
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
