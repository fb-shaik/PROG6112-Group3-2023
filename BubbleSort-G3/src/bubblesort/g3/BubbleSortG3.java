// Simple Bubble Sort App
package bubblesort.g3;

// Import statement for JOptionPane
import javax.swing.*;

public class BubbleSortG3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, " Please enter the number of elements to be stored in the array: "));

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            String input = JOptionPane.showInputDialog(null, " Enter element #" + (i + 1) + ": ");
            arr[i] = Integer.parseInt(input);
        }

        StringBuilder outputMessage = new StringBuilder("Original Array List: ");
        for (int i = 0; i < arr.length; i++) {
            outputMessage.append(arr[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, outputMessage);

        bubbleSort(arr);

        StringBuilder sortedMessage = new StringBuilder("Sorted Array List: ");
        for (int i = 0; i < arr.length; i++) {
            sortedMessage.append(arr[i]).append(" ");
        }
        JOptionPane.showMessageDialog(null, sortedMessage);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; // Moved the declaration inside the loop

        // Outer loop: Number of iterations based on array length
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Initialize swapped in each iteration

            // Inner loop: Swapping of elements occurs here
            for (int j = 0; j < n - 1 - i; j++) { // Use n - 1 - i to avoid unnecessary iterations
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped in the inner loop, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
