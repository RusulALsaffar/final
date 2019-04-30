import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.NoSuchElementException;
import java.util.Queue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class jf extends JFrame {
	private static JPanel JcontentPane;
	private static JTextField txtRep;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					jf frame = new jf();
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
	public jf() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JcontentPane = new JPanel();
		JcontentPane.setBackground(Color.GREEN);
		JcontentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(JcontentPane);
		JcontentPane.setLayout(null);

		JLabel Jlabel1 = new JLabel("Number of Representatives");
		Jlabel1.setBounds(10, 32, 140, 20);
		JcontentPane.add(Jlabel1);

		txtRep = new JTextField();
		txtRep.setBounds(169, 33, 86, 20);
		JcontentPane.add(txtRep);
		txtRep.setColumns(10);

		JButton Bprocess = new JButton("Process Calls");
		ActionListener listener = new ClickListener();

		Bprocess.addActionListener(listener);
		Bprocess.setForeground(Color.GRAY);
		Bprocess.setBounds(10, 72, 89, 23);
		JcontentPane.add(Bprocess);
	}

	/**
	 * @return
	 * 
	 * 
	 * 
	 */
	public static boolean jfget() {
		String input1 = txtRep.getText();
		if (!input1.equals("")) {
			ClickListener.MAX_Representative = Integer.valueOf(input1);
			return true;
		}
		return false;
	}
}
