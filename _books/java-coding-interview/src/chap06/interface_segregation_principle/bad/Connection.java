package chap06.interface_segregation_principle.bad;

public interface Connection {
    public void socket();
    public void http();
    public void connect();
}
