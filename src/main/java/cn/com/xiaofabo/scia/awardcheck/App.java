package cn.com.xiaofabo.scia.awardcheck;

import cn.com.xiaofabo.scia.awardcheck.fileprocessor.DocReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        DocReader docReader = new DocReader();
        docReader.readWordFile("D:/tmp/1.docx");
        System.out.println(docReader.getDocText());
    }
}
