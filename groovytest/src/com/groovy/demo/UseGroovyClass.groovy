package com.groovy.demo

import com.sun.org.apache.xerces.internal.parsers.XMLParser

class UseGroovyClass {
	
	static void main(String[] args) {
      // Using a simple println statement to print output to the console
      println XMLParser.class
	  println XMLParser.class.superclass
	  
	  def x = 3;
	  println x;
	  String y = "Hello Work";
	  System.out.print(y);
   }
	
}
