package mimiproject.kh.mini.view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class koreanMenu implements MouseListener{
	String show = "";
	int count = 0;
	public koreanMenu() {
		// �����δ�
        // ������ ������
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setBackground(new Color(37, 23, 22));
		frame.setSize(1300, 800);
		
		
		JLabel Title = new JLabel("KH������"); //���������� ���Ÿ��Ʋ
		Title.setFont(new Font("����", Font.PLAIN, 30)); // ����Ÿ��Ʋ ���� ����
		
		Title.setForeground(Color.white);
		Title.setBounds(600, 20, 500, 40);
		frame.getContentPane().add(Title);
		
		
		String[] category_name = {"�ѽ�", "�߽�", "���", "�Ͻ�"};
		JButton[] category_bt = new JButton[category_name.length];
		
        
		for(int i=0; i<category_name.length; ++i) {
			category_bt[i] = new JButton(category_name[i]);
			category_bt[i].setBounds(45 + (i * 173), 91, 161, 59);
			category_bt[i].setFont(new Font("����", Font.PLAIN, 20));
			category_bt[i].setBackground(new Color(0,14,39));
			category_bt[i].setForeground(Color.white);

			frame.getContentPane().add(category_bt[i]);
		}
		
		
		
		JPanel foodPanel = new JPanel(); // �����г�
		foodPanel.setBounds(12, 172, 713, 560);
		foodPanel.setLayout(null);
		foodPanel.setBackground(new Color(37, 23, 22));
//		foodPanel.setBackground(Color.BLUE);
		
//		JPanel result_panel = new JPanel();
//		result_panel.setBounds(759, 608, 461, 122);
//		result_panel.setLayout(null);
//		result_panel.setBackground(new Color(37,23,22));
		
		
		
		

		TextArea ta = new TextArea();
		ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
		ta.setBackground(new Color(245,242,237));
		ta.setBounds(770, 172, 450, 420);
		frame.getContentPane().add(ta);
		
		
		String menu[] = { "�����", "��������", "�η�ġ��", "���ܺ����", "��Ǭ�����", "��ġ������"};
        int price[] = { 5000, 5500, 6000, 6500, 7000, 7500};
        TextField amount[] = new TextField[menu.length];
	    Button minus[] = new Button[menu.length];
        Button plus[] = new Button[menu.length];
        JButton ok[] = new JButton[menu.length];
        Label l[] = new Label[menu.length];
        JButton menu_btn[] = new JButton[menu.length];
        ImageIcon icon[] = new ImageIcon[menu.length];
        for (int i = 0; i < menu.length; i++) {
        	 
            
            menu_btn[i] = new JButton(menu[i]);
            if (i < 3) {
                menu_btn[i].setBounds(20 + (i * 224), 10, 202, 187);
            } else {
                menu_btn[i].setBounds(20 + ((i-3) * 224), 285, 202, 187);
            }
            icon[i] = new ImageIcon("image/" + i + ".png");
            menu_btn[i].setIcon(icon[i]);
            

      

            // ���� �κ�
            amount[i] = new TextField("0");
            amount[i].setBackground(Color.white);
            amount[i].setEditable(false);
//            amount[i].
            amount[i].setBounds(menu_btn[i].getX() + 80, menu_btn[i].getY() + 220 , 40, 20);
            
            
            // "-" ��ư
            minus[i] = new Button("-");
            minus[i].setBounds(menu_btn[i].getX() + 56, menu_btn[i].getY()+220, 20, 20);
            minus[i].setEnabled(false);
 

            
            // "+" ��ư
            plus[i] = new Button("+");
            plus[i].setBounds(menu_btn[i].getX() + 125, menu_btn[i].getY()+220, 20, 20);
            plus[i].setEnabled(false);
 
            // ����
            l[i] = new Label(price[i] + "��");
            l[i].setBounds(menu_btn[i].getX() + 75, menu_btn[i].getY()+194 , 50, 20);
            l[i].setBackground(Color.lightGray);
 
            // Ȯ�� ��ư
            ok[i] = new JButton("Ȯ��");
            ok[i].setBounds(menu_btn[i].getX() + 50, menu_btn[i].getY()+215 + 30, 100, 20);
            ok[i].setEnabled(false);
			
			
            
            
            foodPanel.add(amount[i]);  // �������� �гο� ����(TextField) �߰�
            foodPanel.add(minus[i]);  // �������� �гο� ���̳ʽ�(Button) �߰�
            foodPanel.add(plus[i]);
            foodPanel.add(l[i]);
            foodPanel.add(ok[i]);
            foodPanel.add(menu_btn[i]);
        }
        for (int i = 0; i < menu.length; i++) {
            int j = i;
 
            // �ܹ��� ��ư �̺�Ʈ
            menu_btn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    minus[j].setEnabled(true);
                    plus[j].setEnabled(true);
                    menu_btn[j].setEnabled(false);
                    ok[j].setEnabled(true);
 
                    count = 0;
                }
            });
 
            // "-" ��ư �̺�Ʈ
            minus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (count > 0) {
                        count = count - 1;
                        amount[j].setText(count + "");
                        ok[j].setEnabled(true);
                    } else {
                        minus[j].setEnabled(false);
                    }
                }
            });
            
            // "+" ��ư �̺�Ʈ
            plus[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = count + 1;
                    amount[j].setText(count + "");
                    ok[j].setEnabled(true);
                    if (count > 0) {
                        minus[j].setEnabled(true);
                    }
                }
            });
            
            //Ȯ�� ��ư �̺�Ʈ
            ok[i].addActionListener(new ActionListener() {
 
                @Override
                public void actionPerformed(ActionEvent e) { 
                    show = menu_btn[j].getActionCommand();
                    ta.append(" 	  " + show + "       	" + price[j] + "        	" + count + "         	" + price[j] * count
                            + "��" + "\n");
                    ok[j].setEnabled(false);
                }
            });
 
        }
        
      

        Button order = new Button("�ֹ�");
        
        Button reset = new Button("�ʱ�ȭ");
        
        Button close = new Button("�ݱ�");

        order.setBounds(789,647,97,23);
        reset.setBounds(943,647,97,23);
        close.setBounds(1111,647,97,23);
        
        
        frame.getContentPane().add(order);
        frame.getContentPane().add(reset);
        frame.getContentPane().add(close);
        
        // order �ֹ���ư
        order.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, ta.getText() + " �ֹ��Ǿ����ϴ�. \n�̿����ּż� �����մϴ�.");
                for (int i = 0; i < menu.length; i++) {
                    menu_btn[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    amount[i].setText("0");
                    ta.setText("   	  " + "��ǰ��" + "      	+ "+ "�ܰ�" +  "      " + " ���� " + "			"  + " �հ�" + "\n\n");
 
                }
            }
        });
 
        // reset �ʱ�ȭ ��ư
        reset.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < menu.length; i++) {
                    menu_btn[i].setEnabled(true);
                    minus[i].setEnabled(false);
                    plus[i].setEnabled(false);
                    amount[i].setText("0");
                    ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
 
                }
            }
        });
 
 
        //close �ݱ��ư
        
        close.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
 
		
		
		
		
        for(int i=0; i<category_name.length; ++i) { // �ѽ� ��� �߽� �ϽĿ� ���콺 Ŀ���� �÷����� ��� ������ ����ǰ� �ϴ� �̺�Ʈ 
        	category_bt[i].addMouseListener(this);
        }
		
        
        
        
        frame.getContentPane().add(foodPanel); // ���ĵ��� ��Ƴ��� ���
		frame.getContentPane().add(ta); // ������ ������ ���ϰ� Ȯ���� ���� ��� textArea ĭ�� �ߴ� ȭ���� �������� �� �� �ֵ��� ���ִ� �۾�
		ta.setEditable(false); // textArea ���� �Ұ���
		
	
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(789, 647, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(943, 647, 97, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(1111, 647, 97, 23);
		frame.getContentPane().add(button_1);
		
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); //x��ư ������ ����
		frame.setVisible(true);	//frame�� �׷��� �͵��� �ð������� ���� ��
	
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
