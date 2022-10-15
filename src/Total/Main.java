package Total;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.*;

import part1.*;
import part2.*;
import part2.Alphabetizer;
import part2.Input;
import part2.Output;
import part2.Shift;
import part3.*;
import part4.*;

public class Main {
	public static void main(String[] args){
		//创建frame
		JFrame frame = new JFrame("软件体系结构实验2");
		//创建tab便签页
		JTabbedPane tab = new JTabbedPane();
		frame.setSize(1500, 1000);
		frame.setLayout(new BorderLayout());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setFont(new Font("黑体",Font.BOLD,66));
		Section  section = new Section();
		tab.add("主程序-子程序",section.createPanel(1));
		tab.add("面向对象",section.createPanel(2));
		tab.add("事件系统",section.createPanel(3));
		tab.add("管道-过滤",section.createPanel(4));
		tab.setSelectedIndex(0);
		frame.setContentPane(tab);
		frame.setVisible(true);
	}
}