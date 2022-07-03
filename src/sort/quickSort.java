package sort;

import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        sort(array,0,array.length-1);

        for(int i = 0; i < array.length; i++){
            System.out.println(" -- " + array[i]);
        }

    }
    public static void sort(int[] array,int left,int right){
        int i = left;
        int j = right;
        if( i >= j)return;
        int temp = array[i];
        while(i < j){
            while(array[j] > temp && i<j)j--;
            array[i] = array[j];
            while(array[i] < temp && i<j)i++;
            array[j] = array[i];
        }
        sort(array,left,i-1);
        sort(array,i+1,right);
        array[i] = temp;
    }

}
