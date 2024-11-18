public class Exercise1 {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    // [Thực hành] Cài đặt thuật toán tìm kiếm nhị phân không sử dụng đệ quy
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
