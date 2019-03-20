package me.com.mergeSort;

//unlike JavaScript, we don't create new arrays in Java for merge sort, instead we keep track of the indexes

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] uArr = {6,23,56,82,32,29,90,132,-4,-88,213,43,88};

//        mergeSort(uArr);
        cLog(mergeSort(uArr));

    }




    public static int[] mergeSort(int[] arr){
        if(arr.length < 2){
            return arr;
        }else{
            int mid = arr.length/2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            return merge(mergeSort(left), mergeSort(right));
        }
    }

    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
            }else if(left[i] > right[j]){
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            result[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            result[k]=right[j];
            j++;
            k++;
        }
        return result;
    }

    public static void cLog(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
