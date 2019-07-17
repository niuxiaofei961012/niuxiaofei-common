package com.niuxiaofei.common.utils;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import org.junit.Test;

public class StreamUtilTest {

	//批量关闭流，参数能传无限个,例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	@Test
	public void testCloseAll() throws IOException {
		InputStream src = new FileInputStream("h:/a.txt");
		BufferedWriter b = new BufferedWriter(new FileWriter("h:/b.txt"));
		StreamUtil.closeAll(src,b);
	}

	//拷贝流，将InputStream流拷到OutputStream，可以用于快速读与文件、上传下载，为了提高性能，需要使用缓冲。
	@Test
	public void testCopy() throws IOException {
		InputStream src = new FileInputStream("h:/a.txt");
		OutputStream out = new FileOutputStream("h:/d.txt");
			
		StreamUtil.copy(src, out, true, true);
		
	}

	//传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，要求方法内部调用上面第2个方法拷贝流，结束后第1个方法关闭流
	@Test
	public void testReadTextFileInputStream() throws IOException {
		InputStream src = new FileInputStream("h:/a.txt");
		System.out.println(StreamUtil.readTextFile(src));
	}

	//传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第3个方法
	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		File file = new File("h:/a.txt");
		System.out.println(StreamUtil.readTextFile(file));
	}

	//从控制台读取用户输入的字符串。 
	@Test
	public void testReadStringFromSystemIn() throws IOException {
		System.out.println("请输入姓名");
		Scanner s = new Scanner(System.in);
		String string = s.next();
		
		System.out.println(StreamUtil.readStringFromSystemIn(string));
	}

	//从控制台读取用户输入的数字。 
	@Test
	public void testReadIntFromSystemIn() throws IOException {
		System.out.println("请输入年龄");
		Scanner s = new Scanner(System.in);
		String string = s.next();
		System.out.println(StreamUtil.readIntFromSystemIn(string));
		
	}

}
