package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ListLinks {
    public static void main(String[] args) throws IOException {
        String url = "http://career.hdu.edu.cn/";
//        String url = "http://www.haitou.cc/";
        print("Fetching %s...", url);

        Document doc     = Jsoup.connect(url).get();
        Elements links   = doc.select("a[href]");
        Elements media   = doc.select("[src]");
        Elements imports = doc.select("link[href]");

        /*Media*/
        print("\nMedia: (%d)", media.size());
        for (Element element : media) {
            String tagName = element.tagName();
            if (tagName.equals("img"))
                print(" * %s: <%s> %sx%s (%s)", tagName, element.attr("abs:element"), element.attr("width"), element.attr("height"), trim(element.attr("alt"), 20));
            else
                print(" * %s: <%s>", tagName, element.attr("abs:element"));
        }

        /*Import*/
        print("\nImports: (%d)", imports.size());
        for (Element link : imports) {
            print(" * %s <%s> (%s)", link.tagName(), link.attr("abs:href"), link.attr("rel"));
        }

        /*Links*/
        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
        }
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width - 1) + ".";
        else
            return s;
    }
}