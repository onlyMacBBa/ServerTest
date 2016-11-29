package com.jhapp.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ServerGui {
	
	JFrame frame = new JFrame("ServerTest");
	Container contentPane = frame.getContentPane();
    JTextField text = new JTextField();
    JButton button = new JButton("¿˙¿Â");
	
	public void printGui() {
		frame.setPreferredSize(new Dimension(500, 500));
        frame.setLocation(500, 400);
        
        contentPane.add(text, BorderLayout.CENTER);
        contentPane.add(button, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true); 
	}
}
