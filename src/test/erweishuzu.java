package test;

public class erweishuzu {

	public static void main(String args[]) {  
       // int arr[][] = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };  
       // int arr1[][] = new int[4][2];
        int[][] arr2 = new int[4][5];
        for (int x = 0; x < arr2.length; x++) {  
            for (int y = 0; y < arr2[x].length; y++) {  
                System.out.print(arr2[x][y] + "、");  
            }  
            System.out.println("");  
        }  
    }  
}
