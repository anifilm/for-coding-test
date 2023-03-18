package chap06.dependency_inversion_principle.good;

public class PostgreSQLJdbcUrl implements JdbcUrl {
    private final String dbName;

    public PostgreSQLJdbcUrl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String get() {
        return "jdbc:postgresql:// ... " + this.dbName;
    }
}
