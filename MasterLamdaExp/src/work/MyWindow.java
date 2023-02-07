package work;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {
		
		//window:Object jFrame
		
		JFrame frame =new JFrame("My window");
		frame.setSize(400,500);	
		frame.setLayout(new FlowLayout());
		
		
	//create button and add jframe
		
		JButton button=new JButton("click here");
		frame.add(button);

		/*
		 * button.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) {
		 * System.out.println("button click"); JOptionPane.showMessageDialog(null,
		 * "hey button click");
		 * 
		 * } });  this is anonymous class
		 */
		button.addActionListener((ActionEvent e)->{
			System.out.println("Button Click");
			JOptionPane.showInternalMessageDialog(null,"hey button click");
			
		});
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	
	}

}
