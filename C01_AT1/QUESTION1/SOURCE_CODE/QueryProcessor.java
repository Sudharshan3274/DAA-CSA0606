public class QueryProcessor {

    private int nodeCount = 1;

    public Result processQuery(Query query) {

        int n = query.getRecords();

        DatabaseNode node =
                new DatabaseNode("Node-" + nodeCount++);

        if (n <= 1) {

            return node.execute(query);

        }

        node.execute(query);

        int childSize = n / 2;

        int totalRecords = n;

        int totalNodes = 1;

        for (int i = 0; i < 5; i++) {

            Query childQuery =
                    new Query(query.getSql(), childSize);

            Result childResult = processQuery(childQuery);

            totalNodes += childResult.getNodesVisited();

        }

        return new Result(totalRecords, totalNodes);

    }

    public void displayMasterTheorem(int n) {

        System.out.println("\n=================================");
        System.out.println(" MASTER THEOREM ANALYSIS");
        System.out.println("=================================");

        System.out.println("Recurrence Relation");
        System.out.println("T(n) = 5T(n/2) + n");

        int a = 5;
        int b = 2;

        System.out.println("\na = " + a);
        System.out.println("b = " + b);

        double value =
                Math.log(a) / Math.log(b);

        System.out.printf("log2(5) = %.4f%n", value);

        System.out.println("\nf(n) = n");

        System.out.println("\nCompare");

        System.out.println("n  vs  n^" + value);

        System.out.println("\nSince");

        System.out.println("n = O(n^(logb(a)-ε))");

        System.out.println("\nMaster Theorem Case : 1");

        System.out.printf("Time Complexity : Θ(n^%.4f)%n", value);

        System.out.println("\nInterpretation");

        System.out.println("As the database size increases,");
        System.out.println("the recursive query execution");
        System.out.println("grows approximately as Θ(n^2.3219).");
        System.out.println("Communication overhead also increases");
        System.out.println("because every query generates");
        System.out.println("five recursive sub-queries.");
    }

}