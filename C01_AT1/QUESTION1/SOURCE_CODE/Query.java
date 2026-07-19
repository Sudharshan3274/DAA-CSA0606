public class Query {

    private String sql;
    private int records;

    public Query(String sql, int records) {
        this.sql = sql;
        this.records = records;
    }

    public String getSql() {
        return sql;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }
}