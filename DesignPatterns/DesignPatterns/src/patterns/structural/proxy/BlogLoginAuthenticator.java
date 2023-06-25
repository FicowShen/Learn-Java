package patterns.structural.proxy;

public class BlogLoginAuthenticator implements BlogProvider {
    private boolean loginSucceed = false;

    @Override
    public void login(String id, String pwd) {
        if ("ficow".equals(id) && "shen".equals(pwd)) {
            loginSucceed = true;
        } else {
            loginSucceed = false;
        }
    }

    public boolean isLoginSucceed() {
        return loginSucceed;
    }
}
