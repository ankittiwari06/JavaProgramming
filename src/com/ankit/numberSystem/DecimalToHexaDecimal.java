/**
 * 
 */
package com.ankit.numberSystem;

import java.util.Scanner;

/**
 * @author ankit
 *
 */
public class DecimalToHexaDecimal {

	/**
	 * @param args
	 */

	public static void decimalToHexadecimal(int dec_num) {
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int rem;
		String hex_num = "";
		while (dec_num > 0) {
			rem = dec_num % 16;
			hex_num = hex[rem] + hex_num;
			dec_num = dec_num / 16;
		}
		System.out.println(hex_num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int dec_num = sc.nextInt();
		System.out.print("Hexadecimal value is : ");
		decimalToHexadecimal(dec_num);
	}

}
