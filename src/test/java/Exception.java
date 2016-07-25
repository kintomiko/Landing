import org.apache.commons.lang.exception.ExceptionUtils;
import org.junit.Test;

/**
 * Created by kindai on 12/07/16.
 */
public class Exception {

    @Test
    public void testExceptionStack(){
        try {
            catchAndThrow();
        } catch (java.lang.Exception e) {
            if(ExceptionUtils.getRootCause(e) instanceof IllegalArgumentException){
                System.out.println("123123123");
            }
        }
    }

    private void throwException(){
        throw new java.lang.IllegalArgumentException();
    }

    private void catchAndThrow() throws java.lang.Exception {
        try{
            throwException();
        }catch (java.lang.IllegalArgumentException e){
            throw new java.lang.Exception(e);
        }
    }
}
