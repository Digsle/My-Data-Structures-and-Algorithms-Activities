public class BaronHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public BaronHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Get the index of the parent of a node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Get the index of the left child of a node
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get the index of the right child of a node
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Inserts new element to the heap
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full");
            return;
      }
        heap[size] = value;
        size++;
        int current = size - 1;

        // Heapify up to maintain heap property
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
    }
    }

    // Remove and return the minimum element from the heap
    public int extractMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return Integer.MIN_VALUE;
    }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0); // Heapify down to maintain heap property
        return min;
    }

    // Heapify down to fix the heap property
    private void heapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
    }
    }

    // Swaps two elements
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Displays the elements of the heap
    public void display() {
        for (int i = 0; i < size; i++){
            System.out.print(heap[i] + " ");
    }
        System.out.println();
    }

    // Main method
    public static void main(String[] args){
        BaronHeap minHeap = new BaronHeap(10);
        minHeap.insert(10);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(8);

        System.out.println("Heap elements:");
        minHeap.display();

        System.out.println("Extracted min: " + minHeap.extractMin());
        System.out.println("Heap after extraction:");
        minHeap.display();
}
}
