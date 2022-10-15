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


public class Section {
	public static JComponent createPanel(int type) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		String content_desc = new String();
		String content_imgurl = new String();
		String content_code = new String();
		String[] String1 = Tab.txt(type);
		content_desc = String1[0];
		content_imgurl = String1[1];
		content_code = String1[2];

		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);		
		JTextArea desc = new JTextArea(content_desc);
		desc.setLineWrap(true); 
		desc.setFont(font);
		JScrollPane scroll_desc = new JScrollPane(desc);
		scroll_desc.setFont(new Font(null, Font.PLAIN, 50));
		GridBagConstraints gridBagConstraints_1 = Grid.descGrid();
		panel.add(scroll_desc,gridBagConstraints_1);
		
		
		ImageIcon img = new ImageIcon(content_imgurl);
		img.setImage(img.getImage().getScaledInstance(500, 240, 0));
		JLabel label = new JLabel(img);
		GridBagConstraints gridBagConstraints_2 = new GridBagConstraints();
		gridBagConstraints_2.gridy = 0;
		gridBagConstraints_2.gridx = 0;
		gridBagConstraints_2.weightx = 0.3;
		gridBagConstraints_2.weighty = 0.3;
		gridBagConstraints_2.fill = GridBagConstraints.HORIZONTAL;
		panel.add(label,gridBagConstraints_2);
		
		
		final JTextArea result = new JTextArea("运行结果");
	    result.setFont(font);
	    result.setForeground(Color.BLUE);
		JScrollPane scroll_result = new JScrollPane(result);
		scroll_result.setFont(new Font(null, Font.PLAIN, 20));
		GridBagConstraints gridBagConstraints_5 = Grid.resultGrid();
		panel.add(scroll_result,gridBagConstraints_5);
		
		
		JTextArea codeArea = new JTextArea(content_code);
		codeArea.setCaretPosition(0);
		codeArea.setFont(font);
		JScrollPane scroll_code = new JScrollPane(codeArea);
		scroll_result.setFont(new Font(null, Font.PLAIN, 10));
		GridBagConstraints gridBagConstraints_3 = Grid.codeGrid();
		panel.add(scroll_code,gridBagConstraints_3);
		
		JButton button = new JButton("进行");
		button.setFont(new Font(null, Font.BOLD, 30));
		GridBagConstraints gridBagConstraints_4 =Grid.buttonGrid();
		panel.add(button,gridBagConstraints_4);
		

		if(type == 1) {
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						//运行
						result.setText("主程序-子程序演示运行结果：");
						clearFile();
						part1.Input.main(null);
						String result_content = getFileContent();
						result.append(result_content);
					}
					catch (Exception e1) {
			            e1.printStackTrace();
			        }
				}
			});
		}
		else if(type == 2) {
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						result.setText("面向对象演示运行结果：");
						clearFile();
						part2.Main.main(null);
						String result_content = getFileContent();
						result.append(result_content);
					}
					catch (Exception e1) {
			            e1.printStackTrace();
			        }
				}
			});
		}
		else if(type == 3) {
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						result.setText("事件系统-观察者模式演示运行结果：");
						clearFile();
						part3.Main.main(null);
						String result_content = getFileContent();
						result.append(result_content);
					}
					catch (Exception e1) {
			            e1.printStackTrace();
			        }
				}
			});
		}
		else if(type == 4) {
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						//运行
						result.setText("管道-过滤演示运行结果：");//表示清空
						clearFile();//清空文件内容
						part4.Main.main(null);
	    				//读取文件，显示结果
						String result_content = getFileContent();
						result.append(result_content);
					}
					catch (Exception e1) {
			            e1.printStackTrace();
			        }
				}
			});
		}
		else {
			return null;
		}
		
		return panel;
	}
	public static void clearFile(){
		File file = new File("utils/output.txt");
		FileWriter filewriter;
		try {
			filewriter = new FileWriter (file);
			filewriter.write("");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static String getFileContent(){
		File file = new File("utils/output.txt");
	    StringBuilder result = new StringBuilder();
	    try{
	      BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
	      String res = null;
	      while((res = bufferedreader.readLine())!=null){
	        result.append(System.lineSeparator()+res);
	      }
	      bufferedreader.close();  
	    }catch(Exception e){
	      e.printStackTrace();
	    }
	    return result.toString();
	  }
}
