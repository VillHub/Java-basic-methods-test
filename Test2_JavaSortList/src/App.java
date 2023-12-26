import definition.MergeSort;

public class App {
    public static void main(String[] args) {
        int[] numbers = {23, 17, 41, -19, 2023, 0, 2005, 77, 2099, 0};
        int i = 0;
        System.out.println("numbers array before sort:");
        for (int number : numbers) {
           
            if (++i < numbers.length) {
                System.out.print(number + ", ");
            } else {
                System.out.print(number + " ");
            }
        }


        System.out.println("\n\nSorting numbers with: \ndefinition.MergeSort.mergeSort(numbers)");

        MergeSort.mergeSort(numbers);

        System.out.println("\nNumbers array after mergesort:");
        i = 0;
        for (int number : numbers) {
            if (++i < numbers.length) {
                System.out.print(number + ", ");
            } else {
                System.out.print(number + " ");
            }
        }
    }
}
