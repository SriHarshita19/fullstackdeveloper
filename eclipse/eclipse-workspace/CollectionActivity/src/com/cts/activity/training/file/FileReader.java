package com.cts.activity.training.file;
import java.io.IOException;

public class FileReader {
	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader();    
        int i;    
        while((i=fr.read())!=-1)
        {
        System.out.print((char)i);    
        fr.close();    
        }
		// TODO Auto-generated method stub
		
	}

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}
}
