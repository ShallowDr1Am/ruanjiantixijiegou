package Total;

public class Tab {
	public static String[] txt(int type) {
		String[] string1 = new String[3];
		String content_desc =new String();
		String content_imgurl =new String();
		String content_code =new String();
		if(type == 1) {
			content_desc = "软件体系结构中主程序—子程序体系结构是较简单的结构，其组件是主程序和子程序，连接件是调用返回机制。";
			content_imgurl = "./utils/part1.png";
			content_code = "核心代码:\r\n"
					+ "public static void main(String[] args) {\r\n"
					+ "        demo1 kwic = new demo1();\r\n"
					+ "        kwic.input(\"utils/input.txt\");\r\n"
					+ "        kwic.shift();\r\n"
					+ "        kwic.alphabetizer();\r\n"
					+ "        kwic.output(\"utils/output.txt\");\r\n"
					+ "    }";
			
		}
		else if(type == 2) {
			content_desc = "面向对象体系结构面向对象体系结构基于配置图的软件体系结构一个合理、健全、内在一致的体系结构，是建立高水平软件系统的基础，即软件系统的体系结构，决定了软件的质量。";
			content_imgurl = "utils/part2.png";
			content_code = "核心代码:\r\n"
					+ "public static void main(String[] args) {\r\n"
					+ "        Input input = new Input();\r\n"
					+ "        input.input(\"utils/input.txt\");\r\n"
					+ "        Shift shift = new Shift(input.getLineTxt());\r\n"
					+ "        shift.shift();\r\n"
					+ "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\r\n"
					+ "        alphabetizer.sort();\r\n"
					+ "        Output output = new Output(alphabetizer.getKwicList());\r\n"
					+ "        output.output(\"utils/output.txt\");\r\n"
					+ "    }";
		}
		else if(type == 3) {
			content_desc = "观察者模式定义了一种一对多的依赖关系，\n让多个观察者对象同时监听某一个主题对象。\n"
					+ "这个主题对象在状态变化时，\n会通知所有的观察者对象，\n使他们能够自动更新自己。\n它可以实现表示层和数据逻辑层的分离。";
			content_imgurl = "utils/part3.png";
			content_code = "核心代码:\r\n"
					+ "public static void main(String[] args) {\r\n"
					+ "        //创建主题\r\n"
					+ "        KWICSubject kwicSubject = new KWICSubject();\r\n"
					+ "        //创建观察者\r\n"
					+ "        Input input = new Input(\"utils/input.txt\");\r\n"
					+ "        Shift shift = new Shift(input.getLineTxt());\r\n"
					+ "        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());\r\n"
					+ "        Output output = new Output(alphabetizer.getKwicList(), \"utils/output.txt\");\r\n"
					+ "\r\n"
					+ "        // 将观察者加入主题\r\n"
					+ "        kwicSubject.addObserver(input);\r\n"
					+ "        kwicSubject.addObserver(shift);\r\n"
					+ "        kwicSubject.addObserver(alphabetizer);\r\n"
					+ "        kwicSubject.addObserver(output);\r\n"
					+ "        // 逐步调用各个观察者\r\n"
					+ "        kwicSubject.startKWIC();\r\n"
					+ "    }";
		}
		else if(type == 4) {
			content_desc = "管道-过滤为处理数据流的系统提供了一种结构。\n"
					+ "单步数据处理封装在一个过滤器中，数据在过滤器之间的管道传输。\n"
					+ "以便实现对数据的多次操作。"
					+ "1.高效的并行效率（灵活使用active（主动） 过滤器）\n"
					+ "2.过滤器可以重组/重用/可替换\n"
					+ "3.不需要中间保存";
			content_imgurl = "utils/part4.png";
			content_code = "核心代码:\r\n"
					+ "public static void main(String[] args) throws IOException {\r\n"
					+ "        File inFile = new File(\"utils/input.txt\");\r\n"
					+ "        File outFile = new File(\"utils/output.txt\");\r\n"
					+ "        Pipe pipe1 = new Pipe();\r\n"
					+ "        Pipe pipe2 = new Pipe();\r\n"
					+ "        Pipe pipe3 = new Pipe();\r\n"
					+ "        Input input = new Input(inFile, pipe1);\r\n"
					+ "        Shift shift = new Shift(pipe1, pipe2);\r\n"
					+ "        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);\r\n"
					+ "        Output output = new Output(outFile,pipe3);\r\n"
					+ "        input.transform();\r\n"
					+ "        shift.transform();\r\n"
					+ "        alphabetizer.transform();\r\n"
					+ "        output.transform();\r\n"
					+ "    }";
		}
		string1[0]=content_desc;
		string1[1]=content_imgurl;
		string1[2]=content_code;
		return string1;
	}
}
