/* =====================================================================
   Q64. Application: Online Billing System
   -----------------------------------------------------------------
   Recurrence relation implemented : T(n) = T(n-1) + 1 ,  T(0) = 0

   The function billTransactions() models a billing system that
   processes "n" pending transactions one at a time. Each call does a
   constant amount of work (billing one transaction) and then makes a
   single recursive call on the remaining (n-1) transactions.

   Time complexity  : O(n)   -> derived using substitution method
   Space complexity : O(n)   -> one stack frame per recursive call
   ===================================================================== */

#include <stdio.h>

/* ---------------------------------------------------------------------
   billTransactions()
   Simulates processing of "n" transactions using the recurrence
   T(n) = T(n-1) + 1.

   @param n : number of pending transactions to bill
   @return  : total number of transactions billed (equal to n)
   --------------------------------------------------------------------- */
int billTransactions(int n)
{
    /* Base case: no transactions left to process -> T(0) = 0 */
    if (n == 0)
    {
        return 0;
    }

    /* ---- Constant work done at this level: bill ONE transaction ---- */
    printf("Processing transaction #%d ... billed successfully.\n", n);

    /* ---- Recursive call: bill the remaining (n-1) transactions ---- */
    int remaining = billTransactions(n - 1);

    /* T(n) = T(n-1) + 1  (the "+1" accounts for the transaction billed
       at the current level of recursion)                              */
    return remaining + 1;
}

/* ---------------------------------------------------------------------
   main()
   Driver code: reads the number of transactions from the user and
   invokes the recursive billing engine.
   --------------------------------------------------------------------- */
int main(void)
{
    int n;

    printf("=== Online Billing System ===\n");
    printf("Enter number of transactions to process: ");
    scanf("%d", &n);

    if (n < 0)
    {
        printf("Invalid input: number of transactions cannot be negative.\n");
        return 1;
    }

    int totalBilled = billTransactions(n);

    printf("\nTotal transactions billed: %d\n", totalBilled);
    printf("Recurrence used            : T(n) = T(n-1) + 1\n");
    printf("Time complexity             : O(n)\n");
    printf("Space complexity            : O(n)  (recursion call stack)\n");

    return 0;
}
