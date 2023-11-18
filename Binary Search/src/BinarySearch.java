public class BinarySearch {
    public int binarySearch(int[] arr, int x, int start, int end){
        while (start <= end){
            int mid = start +((end - start) /2);
            if (arr[mid] ==x){
                return mid;
            }else if (x < arr[mid]){
                end = mid -1;
            }else if (x> arr[mid]){
                start = mid +1;
            }
        }
        return -1;
    }
}
