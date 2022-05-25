package org.example;


public class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i=0;i<n-1;i++)
            for (int j=0;j<n-i-1;j++)
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]){
        BubbleSort ex1 = new BubbleSort();
        int arr[] = {4, 1, 3, 9, 7};
        ex1.bubbleSort(arr);
        ex1.printArray(arr);

        BubbleSort ex2 = new BubbleSort();
        int arr2[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        ex2.bubbleSort(arr2);
        ex2.printArray(arr2);
    }
}
