package week5_Thread.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

public class Frame extends JFrame implements ActionListener{
	private final GridBagConstraints constraints;
	private JButton start;
	private JButton stop;
	private JTextField countText;
	private CountTask ct;

	public Frame() {
		setTitle("Frame");
		setSize(500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		constraints = new GridBagConstraints();
		constraints.insets = new Insets(3,10,3,10);
		countText =  new JTextField(20);
		this.add(countText,constraints);
		countText.setText("100");
		
		start = new JButton("start");
		start.setActionCommand("start");
		start.addActionListener(this);
		
		stop = new JButton("stop");
		stop.setEnabled(false);
		stop.setActionCommand("stop");
		stop.addActionListener(this);
		
		this.add(start,constraints);
		this.add(stop,constraints);
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("start")) {
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
	
	private class CountTask extends SwingWorker<Void,Integer>{
		protected Void doInBackground() {
			try {
					Integer count = Integer.parseInt(countText.getText());
					while(!isCancelled()) {
						if(count <= 0) {
							start.setEnabled(true);
							stop.setEnabled(false);
							cancel(true);
						}
						count--;
						Thread.sleep(1000);
						publish(count); 
					}
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			return null;
		}
		protected void process(List<Integer> counts) {
			int lastVal = counts.get(counts.size()-1);
			System.out.println(lastVal);
			countText.setText(String.format("%d",lastVal));
		}
	}
	
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setVisible(true);
	}

}
