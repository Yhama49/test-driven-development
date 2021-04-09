package testdriven;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App app = new App();

    @Test
    public void shouldAnswerTrue(){
        String userId = "yyy";
        String password = "ppp";
        boolean result = app.login(userId, password);
        assertTrue(result);
    }

    @Test
    public void shouldAnswerFalse(){
        String userId = "aaa";
        String password = "ppp";
        boolean result = app.login(userId, password);
        assertFalse(result);
    }
}
