package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by yulongsun on 2016/5/13.
 */
public class JsoupDemo {

    public static void main(String[] args) {
        Document doc   = null;
        long     begin = System.currentTimeMillis();
        try {
//            doc = Jsoup.connect("http://xjh.haitou.cc/hz/page-1").get();
            doc = Jsoup.connect("http://hz.lianjia.com/zufang/rs").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取下一页的链接
//        Elements link = doc.select("ul.pagination").select("li.next");
//        next_page_url = link.select("a").attr("href");
        // 获取tbody元素下的所有tr元素
        Elements houseLists = doc.select("ul.house-lst");
        for (Element house : houseLists) {
            String img   = house.getElementsByClass("pic-panel").select("img").attr("src");
            String name  = house.getElementsByClass("info-panel").select("h2 > a").text();
            String where = house.getElementsByClass("info-panel").select("div.where").text();
            String other = house.getElementsByClass("info-panel").select("other").text();
            System.out.println("img=" + img + "\t" + "name=" + name + "\t" + "where=" + where + "\t" + "other=" + other);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
