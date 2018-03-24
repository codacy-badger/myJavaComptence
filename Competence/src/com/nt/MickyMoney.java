package com.nt;

import java.util.Scanner;

public class MickyMoney {
    public void findMaxMoney(int i, String money) {

        int[][] values = new int[i][i];
        money = money.substring(1, money.length() -1);
        String[] valuesStr = money.split("\\),\\(");
        int rowCount = 0;
        for(String aVal : valuesStr) {

            String[] ints = aVal.split(",");
            int colCount = 0;
            for(String anInt : ints) {
                values[rowCount][colCount] = Integer.valueOf(anInt);
                colCount ++;
            }
            rowCount ++;

        }


        // logic

        findMax(0, 0, i, i, values, 0);
        System.out.print(maxSum);
    }
    
    
    public void findMaxMoney(int i, int[][] values) {
    	
    	findMax(0, 0, i, i, values, 0);
        System.out.print(maxSum);
    }
    

    private void findMax(int nextRow, int nextCol, int maxRow, int maxCol, int[][] values, int sum) {

        if(nextRow >= maxRow || nextCol >= maxCol) {
            return;
        }
        sum += values[nextRow][nextCol];
        if(nextRow == maxRow - 1 && nextCol == maxCol - 1) {
            if(sum > maxSum) maxSum = sum;
        }

        findMax(nextRow, nextCol + 1, maxRow, maxCol, values, sum);

        findMax(nextRow + 1, nextCol, maxRow, maxCol, values, sum);


    }
    int maxSum = 0;

    public static void main(String[] args) {
    	
    	if(args.length>0) {
    		
    		int row=new Integer(args[0]);
    		String s=args[1];
    		new MickyMoney().findMaxMoney(row,s);
    		
    	}
    	
    	else	{
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter row");
    	int row=sc.nextInt();
    	System.out.println("enter money in array");
    	int arrayOfMoney[][] = new int[row][row];
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<row;j++) {
    			System.out.println("enter money for =="+i+","+j);
    			
    			arrayOfMoney[i][j]=sc.nextInt();
    		}
    	}
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<row;j++) {
    			System.out.print(arrayOfMoney[i][j]);
    			
    		
    		}
    		System.out.println();
    	}
    	
    	new MickyMoney().findMaxMoney(row,arrayOfMoney);
        //new MickyMoney().findMaxMoney(4, "(1,7,5,2),(5,12,3,6),(100,9,23,16),(16,4,5,9)");
    }
    }
}