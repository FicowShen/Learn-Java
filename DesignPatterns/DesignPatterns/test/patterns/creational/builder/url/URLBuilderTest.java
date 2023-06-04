package patterns.creational.builder.url;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class URLBuilderTest {
    @Test
    void testBuilder() {
        Map<String, String> query = Collections.singletonMap("a", "123");
        String url = URLBuilder.builder() // 创建Builder
                .setDomain("blog.ficowshen.com") // 设置domain
                .setScheme("https") // 设置scheme
                .setPath("/page/post/10") // 设置路径
                .setQuery(query) // 设置query
                .build(); // 完成build
        assertEquals("https://blog.ficowshen.com/page/post/10?a=123", url);
//        System.out.println(url);
    }
}