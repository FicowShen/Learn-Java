package patterns.structural.proxy;

/**
 * 为其他对象提供一种代理以控制对这个对象的访问
 */
public interface BlogProvider {
    void login(String id, String pwd);
}
