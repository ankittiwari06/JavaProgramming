/**
 * 
 */
package com.ankit.numberSystem;

import java.util.Scanner;

/**
 * @author ankit
 *
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */

	public static void binaryNumber(int dec_num) {
		int bin_num[] = new int[100];
		int rem, quot, i = 1;
		quot = dec_num;

		while (quot != 0) {
			bin_num[i++] = quot%2;
			quot = quot/2;
		}
		
		for(int j=i-1; j>0; j--) {
			System.out.print(bin_num[j]);
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number : ");
		int dec_num = sc.nextInt();
		System.out.print("Binary Number is ");
		binaryNumber(dec_num);
	}

}
