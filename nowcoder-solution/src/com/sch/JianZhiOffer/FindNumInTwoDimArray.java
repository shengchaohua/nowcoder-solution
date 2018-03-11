package com.sch.JianZhiOffer;

public class FindNumInTwoDimArray {
	public boolean Find(int target, int [][] array) {
        int row = array.length;
        int column = array[0].length;
        for (int i = row-1, j = 0; i >= 0 && j < column ; ) {
            if (array[i][j] == target) {
                return true;
            } else if(array[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumInTwoDimArray fn = new FindNumInTwoDimArray();
		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(fn.Find(5, array));
	}

}
