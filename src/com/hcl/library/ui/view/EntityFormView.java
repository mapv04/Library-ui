package com.hcl.library.ui.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class EntityFormView extends JFrame{
	protected JPanel formSection;
	
	public EntityFormView() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(500, 650);
		this.setResizable(false);
		this.setLayout(null);
		formSection= new JPanel();
		formSection.setSize(500,600);
		formSection.setBackground(Color.GRAY);
		this.add(formSection);
		
	}
	
	public JPanel getPanel() {
		return this.formSection;
	}
}
