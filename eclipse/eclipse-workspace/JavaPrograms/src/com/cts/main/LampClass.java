package com.cts.main;

public class LampClass {
		  boolean isOn;
		  void turnOn() {
		    isOn = true;
		  }
		  void turnOff() {
		   isOn = false;
		  }
		}
		class ClassObjects {
		public static void main(String[] args) {
		   LampClass l1 = new LampClass(); 
		   LampClass l2 = new LampClass(); 
		  }
		}



