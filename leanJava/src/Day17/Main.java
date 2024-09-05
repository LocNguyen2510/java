package Day17;

public class Main {
    static int[] data = {9, 14, 3, 2, 43, 11, 58, 22};

    public static void printSortedArray() {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        //sort by bubble sort
        SortAlgorithm bubbleSort = new BubbleSort();
        bubbleSort.sort(data);
        System.out.print("bubble sort: ");
        printSortedArray();
        //sort by insertion sort
        SortAlgorithm insertionSort = new InsertionSort();
        insertionSort.sort(data);
        System.out.print("insertion sort: ");
        printSortedArray();
    }
}