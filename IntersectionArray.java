/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printarr;

import java.util.Arrays;

/**
 *
 * @author 1
 */
public class IntersectionArray {

    public static void printArr(int[] arr){
    for (int a:arr){
        System.out.print(a + ", ");
    }
    System.out.println();
}

public static int[] intersectionOf(int[] arr1, int[] arr2){
    Arrays.sort(arr1);
    Arrays.sort(arr2);

    printArr(arr1);
    printArr(arr2);

    int i=0, j=0, k=0;
    int[] arr = new int[Math.min(arr1.length, arr2.length)];

    while( i < arr1.length && j < arr2.length){
        if(arr1[i] < arr2[j]){
            i++;
        } else if(arr1[i] > arr2[j]){
            j++;
        } else {
            arr[k++] = arr1[i++];
            j++;
        }
    }
    return Arrays.copyOf(arr, k);
}
    
    
    
   public static void main(String[] args) {
    int[] arr1 = {1, 2, 6};
    int[] arr2 = {10, 2, 5, 1};
    printArr(intersectionOf(arr1,arr2));
}
    
}


