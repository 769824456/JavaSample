package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yulongsun on 2016/5/13.
 */
public class JsoupDemo {

    public static void main(String[] args) {
        Document doc   = null;
        long     begin = System.currentTimeMillis();
        try {
            doc = Jsoup.connect("http://xjh.haitou.cc/hz/page-1").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取下一页的链接
        Elements link = doc.select("ul.pagination").select("li.next");
//        next_page_url = link.select("a").attr("href");
        // 获取tbody元素下的所有tr元素
        Elements elements = doc.select("tbody tr");
        for (Element element : elements) {
            String companyName = element.getElementsByClass("cxxt-title").text();
            String time        = element.select("td.text-left").first().text();
            String address     = element.getElementsByClass("text-ellipsis").text();

            System.out.println("companyName=" + companyName + "\t" + "time=" + time + "\t" + "address=" + address);
//            Map<String, Object> map = new HashMap<>();
//            map.put("company", companyName);
//            map.put("time", time);
//            map.put("address", address);
//            list.add(map);
        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-begin);
    }
}
