package com.groovy.design

class Execute {

	public static void main(String[] args) {
		println "git --version".execute().text
		println "git --version".execute().getClass().name
	}
	
}

