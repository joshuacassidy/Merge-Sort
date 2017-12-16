public class Main {
    public static void main(String[] args) {
        String[] arr = {"4","3","2","1","6"};
        MergeSort mergeSort = new MergeSort(arr);
        mergeSort.sort(0, arr.length-1);
        mergeSort.traverse();
    }
}
