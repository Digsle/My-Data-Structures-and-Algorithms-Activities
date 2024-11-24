import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityTaskScheduler {
    static class Task implements Comparable<Task> {
        String description;
        int priority;

        public Task(String description, int priority){
            this.description = description;
            this.priority = priority;
        }

        // Compares tasks by priority
        @Override
        public int compareTo(Task other) {
            return this.priority - other.priority; // smaller number = higher priority
        }

        // Displays task details
        @Override
        public String toString() {
            return description + " (Priority: " + priority + ")";
    }
    }

    public static void main(String[] args) {
        // Priority queue to store tasks
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        // Menu loop
        while (true){
            // Display options
            System.out.println("\nPriority Task Scheduler");
            System.out.println("1. Add a task");
            System.out.println("2. View next task");
            System.out.println("3. Execute next task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                // Option to add a task
                System.out.print("Enter task: ");
                String description = scanner.nextLine(); // Get task name
                System.out.print("Enter task priority (lower number = higher priority): ");
                int priority = scanner.nextInt(); // Get task priority
                taskQueue.add(new Task(description, priority)); // Add to queue
                System.out.println("Task added."); // Confirmation message

            } else if (choice == 2) {

                // Option to view the next task
                if (!taskQueue.isEmpty()) {
                    // Show the task with the highest priority
                    System.out.println("Next task: " + taskQueue.peek());
                } else {
                    // If no tasks are in the queue
                    System.out.println("No tasks in the queue.");
                }
            } else if (choice == 3) {
                // Option to execute the next task
                if (!taskQueue.isEmpty()) {
                    // Remove and display the highest priority task
                    System.out.println("Executing task: " + taskQueue.poll());
                } else {
                    // If no tasks to execute
                    System.out.println("No tasks to execute.");
                }
            } else if (choice == 4) {
                // Exit the program
                System.out.println("Exiting program");
                break; // End the loop
            } else {
                // If the user enters an invalid option
                System.out.println("Invalid choice. Try again.");
      }
    }
}
}
