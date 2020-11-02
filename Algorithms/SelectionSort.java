package Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }
    static void swap(int[] arr, int i, int min)
    {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
    public static void main(String[] args)
    {
        int[] arr ={-9,4,7,-5,8,2,0,1,-3};

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
