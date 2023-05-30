import java.util.*;

/*This code is calculating the average time for a cashier to help a customer.
 The queue data structure is used in parallel with a linked list in order to handle a variable size of data
 in a first-in-first-out manner. This is important because the first customer in the queue needs to be the first
 customer serviced and queue does that by default.
 * */
public class TicketCounter    
{   private final static int PROCESS = 120;
    private final static int MAX_CASHIERS = 10;
    private final static int NUM_CUSTOMERS = 100;
    public static void main(String[] args) 
    {  Customer customer;
        Queue<Customer> customerQueue = new LinkedList<Customer>();
        int[] cashierTime = new int[MAX_CASHIERS];	
        int totalTime, averageTime, departs, start;
        // run the simulation for various number of cashiers 
        for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++)
        { 
            // set each cashiers time to zero initially
            for (int count = 0; count < cashiers; count++)
                cashierTime[count] = 0;
            // load customer queue 
            for (int count = 1; count <= NUM_CUSTOMERS; count++)
                customerQueue.add(new Customer(count * 15));
            totalTime = 0;
            // process all customers in the queue 
            while (!(customerQueue.isEmpty())) 
            {
                for (int count = 0; count <= cashiers; count++)
                {
                    if (!(customerQueue.isEmpty()))
                    {
                        customer = customerQueue.remove();
                        /*if the customer's arrival time is greater than cashierTime then the
                        start time of the process is customers arrival time. Since new customers are arriving every 15 sec,so
                        if customer arrives at 19th sec instead of 15th sec then the starting time of
                        the process will be the considered from the 19th sec not 15th */
                        if (customer.getArrivalTime() > cashierTime[count])
						    start = customer.getArrivalTime();
                        else
                            start = cashierTime[count]; 
						departs = start + PROCESS;
					    customer.setDepartureTime(departs);
                        cashierTime[count] = departs;
                        totalTime += customer.totalTime();
                    }
                }
            }
            // output results for this simulation 
            averageTime = totalTime / NUM_CUSTOMERS;
            System.out.println("Number of cashiers: " + (cashiers + 1));
            System.out.println("Average time: " + averageTime + "\n");
        }
    }
}

