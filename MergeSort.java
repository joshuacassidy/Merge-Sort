public class MergeSort {
    private Comparable[] arr,temp;

    public MergeSort(Comparable[] arr) {
        this.arr = arr;
        this.temp = new Comparable[arr.length];
    }

    public void sort(int p, int r) {
        if (r <= p) {
            return;
        }

        int q = (p+r)/2;
        sort(p, q);
        sort(q+1, r);
        merge(p, q, r);
    }

    public void merge(int p, int q, int r) {
        int leftIndex,rightIndex, arrIndex;
        for (int i = p; i <= r; i++) {
            temp[i] = arr[i];
        }


        for (leftIndex =p, rightIndex = q + 1, arrIndex=p; (leftIndex <= q) && (rightIndex <= r); arrIndex++) {
            if (temp[leftIndex].compareTo(temp[rightIndex]) <= 0) {
                arr[arrIndex] = temp[leftIndex];
                leftIndex++;
            } else {
                arr[arrIndex] = temp[rightIndex];
                rightIndex++;
            }
        }

        for (;leftIndex <= q; arrIndex++, leftIndex++) {
            arr[arrIndex] = temp[leftIndex];
        }

    }

    public void traverse() {
        for (Comparable i: arr) {
            System.out.print(i + " ");
        }
    }

}
