public class CSAFive {
    public static void main(String[] args) {
        int[] arr = {45,65,12,78,33,52,94,28,83,101,129};
        System.out.println("冒泡排序:");
        bubbleSort(arr);
        for(int n1 : arr){
            System.out.print(n1 + " ");
        }
        System.out.println("\n插入排序:");
        insertionSort(arr);
        for(int n2 : arr){
            System.out.print(n2 + " ");
        }
        System.out.println("\n快速排序:");
        quickSort(arr,0,arr.length-1);
        for(int n3 : arr){
            System.out.print(n3 + " ");
        }
        System.out.println("\n合并排序:");
        mergeSort(arr,0,arr.length-1);
        for(int n4 : arr){
            System.out.print(n4 + " ");
        }
        System.out.println("\n堆排序:");
        heapSort(arr);
        for(int n5 : arr){
            System.out.print(n5 + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // 获取分区点

            quickSort(arr, low, pi - 1);  // 对分区点左侧进行快速排序
            quickSort(arr, pi + 1, high); // 对分区点右侧进行快速排序
        }
    }

    // 选择一个元素作为分区点，并将小于分区点的元素放到左边，大于分区点的元素放到右边
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // 选择最后一个元素作为分区点
        int i = (low - 1); // 分区点的位置

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(arr, l, m); // 对左半部分进行归并排序
            mergeSort(arr, m + 1, r); // 对右半部分进行归并排序

            merge(arr, l, m, r); // 合并已排序的左右两部分
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 构建最大堆
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 依次将堆顶元素（最大值）与末尾元素交换，并重新调整堆
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
