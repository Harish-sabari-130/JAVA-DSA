public class ExceptionClassnotfound {
     public static void main(String[] args) throws ClassNotFoundException {
        int a=10;
        checkException();
    }
    public static void checkException() throws ClassNotFoundException
    {
        throw new ClassNotFoundException();
    }
}
