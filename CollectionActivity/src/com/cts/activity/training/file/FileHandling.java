package com.cts.activity.training.file;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileHandling {
public static void main(String args[]) throws IOException 
{
String path="C:\\Users\\Dell\\task\\task.txt";
FileInputStream fin=new FileInputStream(path);
FileOutputStream fout= new FileOutputStream("copied.txt");
int i;
while((i=fin.read())!=-1)
		{
	       fout.write(i);
		}
fin.close();
fout.close();
}
}