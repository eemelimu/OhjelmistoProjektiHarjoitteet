public class BinarySearchEemeli {
    public static int search(int target, int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (array[mid] < target) {
                low = mid + 1;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] == target) {
                return mid;
            }
            mid = (low + high) / 2;
        }
        return -1;
    }
}
