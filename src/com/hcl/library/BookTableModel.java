package com.hcl.library;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class BookTableModel extends DefaultTableModel{
	
	public BookTableModel() {
		addColumns();
		addRows();
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}
	
	void addColumns() {
		this.addColumn("id");
		this.addColumn("Name");
		this.addColumn("isbn");
		this.addColumn("editorial");
		this.addColumn("edition");
		this.addColumn("language");
		this.addColumn("status");
		this.addColumn("authors");
	}
	
	void addRows() {
		String[] row= {"1","lord of the rings", "2450"};
		String[] row1= {"1","lord of the rings", "2450"};
		String[] row2= {"1","lord of the rings", "2450"};
		String[] row3= {"1","lord of the rings", "2450"};
		String[] row4= {"1","lord of the rings", "2450"};
		String[] row5= {"1","lord of the rings", "2450"};
	
		this.addRow(row);
		this.addRow(row1);
		this.addRow(row2);
		this.addRow(row3);
		this.addRow(row4);
		this.addRow(row5);

	}
}
