package patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class BlogLogger implements BlogProvider {
    private List logs = new ArrayList<String>();
    private BlogLoginAuthenticator authenticator;

    BlogLogger(BlogLoginAuthenticator authenticator) {
        this.authenticator = authenticator;
    }

    public List<String> getLogs() {
        return logs;
    }

    @Override
    public void login(String id, String pwd) {
        authenticator.login(id, pwd);
        logs.add("login " + (authenticator.isLoginSucceed() ? "succeed" : "fail"));
    }
}
