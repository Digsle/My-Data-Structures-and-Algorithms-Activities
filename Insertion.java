//mga class ni diri boss
import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
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

//mo call insertSort kay naas void
insertionSort(array);


		//diri dapita kay mao naning sorted nga array, nag looping rapud
        System.out.print("Sorted arrays: ");
        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
        }

}

//Method sa insertionSort
public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            	int key = array[i];
            	int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
           		array[j + 1] = key;
        }
    }

}
