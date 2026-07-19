public class Result {

    private int processedRecords;
    private int nodesVisited;

    public Result(int processedRecords, int nodesVisited) {
        this.processedRecords = processedRecords;
        this.nodesVisited = nodesVisited;
    }

    public int getProcessedRecords() {
        return processedRecords;
    }

    public int getNodesVisited() {
        return nodesVisited;
    }

    @Override
    public String toString() {

        return "Processed Records : " + processedRecords
                + "\nTotal Nodes Visited : " + nodesVisited;
    }
}