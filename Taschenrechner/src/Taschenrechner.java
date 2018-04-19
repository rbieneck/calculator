import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextField;

public class Taschenrechner extends JFrame {
	private JTextField ausgabe;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_plus;
	private JButton btn_minus;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_mal;
	private JButton btn_durch;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_pfeill;
	private JButton btn_pfeilr;
	private JButton btn_0;
	private JButton btn_loeschen;
	private JButton btn_AusdruckBerechnen;
	public Taschenrechner() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{144, 144, 144, 174, 149, 0};
		gridBagLayout.rowHeights = new int[]{90, 23, 23, 23, 23, 35, 23, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		ausgabe = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		getContentPane().add(ausgabe, gbc_textField);
		ausgabe.setColumns(10);
		
		btn_7 = new JButton("7");
		btn_7.addActionListener(new Btn_7_Listener());
		GridBagConstraints gbc_btn_7 = new GridBagConstraints();
		gbc_btn_7.fill = GridBagConstraints.BOTH;
		gbc_btn_7.insets = new Insets(0, 0, 5, 5);
		gbc_btn_7.gridx = 0;
		gbc_btn_7.gridy = 1;
		getContentPane().add(btn_7, gbc_btn_7);
		
		btn_8 = new JButton("8");
		btn_8.addActionListener(new Btn_8_Listener());
		GridBagConstraints gbc_btn_8 = new GridBagConstraints();
		gbc_btn_8.fill = GridBagConstraints.BOTH;
		gbc_btn_8.insets = new Insets(0, 0, 5, 5);
		gbc_btn_8.gridx = 1;
		gbc_btn_8.gridy = 1;
		getContentPane().add(btn_8, gbc_btn_8);
		
		btn_9 = new JButton("9");
		btn_9.addActionListener(new Btn_9_Listener());
		GridBagConstraints gbc_btn_9 = new GridBagConstraints();
		gbc_btn_9.fill = GridBagConstraints.BOTH;
		gbc_btn_9.insets = new Insets(0, 0, 5, 5);
		gbc_btn_9.gridx = 2;
		gbc_btn_9.gridy = 1;
		getContentPane().add(btn_9, gbc_btn_9);
		
		btn_plus = new JButton("+");
		btn_plus.addActionListener(new Btn_plus_Listener());
		GridBagConstraints gbc_btn_plus = new GridBagConstraints();
		gbc_btn_plus.fill = GridBagConstraints.BOTH;
		gbc_btn_plus.insets = new Insets(0, 0, 5, 5);
		gbc_btn_plus.gridx = 3;
		gbc_btn_plus.gridy = 1;
		getContentPane().add(btn_plus, gbc_btn_plus);
		
		btn_minus = new JButton("-");
		btn_minus.addActionListener(new Btn_minus_Listener());
		GridBagConstraints gbc_btn_minus = new GridBagConstraints();
		gbc_btn_minus.fill = GridBagConstraints.BOTH;
		gbc_btn_minus.insets = new Insets(0, 0, 5, 0);
		gbc_btn_minus.gridx = 4;
		gbc_btn_minus.gridy = 1;
		getContentPane().add(btn_minus, gbc_btn_minus);
		
		btn_4 = new JButton("4");
		btn_4.addActionListener(new Btn_4_Listener());
		GridBagConstraints gbc_btn_4 = new GridBagConstraints();
		gbc_btn_4.fill = GridBagConstraints.BOTH;
		gbc_btn_4.insets = new Insets(0, 0, 5, 5);
		gbc_btn_4.gridx = 0;
		gbc_btn_4.gridy = 2;
		getContentPane().add(btn_4, gbc_btn_4);
		
		btn_5 = new JButton("5");
		btn_5.addActionListener(new Btn_5_Listener());
		GridBagConstraints gbc_btn_5 = new GridBagConstraints();
		gbc_btn_5.fill = GridBagConstraints.BOTH;
		gbc_btn_5.insets = new Insets(0, 0, 5, 5);
		gbc_btn_5.gridx = 1;
		gbc_btn_5.gridy = 2;
		getContentPane().add(btn_5, gbc_btn_5);
		
		btn_6 = new JButton("6");
		btn_6.addActionListener(new Btn_6_Listener());
		GridBagConstraints gbc_btn_6 = new GridBagConstraints();
		gbc_btn_6.fill = GridBagConstraints.BOTH;
		gbc_btn_6.insets = new Insets(0, 0, 5, 5);
		gbc_btn_6.gridx = 2;
		gbc_btn_6.gridy = 2;
		getContentPane().add(btn_6, gbc_btn_6);
		
		btn_mal = new JButton("*");
		btn_mal.addActionListener(new Btn_mal_Listener());
		GridBagConstraints gbc_btn_mal = new GridBagConstraints();
		gbc_btn_mal.fill = GridBagConstraints.BOTH;
		gbc_btn_mal.insets = new Insets(0, 0, 5, 5);
		gbc_btn_mal.gridx = 3;
		gbc_btn_mal.gridy = 2;
		getContentPane().add(btn_mal, gbc_btn_mal);
		
		btn_durch = new JButton(":");
		btn_durch.addActionListener(new Btn_durch_Listener());
		GridBagConstraints gbc_btn_durch = new GridBagConstraints();
		gbc_btn_durch.fill = GridBagConstraints.BOTH;
		gbc_btn_durch.insets = new Insets(0, 0, 5, 0);
		gbc_btn_durch.gridx = 4;
		gbc_btn_durch.gridy = 2;
		getContentPane().add(btn_durch, gbc_btn_durch);
		
		btn_1 = new JButton("1");
		btn_1.addActionListener(new Btn_1_Listener());
		GridBagConstraints gbc_btn_1 = new GridBagConstraints();
		gbc_btn_1.fill = GridBagConstraints.BOTH;
		gbc_btn_1.insets = new Insets(0, 0, 5, 5);
		gbc_btn_1.gridx = 0;
		gbc_btn_1.gridy = 3;
		getContentPane().add(btn_1, gbc_btn_1);
		
		btn_2 = new JButton("2");
		btn_2.addActionListener(new Btn_2_Listener());
		GridBagConstraints gbc_btn_2 = new GridBagConstraints();
		gbc_btn_2.fill = GridBagConstraints.BOTH;
		gbc_btn_2.insets = new Insets(0, 0, 5, 5);
		gbc_btn_2.gridx = 1;
		gbc_btn_2.gridy = 3;
		getContentPane().add(btn_2, gbc_btn_2);
		
		btn_3 = new JButton("3");
		btn_3.addActionListener(new Btn_3_Listener());
		GridBagConstraints gbc_btn_3 = new GridBagConstraints();
		gbc_btn_3.fill = GridBagConstraints.BOTH;
		gbc_btn_3.insets = new Insets(0, 0, 5, 5);
		gbc_btn_3.gridx = 2;
		gbc_btn_3.gridy = 3;
		getContentPane().add(btn_3, gbc_btn_3);
		
		btn_pfeill = new JButton("<");
		GridBagConstraints gbc_btn_pfeill = new GridBagConstraints();
		gbc_btn_pfeill.fill = GridBagConstraints.BOTH;
		gbc_btn_pfeill.insets = new Insets(0, 0, 5, 5);
		gbc_btn_pfeill.gridx = 3;
		gbc_btn_pfeill.gridy = 3;
		getContentPane().add(btn_pfeill, gbc_btn_pfeill);
		
		btn_pfeilr = new JButton(">");
		GridBagConstraints gbc_btn_pfeilr = new GridBagConstraints();
		gbc_btn_pfeilr.fill = GridBagConstraints.BOTH;
		gbc_btn_pfeilr.insets = new Insets(0, 0, 5, 0);
		gbc_btn_pfeilr.gridx = 4;
		gbc_btn_pfeilr.gridy = 3;
		getContentPane().add(btn_pfeilr, gbc_btn_pfeilr);
		
		btn_0 = new JButton("0");
		btn_0.addActionListener(new Btn_0_Listener());
		GridBagConstraints gbc_btn_0 = new GridBagConstraints();
		gbc_btn_0.fill = GridBagConstraints.BOTH;
		gbc_btn_0.insets = new Insets(0, 0, 5, 5);
		gbc_btn_0.gridx = 0;
		gbc_btn_0.gridy = 4;
		getContentPane().add(btn_0, gbc_btn_0);
		
		btn_loeschen = new JButton("L\u00F6schen");
		btn_loeschen.addActionListener(new Btn_loeschen_Listener());
		GridBagConstraints gbc_btn_loeschen = new GridBagConstraints();
		gbc_btn_loeschen.fill = GridBagConstraints.BOTH;
		gbc_btn_loeschen.insets = new Insets(0, 0, 5, 0);
		gbc_btn_loeschen.gridwidth = 4;
		gbc_btn_loeschen.gridx = 1;
		gbc_btn_loeschen.gridy = 4;
		getContentPane().add(btn_loeschen, gbc_btn_loeschen);
		
		btn_AusdruckBerechnen = new JButton("Ausdruck berechnen");
		btn_AusdruckBerechnen.addActionListener(new Btn_AusdruckBerechnen_Listener());
		GridBagConstraints gbc_btn_AusdruckBerechnen = new GridBagConstraints();
		gbc_btn_AusdruckBerechnen.fill = GridBagConstraints.BOTH;
		gbc_btn_AusdruckBerechnen.gridwidth = 5;
		gbc_btn_AusdruckBerechnen.gridx = 0;
		gbc_btn_AusdruckBerechnen.gridy = 6;
		getContentPane().add(btn_AusdruckBerechnen, gbc_btn_AusdruckBerechnen);
	}

