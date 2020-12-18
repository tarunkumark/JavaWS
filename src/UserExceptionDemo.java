class MyException extends Exception {
    public MyException(String s) {
        //Call constructor of parent Exception
        super(s);
    }
}
public class UserExceptionDemo {
    public static void main(String[] args) {
        try {
            //throw an object of user defined Exception
            throw new MyException("User Defined Exception");
        } catch (MyException ex) {
            System.out.println("caught");
            // Print the message from MyExecption object
            System.out.println(ex.getMessage());
        }
    }
}