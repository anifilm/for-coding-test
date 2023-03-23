package chap06.interface_segregation_principle.good;

public interface HttpConnection extends Connection {
    public void http();
}
