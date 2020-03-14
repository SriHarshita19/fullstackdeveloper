package com.cts.activity.main;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
public class FileHandling {
public static void main(String args[]) throws FileNotFoundException,IOException
{
	
	String path="C:\\Users\\Dell\\Desktop\\Java\\data.txt";
	File file=new File(path);
	System.out.println("Can execute?:"+file.canExecute());
	System.out.println("Can read?:"+file.canRead());
	System.out.println("Can write?:"+file.canWrite());
	System.out.println("Can file exists?:"+file.exists());
	System.out.println("Can absolute path?:"+file.getAbsolutePath());
	System.out.println("Can file name?:"+file.getName());
	FileOutputStream fout= new FileOutputStream(file,true);
	Scanner in=new Scanner(System.in);
	String msg=in.nextLine();
	byte[] b=msg.getBytes();
	fout.write(b);
	fout.close();
	
}
}
