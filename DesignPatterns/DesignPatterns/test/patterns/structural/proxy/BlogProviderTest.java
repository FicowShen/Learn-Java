package patterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlogProviderTest {

    @Test
    void login() {
        BlogLoginAuthenticator auth = new BlogLoginAuthenticator();
        BlogLogger logger = new BlogLogger(auth);
        BlogProvider blog = logger;
        logger.login("hello", "123");
        assertFalse(auth.isLoginSucceed());
        assertTrue(logger.getLogs().get(0).contains("fail"));
        logger.login("ficow", "shen");
        assertTrue(auth.isLoginSucceed());
        assertTrue(logger.getLogs().get(1).contains("succeed"));
    }
}