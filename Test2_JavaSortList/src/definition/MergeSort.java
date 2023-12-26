package definition;

public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int midPoint = array.length / 2;
        int[] leftHalf = new int[midPoint];
        int[] rightHalf = new int[array.length - midPoint];

        System.arraycopy(array, 0, leftHalf, 0, midPoint);
        System.arraycopy(array, midPoint, rightHalf, 0, array.length - midPoint);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k++] = leftHalf[i++];
            } else {
                array[k++] = rightHalf[j++];
            }
        }

        while (i < leftSize) {
            array[k++] = leftHalf[i++];
        }

        while (j < rightSize) {
            array[k++] = rightHalf[j++];
        }
    }
}
