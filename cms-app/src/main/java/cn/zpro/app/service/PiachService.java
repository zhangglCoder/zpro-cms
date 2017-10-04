package cn.zpro.app.service;

import cn.zpro.app.dto.OpenTables;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class PiachService {


    public List<OpenTables> findOpenTableJjkfList(){
        List<OpenTables> tablesList = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("http://www.7724.com/kaifu.html").get();
            Elements now_kf = doc.getElementsByClass("open_t_r_jjkc");
            Element selectTable = now_kf.select("table").get(0);
            Elements selectTr = selectTable.select("tr");
            for (Element element :selectTr){
                Elements th = element.select("th");
                if(th.size() <=0 ){
                    OpenTables openTables = new OpenTables();
                    openTables.setTitle(element.select("p[class='p1'] a").text());
                    openTables.setArea(element.select("p[class='p2'] i").text());
                    openTables.setOpenTime(element.select("td").text());
                    openTables.setType(element.select("p[class='p2'] a").text());
                    tablesList.add(openTables);
                }
            }
            return tablesList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
