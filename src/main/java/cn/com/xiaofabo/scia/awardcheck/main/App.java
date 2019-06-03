package cn.com.xiaofabo.scia.awardcheck.main;

import org.apache.log4j.Logger;

import cn.com.xiaofabo.scia.awardcheck.fileprocessor.ArbitrationReader;
import cn.com.xiaofabo.scia.awardcheck.fileprocessor.DocReader;

/**
 * Hello world!
 *
 */
public class App {
	static Logger logger = Logger.getLogger(App.class.getName());

	public static void main(String[] args) throws Exception {
		ArbitrationReader arbReader = new ArbitrationReader();
		arbReader.process("D:/tmp/1.docx");
//		System.out.println(arbReader.getDocText());
	}
}
