package Alghoritms.sorting;

public class Sorting {

    //helper function

    public static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public int[] bubbleSort(int[] array) {


        int[] list = array;

        for (int i = 0; i < list.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < list.length - i - 1; j++) {
                if(list[j] > list[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }

        return list;
    };

    static int[] selectionSort (int[] array) {

        int []list = array;

        for(int i = 0; i < list.length ; i++) {
            int min = i;

            for(int j = i+1; j < list.length  ; j ++) {

                if (list[j] < list[min]) {
                    min = j;
                }

                swap(array, i, min);
            }

        }

        return list;
    }



    static int partition (int arr[], int start, int end) {

        int sharingIndex = start;
        int baseElementIndex = end-1;

        for(int i = start; i < end ; i++) {

            if(arr[i] < arr[baseElementIndex]) {
                swap(arr, i, sharingIndex);
                sharingIndex++ ;
            }

        }

        swap(arr,sharingIndex,baseElementIndex);
        return sharingIndex;

    }

    public static void   quickSort (int[] array, int start, int end) {
        if(start < end) {
            int p = partition(array, start, end);

            quickSort(array, start, p - 1);
            quickSort(array, p + 1, end);
        }
    }




    public static void merge(int[] arr, int[] left, int[] right) {

        int i = 0; //  for left array
        int j = 0; //  for right array
        int idx = 0;

        int leftSize = left.length;
        int rightSize = right.length;


        while (i < leftSize && j < rightSize) {
            if (left[i] < right[j]) {
                arr[idx] = left[i];
                i++;
            } else {
                arr[idx] = right[j];
                j++;
            }
            idx++;

        }

        for (int ll = i; ll < leftSize; ll++)
            arr[idx++] = left[ll];

        for (int rr = j; rr < rightSize; rr++)
            arr[idx++] = right[rr];


    }

    public static void mergeSort(int[] arr, int len) {


        if (len < 2)
            return;

        int middleIndex = len / 2;

        int[] left = new int[middleIndex];
        int[] right = new int[len - middleIndex];


        for (int i = 0; i < middleIndex; i++) {
            left[i] = arr[i];
        }


        for (int i = middleIndex; i < len; i++) {
            right[i - middleIndex] = arr[i];
        }

        mergeSort(left, middleIndex);
        mergeSort(right, len - middleIndex);


        merge(arr, left, right);

    }

    public static void insertionSort(int[] arr) {

        int idx = 0;

        for (int i = idx + 1; i < arr.length; i++) {

            int element = arr[i];
            int j = i;

            while (j > 0 && arr[j - 1] > element) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }

            arr[j] = element;
        }

    }

}
