package chap06.dependency_inversion_principle.good;

public class MySQLJdbcUrl implements JdbcUrl {
    private final String dbName;

    public MySQLJdbcUrl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String get() {
        return "jdbc:mysql:// ... " + this.dbName;
    }
}
