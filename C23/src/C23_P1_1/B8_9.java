/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C23_P1_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Akalis
 */
public class B8_9 {
    public static void main(String[] args) {
	int n, number;
	Random rd = new Random();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Nhap so phan tu: ");
	n = scanner.nextInt();
	ArrayList<Integer> arrList = new ArrayList<>(n);
		
	for (int i = 0; i < n; i++) {
		number = 3 + rd.nextInt(298);
		arrList.add(number);
	}
		
	for (int i = 0; i < n; i++) {
		if (arrList.get(i) % 3 == 0) {
			System.out.print(arrList.get(i) + "\t");
		}
	}
}
}
