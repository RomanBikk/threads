public class StringForFirstThreadTooShortException extends RuntimeException {


    @Override
    public synchronized Throwable getCause() {
        return new StringIndexOutOfBoundsException("String index out of range: -1");
    }
}
