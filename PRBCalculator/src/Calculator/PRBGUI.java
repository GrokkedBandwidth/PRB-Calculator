package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PRBGUI extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8943141836612130241L;
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	JTextField textField1;
	JTextField textField2;
	JTextField textField3;
	JRadioButton radial1;
	JRadioButton radial2;
	JRadioButton radial3;
	JRadioButton radial4;
	JRadioButton radial5;
	JRadioButton radial6;
	JButton button1;
	JButton about;
	JLabel label0;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	Calculator calculator;
	JComboBox comboBox;
	int[] bandClassArrayInt = {0,1,2,3,4,5,7,8,9,10,11,12,13,14,17,18,19,20,21,22,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,65,66,67,68,69,70,71,72,73,74,75,76,85,87,88};
	String[] bandClassArrayString = {"Select","1","2","3","4","5","7","8","9","10","11","12","13","14","17","18","19","20","21","22","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","65","66","67","68","69","70","71","72","73","74","75","76","85","87","88"};
	double bW;
	String stringBC;
	int bC;
	
	public PRBGUI()
	{
		frame = new JFrame();
		frame.setTitle("PRB Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(300, 800);
		frame.setLayout(new BorderLayout(10,10));
		
		label5 = new JLabel("System Version: 1.0");
		label5.setFont(new Font("Arial", Font.BOLD, 10));
		about = new JButton("About");
		about.setPreferredSize(new Dimension(60,25));
		about.setFont(new Font("Arial", Font.BOLD, 8));
		about.setHorizontalAlignment(SwingConstants.RIGHT);
		about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "For bug reports or update requests, please email GrokkedBandwidth@gmail.com", "About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		
		label0 = new JLabel("Select Band Class");
		label0.setFont(new Font("Arial", Font.BOLD, 16));
		label0.setPreferredSize(new Dimension(300,30));
		label0.setHorizontalAlignment(SwingConstants.CENTER);
		
		comboBox = new JComboBox(bandClassArrayString);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//bC = 1;
				JComboBox cb = (JComboBox)e.getSource();
				//int bC = Integer.parseInt(comboBox.getSelectedItem().toString());
				int i = cb.getSelectedIndex();
				bC = bandClassArrayInt[i];
				System.out.println(bC);
			}
		});
		
		textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(200,25));
		textField1.setFont(new Font("Arial", Font.BOLD, 14));
		//textField1.setMinimumSize(new Dimension(300,50));
		//textField1.setMaximumSize(new Dimension(300,50));
		
		label1 = new JLabel("Enter DL EARFCN");
		label1.setFont(new Font("Arial", Font.BOLD, 16));
		label1.setPreferredSize(new Dimension(300,30));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		
		label2 = new JLabel("Select Bandwidth");
		label2.setFont(new Font("Arial", Font.BOLD, 16));
		label2.setPreferredSize(new Dimension(300,30));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		
		radial1 = new JRadioButton("1.4 MHz");
		radial1.addActionListener(this);
		
		radial2 = new JRadioButton("3 MHz");
		radial2.addActionListener(this);
		
		radial3 = new JRadioButton("5 MHz");
		radial3.addActionListener(this);
		
		radial4 = new JRadioButton("10 MHz");
		radial4.addActionListener(this);
		
		radial5 = new JRadioButton("15 MHz");
		radial5.addActionListener(this);
		
		radial6 = new JRadioButton("20 MHz");
		radial6.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radial1);
		group.add(radial2);
		group.add(radial3);
		group.add(radial4);
		group.add(radial5);
		group.add(radial6);
		
		label3 = new JLabel("Enter PRB#");
		label3.setFont(new Font("Arial", Font.BOLD, 16));
		label3.setPreferredSize(new Dimension(300,30));
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(200,30));
		textField2.setFont(new Font("Arial", Font.BOLD, 14));
		
		button1 = new JButton("Run");
		button1.setPreferredSize(new Dimension(100,25));
		button1.setFont(new Font("Arial", Font.BOLD, 16));
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				//int bandClass = Integer.parseInt(stringBC);
				String label1String = textField1.getText();
				if (label1String.equals(""))
					JOptionPane.showMessageDialog(null, "Enter a Downlink EARFCN", "Null EARFCN", JOptionPane.ERROR_MESSAGE);
				int DLEARFCN = Integer.parseInt(label1String);
				String label3String = textField2.getText();
				if (label3String.equals(""))
					JOptionPane.showMessageDialog(null, "Enter a PRB", "Null PRB", JOptionPane.ERROR_MESSAGE);
				int pRBEntry = Integer.parseInt(label3String);
				if (bC == 0)
					JOptionPane.showMessageDialog(null, "Select a Bandclass", "Null Bandclass", JOptionPane.ERROR_MESSAGE);
				if (bW == 0)
					JOptionPane.showMessageDialog(null, "Select a bandwidth", "Null bandwidth", JOptionPane.ERROR_MESSAGE);
				else {
				calculator = new Calculator(bW, DLEARFCN, pRBEntry, bC);
				String result = ("" + calculator.upLinkEARFCNReturn);
				textField3.setText(result);
				}
			}
		});
		
		label4 = new JLabel("UL EARFCN Result");
		label4.setFont(new Font("Arial", Font.BOLD, 16));
		label4.setPreferredSize(new Dimension(300,30));
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField3 = new JTextField();
		textField3.setPreferredSize(new Dimension(200,30));
		textField3.setFont(new Font("Arial", Font.BOLD, 14));
		textField3.setEditable(false);
		
		panel5 = new JPanel();
		panel5.setBackground(new Color(125,125,125));
		panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
		panel5.setPreferredSize(new Dimension(300,500));
		frame.add(panel5);
		
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.setBackground(new Color(125,125,125));
		panel1.setMinimumSize(new Dimension (300,225));
		panel1.setMaximumSize(new Dimension(300,225));
		panel1.add(label0);
		panel1.add(comboBox);
		panel1.add(label1);
		panel1.add(textField1);
		
		panel2 = new JPanel();
		panel2.setBackground(new Color(125,125,125));
		panel2.setMinimumSize(new Dimension (300,150));
		panel2.setMaximumSize(new Dimension(300,150));
		panel2.setLayout(new FlowLayout());
		panel2.add(label2);
		panel2.add(radial1);
		panel2.add(radial2);
		panel2.add(radial3);
		panel2.add(radial4);
		panel2.add(radial5);
		panel2.add(radial6);
		
		panel3 = new JPanel();
		panel3.setBackground(new Color(125,125,125));
		panel3.setMinimumSize(new Dimension (300,160));
		panel3.setMaximumSize(new Dimension(300,160));
		panel3.add(label3);
		panel3.add(textField2);
		panel3.add(button1);
		//panel3.add(about);
		
		panel4 = new JPanel();
		panel4.setBackground(new Color(125,125,125));
		panel4.setMinimumSize(new Dimension (300,120));
		panel4.setMaximumSize(new Dimension(300,120));
		panel4.add(label4);
		panel4.add(textField3);
		
		panel6 = new JPanel();
		panel6.setLayout(new FlowLayout());
		panel6.setBackground(new Color(125,125,125));
		panel6.setMinimumSize(new Dimension (300,50));
		panel6.setMaximumSize(new Dimension(300,50));
		panel6.add(label5);
		panel6.add(about);
		
		panel5.add(panel1);
		panel5.add(panel2);
		panel5.add(panel3);
		panel5.add(panel4);
		panel5.add(panel6);
		
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==radial1)
			bW = 1.4;
		if(e.getSource()==radial2)
			bW = 3;
		if(e.getSource()==radial3)
			bW = 5;
		if(e.getSource()==radial4)
			bW = 10;
		if(e.getSource()==radial5)
			bW = 15;
		if(e.getSource()==radial6)
			bW = 20;
	}
}
