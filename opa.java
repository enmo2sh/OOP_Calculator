package eg.edu.alexu.csd.oop.calculator;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class opa  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					opa window = new opa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public opa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculator call=new Funcs();
		frame = new JFrame("CalCulatoR");
		frame.getContentPane().setBackground(new Color(148, 0, 211));
		frame.setBounds(100, 100, 622, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel output = new JLabel("");
		output.setBackground(new Color(250, 250, 210));
	    output.setBounds(38, 73, 287, 55);
		frame.getContentPane().add(output);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(new Color(204, 255, 102));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					call.input(Integer.toString(1));
					output.setText(output.getText()+"1");
			}
		});
		btnNewButton.setBounds(30, 172, 63, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBackground(new Color(204, 255, 102));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(2));
				output.setText(output.getText()+"2");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(141, 172, 63, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBackground(new Color(204, 255, 102));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(3));
				output.setText(output.getText()+"3");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(262, 172, 63, 43);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(new Color(204, 255, 102));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(4));
				output.setText(output.getText()+"4");
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setBounds(30, 247, 63, 43);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBackground(new Color(204, 255, 102));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(5));
				output.setText(output.getText()+"5");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_4.setBounds(141, 246, 63, 44);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBackground(new Color(204, 255, 102));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(6));
				output.setText(output.getText()+"6");
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_5.setBounds(262, 247, 63, 43);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBackground(new Color(204, 255, 102));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(7));
				output.setText(output.getText()+"7");
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_6.setBounds(30, 320, 63, 43);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBackground(new Color(204, 255, 102));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(8));
				output.setText(output.getText()+"8");
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_7.setBounds(141, 320, 63, 43);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBackground(new Color(204, 255, 102));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(9));
				output.setText(output.getText()+"9");
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_8.setBounds(262, 320, 63, 43);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.setBackground(new Color(204, 255, 102));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(Integer.toString(0));
				output.setText(output.getText()+"0");
			}
		});
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_13.setBounds(210, 388, 63, 43);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton button_1 = new JButton(".");
		button_1.setBackground(new Color(204, 255, 102));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input(".");
				output.setText(output.getText()+".");
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		button_1.setBounds(83, 388, 63, 43);
		frame.getContentPane().add(button_1);
		
		JButton button = new JButton("+");
		button.setBackground(new Color(255, 204, 204));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input("+");
				output.setText(output.getText()+"+");
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBounds(419, 227, 75, 55);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setBackground(new Color(255, 204, 204));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input("-");
				output.setText(output.getText()+"-");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9.setBounds(511, 227, 75, 55);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.setBackground(new Color(255, 204, 204));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input("*");
				output.setText(output.getText()+"*");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_10.setBounds(419, 310, 75, 55);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("/");
		btnNewButton_11.setBackground(new Color(255, 204, 204));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.input("/");
				output.setText(output.getText()+"/");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_11.setBounds(511, 310, 75, 55);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("=");
		btnNewButton_12.setBackground(new Color(255, 204, 255));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans=call.getResult();
				if(ans.equals("@")) {
					JOptionPane.showMessageDialog(null, "Division by zero is undefined");
					output.setText("");
					
				}
				else
					output.setText(ans);
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_12.setBounds(511, 396, 75, 55);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnSave = new JButton("save");
		btnSave.setBackground(new Color(255, 255, 204));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.save();
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setBounds(391, 127, 85, 44);
		frame.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("load");
		btnLoad.setBackground(new Color(255, 255, 204));
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				call.load();
				output.setText(call.getResult());
			}
		});
		btnLoad.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLoad.setBounds(391, 62, 85, 44);
		frame.getContentPane().add(btnLoad);
		
		JButton btnNewButton_14 = new JButton("curr.");
		btnNewButton_14.setBackground(new Color(255, 255, 204));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText("");
				output.setText(call.current());
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_14.setBounds(501, 90, 85, 44);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("prev.");
		btnNewButton_15.setBackground(new Color(255, 255, 204));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText("");
				output.setText(call.prev());
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_15.setBounds(501, 25, 85, 43);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("next");
		btnNewButton_16.setBackground(new Color(255, 255, 204));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText("");
				output.setText(call.next());
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_16.setBounds(501, 155, 85, 44);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(255, 204, 255));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText("");
				call.input(null);
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnC.setBounds(419, 396, 75, 55);
		frame.getContentPane().add(btnC);
		
		JLabel lblResult = new JLabel("result:");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResult.setBounds(59, 36, 92, 18);
		frame.getContentPane().add(lblResult);
		
		
		
		
		 
	
	}
}

