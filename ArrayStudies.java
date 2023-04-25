import java.util.Arrays;

public class ArrayStudies {
    //declaring one-dimensional array
    int[] numbers = new int[10];
    //where size of array and variables are known already
    int[] otherNumbers = new int[]{1,2,3,4,5,8,8,7,9,0,3,4};
    //declaring a multidimensional array
    int[][] numberGrid = new int[3][3];
    int[][] numbersGrid = { {1,2,3,}, {4,5,6}, {7,8,9} };

    public void printArrayElements(){
        for (int i = 0; i < otherNumbers.length; i++) {
            System.out.println(otherNumbers[i]);
        }
    }
    public void print2DArrays(){
        System.out.println(Arrays.deepToString(numbersGrid));
    }

    public void sumOfArray(){
        var sum = 0;
        for (int i = 0; i < otherNumbers.length; i++) {
            sum += otherNumbers[i];
        }
        System.out.println(sum);
    }

    // LINEAR SEARCH PROBLEM
    // Given an array Arr of N elements and an integer K. Return the position of first occurrence of K in the given array.
    // Note: Position of first element is considered as 1
    // Note: Return -1 if the number is not found in array. You don't to print answer or take inputs.
    public int linearSearch(int k){
        for (int i = 0; i < otherNumbers.length; i++) {
            int searchedNum = otherNumbers[i];
            if(k==searchedNum){
                return i + 1;
            }
        }
        return -1;
    }

    // BINARY SEARCH PROBLEM
    // Given a sorted array of size N and an integer K, find the position(0-based indexing) at which K is present in the array using binary search.
    // If search is not present in the array, return -1.
    public int binarySearch(int[] arr, int search){
        int low = 0;
        int high = arr.length - 1;
        while (high >= low){
            int mid = low + (high - low)/2;
            if (arr[mid] ==  search){
                return mid;
            }
            if (search > mid){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearchRecursiveImpl(int arr[], int low, int high, int search){
        if (high >= low) {
            int mid = low + (high - low)/2;
            if(arr[mid]==search){
                return mid;
            }
            if (arr[mid] < search) {
                return binarySearchRecursiveImpl(arr, mid + 1, high, search);
            } else {
                return binarySearchRecursiveImpl(arr, low, mid - 1, search);
            }
        }
        return -1;
    }

    // Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the missing number from the first N integers.
    // Note: There are no duplicates in the list
    public int findMissingNumber(int[] arr, int number){
        int sum = Arrays.stream(arr).sum();
        for (int i = number; i > 0; i--) {
            // because index starts from 0 and 1 number is missing hence n-2
            int currentNumber = arr[i-2];
            int subtractCurrentNumber = sum - currentNumber;
            int subtractIndex = sum - i;
            if (subtractIndex != subtractCurrentNumber){
                return i;
            }
        }
        return -1;
    }
}
