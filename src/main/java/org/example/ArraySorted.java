package org.example;

import java.util.Arrays;

public class ArraySorted {

    public static void bubbleSortInt(int[] values){
        int n = values.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (values[j]>values[j+1]){
                    int temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }


    }
    public static void selectionSortInt(int[] values) {
        int n = values.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (values[j] < values[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = values[minIndex];
            values[minIndex] = values[i];
            values[i] = temp;
        }
    }

    public static void insertionSortInt(int[] values) {
        int n = values.length;
        for (int i = 1; i < n; i++) {
            int key = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j = j - 1;
            }
            values[j + 1] = key;
        }
    }
        public static void quickSortInt(int[] values) {
        quickSort(values, 0, values.length - 1);
    }

    private static void quickSort(int[] values, int low, int high) {
        if (low < high) {
            int pi = partition(values, low, high);
            quickSort(values, low, pi - 1);
            quickSort(values, pi + 1, high);
        }
    }

    private static int partition(int[] values, int low, int high) {
        int pivot = values[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (values[j] < pivot) {
                i++;
                int temp = values[i];
                values[i] = values[j];
                values[j] = temp;
            }
        }
        int temp = values[i + 1];
        values[i + 1] = values[high];
        values[high] = temp;
        return i + 1;
    }

    public static void mergeSortInt(int[] values) {
        if (values.length < 2) {
            return;
        }
        int mid = values.length / 2;
        int[] left = new int[mid];
        int[] right = new int[values.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = values[i];
        }
        for (int i = mid; i < values.length; i++) {
            right[i - mid] = values[i];
        }
        mergeSortInt(left);
        mergeSortInt(right);

        merge(values, left, right);
    }

    private static void merge(int[] values, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                values[k++] = left[i++];
            } else {
                values[k++] = right[j++];
            }
        }
        while (i < left.length) {
            values[k++] = left[i++];
        }
        while (j < right.length) {
            values[k++] = right[j++];
        }
    }


    public static void radixSortInt(int[] values) {
        int max = getMax(values);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(values, exp);
        }
    }

    private static int getMax(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private static void countSort(int[] values, int exp) {
        int n = values.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(values[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[(values[i] / exp) % 10] - 1] = values[i];
            count[(values[i] / exp) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            values[i] = output[i];
        }
    }


    public static void heapSortInt(int[] values) {
        int n = values.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(values, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = values[0];
            values[0] = values[i];
            values[i] = temp;
            heapify(values, i, 0);
        }
    }

    private static void heapify(int[] values, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && values[left] > values[largest]) {
            largest = left;
        }
        if (right < n && values[right] > values[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = values[i];
            values[i] = values[largest];
            values[largest] = swap;
            heapify(values, n, largest);
        }
    }

    public static void shellSortInt(int[] values) {
        int n = values.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = values[i];
                int j;
                for (j = i; j >= gap && values[j - gap] > temp; j -= gap) {
                    values[j] = values[j - gap];
                }
                values[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0,67,44,32,7,6,22,21,897,444};
        bubbleSortInt(arr);
        System.out.println("bubbleSortInt :" + " " +   Arrays.toString(arr));
        selectionSortInt(arr);
        System.out.println("selectionSortInt :" + " " +   Arrays.toString(arr));
        insertionSortInt(arr);
        System.out.println("insertionSortInt :" + " " +   Arrays.toString(arr));
        quickSortInt(arr);
        System.out.println("quickSortInt :" + " " +   Arrays.toString(arr));
        mergeSortInt(arr);
        System.out.println("mergeSortInt :" + " " +   Arrays.toString(arr));
        radixSortInt(arr);
        System.out.println("radixSortInt :" + " " +   Arrays.toString(arr));
        heapSortInt(arr);
        System.out.println("heapSortInt :" + " " +   Arrays.toString(arr));
        shellSortInt(arr);
        System.out.println("shellSortInt :" + " " +   Arrays.toString(arr));




    }
}
