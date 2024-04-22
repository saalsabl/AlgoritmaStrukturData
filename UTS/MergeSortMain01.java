public class MergeSortMain01 {
    public static void main(String[] args) {
        int data[] = {30, 50, 10, 26, 20, 13, 47, 7, 38, 33, 11, 0, 14, 37, 0, 40, 45};
        System.out.println("sorting dengan merge sort");
        MergeSort mSort = new MergeSort();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);
    }
}
