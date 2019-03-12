package com.groovy.demo

class IOTest {
	
	static void main(String[] args) {
		File file = new File("d:\\lixiao\\idfile.txt");
		println "The file ${file.absolutePath} has ${file.length()} bytes."
		file.eachLine { 
			line -> println("$line")
		}
		println file.text
		
		/*File file1 = new File("d:\\lixiao\\idfile.txt");
		file1.withWriter("utf-8") { 
			writer ->writer.write('Hello Word')
		}*/
	}
}
