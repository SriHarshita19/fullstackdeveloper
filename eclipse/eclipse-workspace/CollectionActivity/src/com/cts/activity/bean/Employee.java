package com.cts.activity.bean;

import java.io.Serializable;

public class Employee implements Serializable {

		private int id;
		private String name;
		transient private String address;
		private int age;
		private double phone;
		transient private double salary;

		public Employee() {

		}

		public Employee(int id, String name, String address, int age, double phone, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.age = age;
			this.phone = phone;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getPhone() {
			return phone;
		}

		public void setPhone(double phone) {
			this.phone = phone;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return id + " : " + name + " : " + address + " : " + age + "  : " + phone + " : " + salary;
		}

	}


