class Solution {
   /* This is the Task class definition
   class Task {
       public int deadline, profit;
       public Task(int deadline, int profit) {
           this.deadline = deadline;
           this.profit = profit;
       }
   }
   */
   class TaskComparator implements Comparator<Task> {
       public int compare(Task t1, Task t2){
           return t1.deadline - t2.deadline;
       }
   }
   int getMaxProfit(Task[] tasks) {
       Arrays.sort (tasks, new TaskComparator());
       PriorityQueue<Integer> chosenTasks = new PriorityQueue<Integer> ();
       for (int i = 0; i < tasks.length; i++) {
           if (chosenTasks.size() == tasks[i].deadline) {
               if(chosenTasks.peek() > tasks[i].profit) {
                   continue;
               }
               chosenTasks.poll();
           }
           chosenTasks.add(tasks[i].profit);
       }
       int totalProfit = 0;
       while (!chosenTasks.isEmpty()) {
           totalProfit += chosenTasks.peek();
           chosenTasks.poll();
       }
       return totalProfit;
   }
}