package ExceptionInJava;

public class MyException extends Throwable {
    private String error;

    public MyException() {
    }

    public MyException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
