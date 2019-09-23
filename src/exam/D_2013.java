package exam;

import java.util.Scanner;

public class D_2013 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		scanner.nextLine();
		String[] data;
		int count=0;
		while(T-->0) {
			String input=scanner.nextLine();
			data=input.split(" ");
			int iHl = Integer.parseInt(data[0].substring(1), 16)*4;
			int tHL = Integer.parseInt(data[iHl+12].substring(0,1),16)*4;
			System.out.println("Case #"+ ++count);
			System.out.println("Total length = "+Integer.parseInt(data[2]+data[3], 16)+" bytes");
			System.out.println("Source = "+Integer.parseInt(data[12], 16)+"."+Integer.parseInt(data[13], 16)+"."+Integer.parseInt(data[14], 16)+"."+Integer.parseInt(data[15], 16));
			System.out.println("Destination = "+Integer.parseInt(data[16], 16)+"."+Integer.parseInt(data[17], 16)+"."+Integer.parseInt(data[18], 16)+"."+Integer.parseInt(data[19], 16));
			System.out.println("Source Port = "+Integer.parseInt(data[iHl]+data[iHl+1], 16));
			System.out.println("Destination Port = "+Integer.parseInt(data[iHl+2]+data[iHl+3], 16));
		}
	}
}
