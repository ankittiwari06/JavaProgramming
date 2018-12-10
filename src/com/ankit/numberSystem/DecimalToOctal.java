/**
 * 
 */
package com.ankit.numberSystem;

import java.util.Scanner;

/**
 * @author ankit
 *
 */
public class DecimalToOctal {

	/**
	 * @param args
	 */

	public static void decimalToOctal(int dec_num) {
		int quot, i = 1;
		int oct_num[] = new int[100];
		quot = dec_num;
		while (quot != 0) {
			oct_num[i++] = quot % 8;
			quot = quot / 8;
		}
		for (int j = i - 1; j > 0; j--) {
			System.out.print(oct_num[j]);
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int dec_num = sc.nextInt();
		System.out.print("Octal value is : ");
		decimalToOctal(dec_num);
	}
}
