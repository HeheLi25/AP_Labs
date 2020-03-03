package week5_Thread.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class ListPrimes extends JFrame implements ActionListener{
	private JButton start;
	private JButton stop;
	private JTextArea countText;
	private CountTask ct;

	public ListPrimes() {
		setTitle("Find Primes");
		setSize(505,332);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		start = new JButton("start");
		start.setBounds(43, 31, 93, 37);
		start.setActionCommand("start");
		start.addActionListener(this);
		
		stop = new JButton("stop");
		stop.setBounds(168, 31, 81, 37);
		stop.setEnabled(false);
		stop.setActionCommand("stop");
		stop.addActionListener(this);

		
		countText =  new JTextArea(50,50);
		
		JScrollPane sp = new JScrollPane(countText);
		sp.setBounds(43, 89, 395, 151);
		getContentPane().setLayout(null);
		getContentPane().add(start);
		getContentPane().add(stop);
		getContentPane().add(sp);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("start")) {
			countText.setText("");
			start.setEnabled(false);
			stop.setEnabled(true);
			(ct = new CountTask()).execute();
		}
		if(e.getActionCommand().equals("stop")) {
			start.setEnabled(true);
			stop.setEnabled(false);
			ct.cancel(true);
		}
		
	}

	public static boolean primeOrNot(int aNum) {// A method to determine whether a number is prime or not.

		boolean isPrime = true;
		for (int i = 2; i < aNum; i++) {
			if (aNum % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	private class CountTask extends SwingWorker<Void, String> {
		protected Void doInBackground() {
			try {
				int counter = 1;
				int num = 2;
				String s = countText.getText();
				while (!isCancelled()) {
					if (primeOrNot(num)) {
						s = s  + counter + ":" + num+ "\n";
						counter++;
						Thread.sleep(1000);
						publish(s);
					}
					num++;
				}
			} catch (InterruptedException e) {
			}
			return null;
		}

		protected void process(List<String> counts) {
			String s = counts.get(counts.size() - 1);
			countText.setText(s);
		}
	}

	public static void main(String[] args) {
		ListPrimes f = new ListPrimes();
		f.setVisible(true);
	}

}
