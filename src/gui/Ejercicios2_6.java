package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicios2_6 extends JFrame {

	private JPanel contentPane;
	private JCheckBox chb1;
	private JCheckBox chb2;
	private JCheckBox chb3;
	private JCheckBox chb4;
	private JCheckBox lista[] = new JCheckBox[4];
	private JButton btnComp;
	private JTextPane txpPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicios2_6 frame = new Ejercicios2_6();
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
	public Ejercicios2_6() {
		setTitle("Habilitar / Deshabilitar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow,fill][21.00][92.00][37.00][34.00][63.00][83.00,grow][grow,fill]", "[10.00,grow,fill][][][][][][14.00][][grow,fill]"));
		
		JLabel lblNewLabel = new JLabel("Hobbies:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(lblNewLabel, "cell 1 1 2 1");
		
		JLabel lblNewLabel_1 = new JLabel("Has seleccionado");
		contentPane.add(lblNewLabel_1, "cell 5 1 2 1,alignx left");
		
		chb1 = new JCheckBox("Deportes");
		contentPane.add(chb1, "cell 2 2");
		lista[0]=chb1;
		
		txpPanel = new JTextPane();
		contentPane.add(txpPanel, "cell 4 2 3 4,grow");
		
		chb2 = new JCheckBox("Tecnología");
		contentPane.add(chb2, "cell 2 3");
		lista[1]=chb2;
		chb3 = new JCheckBox("Juegos");
		contentPane.add(chb3, "cell 2 4");
		lista[2]=chb3;
		chb4 = new JCheckBox("Cocina");
		contentPane.add(chb4, "cell 2 5");
		lista[3]=chb4;
		btnComp = new JButton("Comprobar");
		btnComp.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				comprobarCheckBox();
			}
		});
		contentPane.add(btnComp, "cell 1 7 6 1,alignx center");
	}

	protected void comprobarCheckBox()
	{
		txpPanel.setText("");
		for (JCheckBox jCheckBox : lista)
			if (jCheckBox.isSelected())
				txpPanel.setText(txpPanel.getText() + jCheckBox.getText() + "\n");
	}

}
