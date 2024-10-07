//mga class ni diri boss
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void main(String [] args){

		//mao ni katong scanner maong maka type
		Scanner sc = new Scanner(System.in);

		//Mangayo og pila kabuok ibutang ni bossing
		System.out.print("Enter size of the number: ");
		int number = sc.nextInt();

		// diri kay murag mangayog sa gi specified nga gi butang ni bossing
		int[] array = new int[number];

				//Mangayo og unsay ipa sort ni bossing
		        System.out.println("Numbers to be be sorted: ");

		       //loop ni bossing
		       for (int i = 0; i < number; i++) {
		            array[i] = sc.nextInt();
        }

//mo call mergeSort kay naas void
// Ang 0 kay ang Starting point, then and array.length - 1 kay and end point.
// mura rag instruction siya sa part sa array nga e sort.
// since atoa man e sort and whole array. mao ni.
mergeSort(array, 0, array.length - 1);


		//diri dapita kay mao naning sorted nga array, nag looping rapud
        System.out.print("Sorted arrays: ");
        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
        }

}

//Method sa insertionSort
public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {

			//mo calculate sa mid point then e divide into 2 halves
            int mid = left + (right - left) / 2;

            mergeSort(array, left, mid);
            	mergeSort(array, mid + 1, right);

            		merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];


        System.arraycopy(array, left, L, 0, n1);
        	System.arraycopy(array, mid + 1, R, 0, n2);

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }


    }

}
