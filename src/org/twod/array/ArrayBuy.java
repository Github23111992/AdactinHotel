package org.twod.array;

public class ArrayBuy {
public static void main(String[] args) {
	
	int y[][] = new int[3][5];
	
	System.out.println(y.length);
	
	int te = y.length;
	System.out.println(te);
	
	y[0][0] = 11;
	y[0][1] = 22;
	y[0][2] = 33;
	y[0][3] = 44;
	y[0][4] = 55;
	
	y[1][0] = 66;
	y[1][1] = 77;
	y[1][2] = 88;
	y[1][3] = 99;
	y[1][4] = 10;
	
	y[2][0] = 20;
	y[2][1] = 30;
	y[2][2] = 40;
	y[2][3] = 50;
	y[2][4] = 60;
	
//	normal for loop
	
	for(int b = 0; b<3; b++) {
		for(int c = 0; c<5; c++) {
			System.out.println(y[b][c]);
		}
	}
	
}					
}