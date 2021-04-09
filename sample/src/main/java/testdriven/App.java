package testdriven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public boolean login(String userId, String password){
        if(userId.equals("yyy") && password.equals("ppp")){
            return true;
        }else{
            return false;
        }
    }
}
