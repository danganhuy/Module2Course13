public class Exercise4 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 12, 25, 27, 49, 66, 71};
        int key = 49;
        int index = binarySearch(array, 0, array.length, key);

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if (index == -1) {
            System.out.println("Value " + key + " not found");
        }
        else {
            System.out.println("Value " + key + " is at " + index + " in the array");
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (left > right) {
            return -1;
        }
        if (array[middle] > value) {
            return binarySearch(array, left, middle - 1, value);
        }
        if (array[middle] < value) {
            return binarySearch(array, middle + 1, right, value);
        }
        return middle;
    }
}
