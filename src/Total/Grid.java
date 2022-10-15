package Total;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Grid {
	
	public static  GridBagConstraints codeGrid() {
		GridBagConstraints gridBagConstraints_3 = new GridBagConstraints();
		gridBagConstraints_3.gridy = 1;//行
		gridBagConstraints_3.gridx = 1;//列
		gridBagConstraints_3.ipadx = 100;
		gridBagConstraints_3.ipady = 100;
		gridBagConstraints_3.weightx = 0.5;
		gridBagConstraints_3.weighty = 0.5;
		gridBagConstraints_3.fill = GridBagConstraints.BOTH;
		return gridBagConstraints_3;
	}
	
	public static  GridBagConstraints buttonGrid() {
		GridBagConstraints gridBagConstraints_4 = new GridBagConstraints();
		gridBagConstraints_4.gridy = 2;
		gridBagConstraints_4.gridx = 1;
		gridBagConstraints_4.ipadx = 100;
		gridBagConstraints_4.ipady = 100;
		return gridBagConstraints_4;
	}
	
	public static  GridBagConstraints resultGrid() {
		GridBagConstraints gridBagConstraints_5 = new GridBagConstraints();
		gridBagConstraints_5.gridy = 1;//行
		gridBagConstraints_5.gridx = 0;//列
		gridBagConstraints_5.gridheight = 2;
		gridBagConstraints_5.fill = GridBagConstraints.BOTH;
		return gridBagConstraints_5;
	}
	
	public static  GridBagConstraints descGrid() {
		GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
		gridBagConstraints_1.gridy = 0;//行
		gridBagConstraints_1.gridx = 1;//列
		gridBagConstraints_1.weightx = 0.5;
		gridBagConstraints_1.weighty = 0.5;
		gridBagConstraints_1.ipadx = 100;
		gridBagConstraints_1.ipady = 100;
		gridBagConstraints_1.fill = GridBagConstraints.BOTH;
		return gridBagConstraints_1;
	}
}
