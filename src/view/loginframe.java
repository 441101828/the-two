package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtGamelife;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginframe frame = new loginframe();
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
	public loginframe() {
		setTitle("\u751F\u547D\u6E38\u620F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screnSize=Toolkit.getDefaultToolkit().getScreenSize();
		int width=450;
		int height=300;
		setBounds((screnSize.width-width)/2, (screnSize.height-height)/2, width, height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtGamelife = new JTextField();
		txtGamelife.setFont(new Font("»ªÎÄ²ÊÔÆ", Font.PLAIN, 40));
		txtGamelife.setEditable(false);
		txtGamelife.setHorizontalAlignment(SwingConstants.CENTER);
		txtGamelife.setText("Gamelife");
		txtGamelife.setBounds(125, 37, 174, 90);
		contentPane.add(txtGamelife);
		txtGamelife.setColumns(10);
		txtGamelife.setBorder(null);
		
		JButton btnNewButton = new JButton("\u8FDB\u5165\u6E38\u620F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginframe.this.setVisible(false);
				new GameFrame();
			}
		});
		btnNewButton.setBounds(54, 157, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u89C4\u5219\u4ECB\u7ECD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					RulerFrame frame = new RulerFrame();
					frame.setVisible(true);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(262, 157, 113, 27);
		contentPane.add(btnNewButton_1);
	}
}

