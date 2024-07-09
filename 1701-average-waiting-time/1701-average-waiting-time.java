class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double time_waiting = customers[0][1];
        int finished_prev = customers[0][0] + customers[0][1];

        for (int customer_ind = 1; customer_ind < n; ++customer_ind) {
            int[] times = customers[customer_ind];
            int arrive = times[0];

            int start_cook = Math.max(arrive, finished_prev);
            int end_time = start_cook + times[1];
            finished_prev = end_time;
            time_waiting += end_time - arrive;
        }

        return time_waiting / n;
    }
}// class Solution {
//     public double averageWaitingTime(int[][] customers) {
//         int cook_end = 0;
//         int sum_wait = 0;
        
//         for(int i = 0; i < customers.length; i++) {
//             // Update cook_end to the maximum of current cook_end or customer's arrival time
//             cook_end = Math.max(cook_end, customers[i][0]) + customers[i][1];
//             // Calculate the waiting time for the current customer
//             int wait = cook_end - customers[i][0];
//             // Accumulate the total waiting time
//             sum_wait += wait;
//         }
        
//         // Return the average waiting time
//         return (double) sum_wait / customers.length;
//     }
// }
// /*class Solution {
//     public double averageWaitingTime(int[][] customers) {
//         int cook_end=customers[0][0];
//         int sum_wait=0, wait=0;
//         for(int i=0; i<customers.length; i++)
//         {
//             if(cook_end>customers[i][0])
//             {
//             cook_end = cook_end + customers[i][1];
//             wait = cook_end - customers[i][0];
//             }
//             else
//             {
//                 wait=customers[i][1];
//             }
//             sum_wait += wait;
//         }
//         return (sum_wait/customers.length);
//     }
// }*/