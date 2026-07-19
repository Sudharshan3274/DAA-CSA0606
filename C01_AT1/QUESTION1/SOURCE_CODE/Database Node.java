public class DatabaseNode {

    private String nodeName;

    public DatabaseNode(String nodeName) {
        this.nodeName = nodeName;
    }

    public Result execute(Query query) {

        System.out.println(nodeName + " processing "
                + query.getRecords() + " records.");

        return new Result(query.getRecords(), 1);
    }
}