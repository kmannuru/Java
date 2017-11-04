package com.javatutorials;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = {37,44,24,74,234,8,32,4};
		//bubbleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		System.out.println("Sorted Array = "+Arrays.toString(arr));

	}
	
	public static void bubbleSort(int[] data) {
		for(int i=0;i<data.length-1;i++) {
			for (int j=0;j<data.length-1-i;j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] data) {
		for(int i=0;i<data.length;i++) {
			int minIndex = i;
			for(int j=i;j<data.length;j++) {
				if(data[minIndex]>data[j]) {
					minIndex = j;
				}
			}
			int temp = data[i];
			data[i] = data[minIndex];
			data[minIndex] = temp;
		}
	}
	
	public static void insertionSort(int[] data) {
		for(int i=1;i<data.length;i++) {
			int j=i;
			while(j>0 && (data[j]<data[j-1])) {
				int temp=data[j];
				data[j] = data[j-1];
				data[j-1] = temp;
				j--;
			}
		}
	}

}
