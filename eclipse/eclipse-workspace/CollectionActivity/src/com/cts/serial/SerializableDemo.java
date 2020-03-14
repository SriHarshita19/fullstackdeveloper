package com.cts.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cts.activity.bean.Employee;
import com.cts.activity.main.EmployeeMain;

public class SerializableDemo {
public static Object deserialize(String filename)throws IOException,ClassNotFoundException
{
	FileInputStream fin=new FileInputStream(filename);
	BufferedInputStream bin=new BufferedInputStream(fin);
	ObjectInputStream oin=new ObjectInputStream(fin);
	Object obj=oin.readObject();
	return obj;
}

	public static void serialize(Object obj, String filename) throws IOException {
		FileOutputStream fout = new FileOutputStream(filename);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		ObjectOutputStream out = new ObjectOutputStream(bout);
		out.writeObject(obj);
		out.close();
		bout.close();
		fout.close();

	}

	public static void main(String args[]) {
		Employee employee = new Employee(1111,"anu","vij",22,438783465,344456.00);
		try {
			serialize(employee, "serial.txt");
			Employee emp = (Employee) deserialize("serial.txt");
			System.out.println(emp);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
