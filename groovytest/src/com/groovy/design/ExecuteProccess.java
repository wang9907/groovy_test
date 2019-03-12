package com.groovy.design;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteProccess {

	public static void main(String[] args) {
		try {
			Process proc = Runtime.getRuntime().exec("git --version");
			BufferedReader result = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line;
			while((line=result.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
