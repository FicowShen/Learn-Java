package patterns.creational.AbstractFactory.FastFactory;

import patterns.creational.AbstractFactory.service.HtmlDocument;
import util.StringUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FastHtmlDocument implements HtmlDocument {

    private String md;

    public FastHtmlDocument(String md) { this.md = md; }

    @Override
    public String toHtml() {
        return StringUtil.lines(md).map(s -> {
            if (s.startsWith("#")) {
                return "<h1>" + s.substring(1) + "</h1>";
            }
            return "<p>" + s + "</p>";
        }).reduce("", (res, s) -> res + s + "\n");
    }

    @Override
    public void save(Path path) throws IOException {
        Files.write(path, toHtml().getBytes("UTF-8"));
    }
}
