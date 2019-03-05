package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;
	
	public int[] getCol(int iCol) {
		int[] col= new int[this.LatinSquare.length];
		for (int row = 0; row<col.length;row++) {
			col[row] = LatinSquare[row] [iCol];
		}
		return col;
	}
	
	public int[] getRow(int iRow) {
		int[] row= new int[this.LatinSquare.length];
		for (int col = 0; col<row.length;col++) {
			col[col] = LatinSquare[iRow] [col];
		}
		return row;
		
	}
	
	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public static boolean doesElementExist(int[] arr, int iValue) {
		for (int x = 0; x < arr.length; x++)
			if (arr[x] == iValue) {
				return true;
			}
		}

		return false;
	


	public static boolean hasDuplicates (int[] arr){
		int[] arrCopy = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arrCopy);
		for (int i = 0; i < arr.length -1; i++) {
			if (arrCopy[i] == arrCopy[i+1]){
				return true;
			}
		}
		return false;
	}

	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean hasAllValues = true;
		for (int i = 0; i < arr2.length; i++) {
			boolean bFound = false;
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == arr2[i]) {
					bFound = true;
					break;
				}

			}
			if (bFound == false) {
				hasAllValues = false;
				break;
			}
		}
		return hasAllValues;

	}
	
	public boolean containsZero() {
		for(int i=0;i<LatinSquare.length;i++) {
			for(int j = 0;j<LatinSquare.length;j++) {
				if(LatnSquare[i][j]==0) {
					return true
				}
			}
		}
		return false;
		
	
	public boolean isLatinSquare() {
		boolean isLatinSquare = true;
		for(int i = 0; i<LatinSquare.length;i++) {
			if(hasDuplicates(getRow(i)))
				return false;
		
		}
		
		for(int j = 0; j<LatinSquare.length;j++) {
			if(hasDuplicates(getCol(j)))
				return false;
			
	
		
		}
		for(int i=1;i<LatinSquare.length; i++) {
			if(!hasAllValues(getRow(0),getRow(i))) {
				return false;
				
			
		}
		for(int j=1;j<LatinSquare.length; j++) {
			if(!hasAllValues(getCol(0),getCol(j))) {
				return false;
				
				}
		}
		return isLatinSquare;

		}
	
		

	


