//mga class ni diri boss
import java.util.Arrays;
import java.util.Scanner;

public class Quicksort {
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

//mo call quickSort kay naas void
//mao ra gihapon same ra gihapon i love you sir.
quickSort(array, 0, array.length - 1);


		//diri dapita kay mao naning sorted nga array, nag looping rapud
        System.out.print("Sorted arrays: ");
        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
        }

}

//Method sa quickSort
public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);
            	quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        	int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                	array[i] = array[j];
                		array[j] = temp;
            }
        }

        int temp = array[i + 1];
        	array[i + 1] = array[high];
        		array[high] = temp;

        return i + 1;
    }
}