package com.ty.testapp;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class TestApp1 {
	static String rows;
	static String cols;
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		HashMap<String, Integer> matrix = new HashMap<>();
		matrix.put("r1c1", 9);
		matrix.put("r1c2", 2);
		matrix.put("r1c3", 3);
		matrix.put("r2c1", 6);
		matrix.put("r2c2", 5);
		matrix.put("r2c3", 1);
		matrix.put("r3c1", 4);
		matrix.put("r3c2", 0);
		matrix.put("r3c3", 8);
		int ele;
		
		Set<String> rowes = matrix.keySet();
		for (int row = 1; row < 4; row++) {
			System.out.println("Enter the Element:");
			ele = read.nextInt();
			if (row == 1) {
				for (String string : rowes) {
					if (ele == matrix.get(string)) {
						rows = string.substring(0, 2);
					}
				}
			}
		}
		
		for (int col = 1; col < 4; col++) {
			System.out.println("Enter the Element:");
			ele = read.nextInt();
			if (col == 1) {
				for (String string : rowes) {
					if (ele == matrix.get(string)) {
						cols= string.substring(2,4);
					}
				}
			}
		}
		System.out.println(matrix.get(rows+cols));

	}

}
