package window_help_gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class test extends JFrame {

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
		setTitle("\uBB34\uC778\uC8FC\uBB38\uD504\uB85C\uADF8\uB7A8");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 674);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("   \uC0C1\uD488\uBA85 \t\t\uB2E8\uAC00\t\t \uC218\uB7C9\t\uD569\uACC4\t");
		textArea.setBounds(0, 264, 434, 316);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(136, 36, 50, 50);
		panel.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setBounds(54, 36, 50, 50);
		panel.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(226, 36, 50, 50);
		panel.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(316, 36, 50, 50);
		panel.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(54, 144, 50, 50);
		panel.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(136, 144, 50, 50);
		panel.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(226, 144, 50, 50);
		panel.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(316, 144, 50, 50);
		panel.add(button_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 577, 434, 58);
		contentPane.add(panel_1);
		
		textField = new JTextField();
		textField.setBounds(0, 265, 434, 21);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
