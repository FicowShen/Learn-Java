package patterns.creational.builder.url;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;

/***
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class URLBuilder {
    private String scheme = "http";
    private int port = -1;
    private String domain = null;
    private String path = "/";
    private String username = null;
    private String password = null;
    private Map<String, String> query = null;

    public static URLBuilder builder() {
        return new URLBuilder();
    }

    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(scheme).append("://");
        if (username != null && password != null) {
            sb.append(username).append(':').append(password).append('@');
        }
        sb.append(domain);
        if (port >= 0) {
            sb.append(':').append(port);
        }
        sb.append(path);
        if (query != null && !query.isEmpty()) {
            sb.append('?');
            query.forEach((k, v) -> {
                try {
                    sb.append(k).append('=').append(URLEncoder.encode(v, StandardCharsets.UTF_8.toString()));
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        return sb.toString();
    }

    public URLBuilder setScheme(String scheme) {
        this.scheme = Objects.requireNonNull(scheme);
        return this;
    }

    public URLBuilder setDomain(String domain) {
        this.domain = Objects.requireNonNull(domain);
        return this;
    }

    public URLBuilder setPath(String path) {
        this.path = Objects.requireNonNull(path);
        return this;
    }

    public URLBuilder setQuery(Map<String, String> query) {
        this.query = query;
        return this;
    }

    public URLBuilder setPort(int port) {
        if (port < 0 || port > 65535) {
            throw new IllegalArgumentException("Invalid port");
        }
        this.port = port;
        return this;
    }

    public URLBuilder setCredential(String username, String password) {
        this.username = Objects.requireNonNull(username);
        this.password = Objects.requireNonNull(password);
        return this;
    }
}
