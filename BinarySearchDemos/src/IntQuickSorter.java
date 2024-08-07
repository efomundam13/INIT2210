public class IntQuickSorter {

    public static void sort(int[] array) {
        quickSort(array);
    }

    public static void quickSort(int[] numbers) {
        if (numbers.length <= 1) {
            return;
        }

        // Choose a pivot element.
        int pivot = numbers[numbers.length / 2];

        // Partition the array around the pivot element.
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            while (numbers[i] < pivot) {
                i++;
            }
            while (numbers[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}