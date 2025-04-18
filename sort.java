/*
Sort a list with different algorithms

1. Bubble Sort
*/

import java.util.Arrays;

public class sort{
    private final static int ARRAY_SIZE = 10;

    public static void main(String[] args)
    {
        int[] arrayBubble = createArray();
        int[] arraySelection = createArray();
        int[] arrayInsertion = createArray();
        int[] arrayMerge = createArray();
        int[] arrayQuick = createArray();

        System.out.println("\nThe unsorted Bubble array: " + Arrays.toString(arrayBubble));
        BubbleSort(arrayBubble);
        System.out.println("The sorted Bubble array: " + Arrays.toString(arrayBubble));

        System.out.println("\nThe unsorted Selection array: " + Arrays.toString(arraySelection));
        SelectionSort(arraySelection);
        System.out.println("The sorted Selection array: " + Arrays.toString(arraySelection));

        System.out.println("\nThe unsorted Insertion array: " + Arrays.toString(arrayInsertion));
        InsertionSort(arrayInsertion);
        System.out.println("The sorted Insertion array: " + Arrays.toString(arrayInsertion));

        System.out.println("\nThe unsorted Merge array: " + Arrays.toString(arrayMerge));
        arrayMerge = MergeSort(arrayMerge);
        System.out.println("The sorted Merge array: " + Arrays.toString(arrayMerge));

        System.out.println("\nThe unsorted Quick array: " + Arrays.toString(arrayQuick));
        QuickSort(arrayQuick, 0, arrayQuick.length - 1);
        System.out.println("The sorted Quick array: " + Arrays.toString(arrayQuick));


    }

    public static int[] createArray()
    {
        int[] array = new int[ARRAY_SIZE];
        for(int i = 0; i < ARRAY_SIZE; ++i)
        {
            array[i] = (int)(Math.random() * ARRAY_SIZE);
        }

        return array;     
    }

    public static int[] BubbleSort(int[] array)
    {
        for(int i = 1; i < ARRAY_SIZE; ++i)
        {
            for(int j = 0; j < ARRAY_SIZE - 1; ++j)
            {
                if(array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        return array;
    }

    public static int[] SelectionSort(int[] array)
    {
        for(int j = 0; j < ARRAY_SIZE - 1; ++j)
        {
            int iMin = j;

            for(int i = j + 1; i < ARRAY_SIZE; ++i)
            {
                if(array[i] < array[iMin])
                    iMin = i;
            }

            if(iMin != j)
            {
                int temp = array[j];
                array[j] = array[iMin];
                array[iMin] = temp;
            }
        }

        return array;
    }

    public static int[] InsertionSort(int[] array)
    {
        for(int i = 1; i < ARRAY_SIZE; ++i)
        {
            int j = i;
            while(j > 0 && array[j - 1] > array[j])
            {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                --j;
            }
        }

        return array;
    }

    public static int[] MergeSort(int[] array)
    {
        if (array.length <= 1)
            return array;

    int mid = array.length / 2;

    int[] arrayOne = Arrays.copyOfRange(array, 0, mid); 
    int[] arrayTwo = Arrays.copyOfRange(array, mid, array.length); 


    arrayOne = MergeSort(arrayOne);
    arrayTwo = MergeSort(arrayTwo);

    return merge(arrayOne, arrayTwo);

    }

    public static int[] merge(int[] arrayA, int[] arrayB)
    {
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int i = 0, j = 0, k = 0;

        while (i < arrayA.length && j < arrayB.length)
        {
            if (arrayA[i] <= arrayB[j])
            {
                arrayC[k++] = arrayA[i++];
            } else {
                arrayC[k++] = arrayB[j++];
            }
        }

        while (i < arrayA.length)
        {
            arrayC[k++] = arrayA[i++];
        }

        while (j < arrayB.length)
        {
            arrayC[k++] = arrayB[j++];
        }

        return arrayC;
    }

    public static void QuickSort(int[] array, int low , int high)
    {
        if(low < high)
        {
            int pivot_location = Partition(array, low, high);
            QuickSort(array, low, pivot_location - 1);
            QuickSort(array, pivot_location + 1, high);
        }
    }

    public static int Partition(int[] array, int low, int high)
    {
        int pivot = array[low];
        int leftwall = low;

        for(int i = low + 1; i <= high; ++i)
        {
            if(array[i] < pivot)
            {
                ++leftwall;
                int temp = array[i];
                array[i] = array[leftwall];
                array[leftwall] = temp;
            }

        }

        int temp = array[low];
        array[low] = array[leftwall];
        array[leftwall] = temp;

        return leftwall;
    }

}