	public static void main(String[] args) {
		Taschenrechner tr= new Taschenrechner();
		tr.setSize(300, 400);
		tr.show();
	}
	
	class Btn_7_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("7");
			String text = ausgabe.getText();
			ausgabe.setText(text + "7");
			// TODO Auto-generated method stub
		}}
	class Btn_8_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("8");
		String text = ausgabe.getText();
		ausgabe.setText(text + "8");
		// TODO Auto-generated method stub

		}
	}
	class Btn_9_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("9");
		String text = ausgabe.getText();
		ausgabe.setText(text + "9");
		// TODO Auto-generated method stub

		}
	}
	class Btn_plus_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("+");
		String text = ausgabe.getText();
		ausgabe.setText(text + "+");
		// TODO Auto-generated method stub

		}
	}
	class Btn_minus_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("-");
		String text = ausgabe.getText();
		ausgabe.setText(text + "-");
		// TODO Auto-generated method stub

		}
	}
	class Btn_4_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("4");
		String text = ausgabe.getText();
		ausgabe.setText(text + "4");
		// TODO Auto-generated method stub

		}
	}
	class Btn_5_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("5");
		String text = ausgabe.getText();
		ausgabe.setText(text + "5");
		// TODO Auto-generated method stub

		}
	}
	class Btn_6_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("6");
		String text = ausgabe.getText();
		ausgabe.setText(text + "6");
		// TODO Auto-generated method stub

		}
	}
	class Btn_mal_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("*");
		String text = ausgabe.getText();
		ausgabe.setText(text + "*");
		// TODO Auto-generated method stub

		}
	}
	class Btn_durch_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println(":");
		String text = ausgabe.getText();
		ausgabe.setText(text + ":");
		// TODO Auto-generated method stub

		}
	}
	class Btn_1_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("1");
		String text = ausgabe.getText();
		ausgabe.setText(text + "1");
		// TODO Auto-generated method stub

		}
	}
	class Btn_2_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("2");
		String text = ausgabe.getText();
		ausgabe.setText(text + "2");
		// TODO Auto-generated method stub

		}
	}
	class Btn_3_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("3");
		String text = ausgabe.getText();
		ausgabe.setText(text + "3");
		// TODO Auto-generated method stub

		}
	}
	class Btn_0_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("0");
		String text = ausgabe.getText();
		ausgabe.setText(text + "0");
		// TODO Auto-generated method stub

		}
	}
	class Btn_loeschen_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("");
		String text = ausgabe.getText();
		text = text.substring(0, text.length()-1);
		ausgabe.setText(text);
		// TODO Auto-generated method stub

		}
	}
	class Btn_AusdruckBerechnen_Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("AusdruckBerechnen");
		String text = ausgabe.getText();
		ausgabe.setText("" + Rechner.evaluate(text));
		// TODO Auto-generated method stub

		}
	}
	
	}




