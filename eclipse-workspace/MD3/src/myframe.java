import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class myframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myframe frame = new myframe();
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
	public myframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 11, 524, 20);
		contentPane.add(textField);
		textField.setColumns(60);
		
		JButton Addbtn = new JButton("Add");
		Addbtn.setBounds(107, 42, 89, 23);
		contentPane.add(Addbtn);
		
		JButton Runbtn = new JButton("Run");
		Runbtn.setBounds(392, 42, 89, 23);
		contentPane.add(Runbtn);
		
		ArrayList<String> items = new ArrayList<String>();
		
		JButton Deletebtn = new JButton("Delete");
		Deletebtn.setBounds(107, 227, 89, 23);
		contentPane.add(Deletebtn);
		
		JButton Clearbtn = new JButton("Clear");
		Clearbtn.setBounds(392, 227, 89, 23);
		contentPane.add(Clearbtn);
		
		
		DefaultListModel model = new DefaultListModel();
		JList list = new JList(model);
		list.setBounds(28, 80, 251, 136);
		contentPane.add(list);
		
		DefaultListModel modelin = new DefaultListModel();
		JList list_1 = new JList(modelin);
		list_1.setBounds(310, 80, 242, 136);
		contentPane.add(list_1);
		
		
		Addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(textField.getText());
				items.add(textField.getText());
			}
		});
		
		Deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < items.size(); i++) {
					model.clear();
				}	
			}
		});
		Runbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < items.size(); i++) {
					String temp = items.get(i);
					String temp1 ="";
					int j = 0;
					for(int k = 0; k<temp.length(); k++) {
						
						
						
						if(j%2==0 && j != 0) {
						temp1 = temp1 + "mau";
						} 
						
						if(temp.charAt(k) == ' ') {
							j=-1;
						}
						j++;
						temp1 = temp1 + temp.charAt(k);
						
					}
					modelin.addElement(temp1);
				}
			}
		});
		Clearbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelin.clear();
			}
		});
		
		
	}
}
