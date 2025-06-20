public class ExceptionRuntime {
     public static void main(String[] args) {
        int a=10;
        checkException();
    }
    public static void checkException()
    {
        throw new RuntimeException();
    }
}
