package sortingalgorithms;
public class SortingUnorderArray {
    private int array[];
    private int actual;
    
    public SortingUnorderArray(int size){
        this.array=new int [size];
        this.actual=0;
    }
    //insert function
    public void insert(int value){
        if(checkIfValid()==true){
        array[actual]=value;
        actual++;
        }
        else{
            System.out.println("array is complete");
        }
    }
    //check if insert operation is valid
    public boolean checkIfValid(){
        return actual != array.length;
    }
    //display array content
    public void display(){
        for (int i = 0; i < actual ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
    //buble sort function
    public void bubleSorting(){
        for (int i = actual-1; i >1 ; i--) {
            for (int j = 0; j <i ; j++) {
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            display();
        }
    }
    //insertion sort function
    public void insertioSorting(){
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j -1;
                array[j + 1] = key; 
            }
            display();
        }
    }   
    //start of merge code
        public void merge(int arr[], int l, int m, int r)
    {
        int s1 = m - l + 1;
        int s2 = r - m;
 
        int L[] = new int [s1];
        int R[] = new int [s2];
 
        for (int i=0; i<s1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<s2; ++j)
            R[j] = arr[m + 1+ j];
 
        int i = 0, j = 0;
        int k = l;
        while (i < s1 && j < s2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < s1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < s2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        display();
    }
    
    public void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
    public void runMerge(){
        sort(array, 0 , actual-1);
    }
    //end of merge code
    
    //shell sort function
    public void shellSorting(){
        int n = array.length;
         for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
                display();
            }
        }
    }
    
    //start of Quick Sort code
    public void quickSort() {
        recQuickSort(0, actual- 1);
    }
    public void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            long pivot = array[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }
    
    @SuppressWarnings("empty-statement")
    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (array[++leftPtr] < pivot);
            while (rightPtr > 0 && array[--rightPtr] > pivot);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(array,leftPtr, rightPtr);
            }
        }
        swap(array, leftPtr, right);
        display();
        return leftPtr;
    }
    public void swap(int arr[] , int x , int y ){
        int temp =arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    //end of quick sort code
    
    //start of heap sort code
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(arr,0,i);
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
        if (l < n && arr[l] > arr[largest])
            largest = l;
        
        if (r < n && arr[r] > arr[largest])
            largest = r;
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
    public void runHeap(){
        sort(array);
    }
//    public void swap(int arr[], int x , int y){
//        int temp = arr[x];
//        arr[x] = arr[y] ;
//        arr[y] = temp;
//    }
    //end of heap sort code 
}
