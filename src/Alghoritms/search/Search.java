
package Alghoritms.search;

public class Search {

    public int BinarySearch(int[] arr, int item) {

        int low = 0;
        int high = arr.length - 1;


        while (low <= high) {

            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == item)
                return mid;
            if (guess > item)
                high = mid - 1;
            else
                low = mid + 1;

        }
        return -1;

    }


    public int BinarySearchRecursion(int[] arr, int item, int start, int end) {

        int mid = (start + end) / 2;

        if (start > end)
            return -1;

        if (item == arr[mid])
            return mid;
        else if (item > arr[mid])
           return BinarySearchRecursion(arr, item, mid + 1, end);
        else
           return BinarySearchRecursion(arr, item, start, mid - 1);

    }
}
