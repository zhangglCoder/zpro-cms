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


    public List<OpenTables> findOpenTableList(){
        List<OpenTables> tablesList = new ArrayList<>();

        try {

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
            Document doc = Jsoup.connect("http://www.7724.com/kaifu.html").get();
            Elements now_kf = doc.getElementsByClass("open_t_r_table");
            Elements selectTr = now_kf.select("tr");
            for (Element element :selectTr){
                OpenTables openTables = new OpenTables();
                openTables.setTitle(element.select("em a").text());
                openTables.setArea(element.select("p i").text());
                openTables.setOpenTime(df.format(new Date())+" "+element.select("p[class='p2'] span").text());
                openTables.setType(element.select("p[class='p1'] span").text());
                tablesList.add(openTables);
            }
            return tablesList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<OpenTables> findOpenTableJjkfList(){
        List<OpenTables> tablesList = new ArrayList<>();
        try {
            Document doc = Jsoup.connect("http://www.7724.com/kaifu.html").get();
            Elements now_kf = doc.getElementsByClass("open_t_r_jjkc");
            Elements selectTr = now_kf.select("tr");
            for (Element element :selectTr){
                Elements th = element.select("th");
                if(th.size() <=0 ){
                    OpenTables openTables = new OpenTables();
                    openTables.setTitle(element.select("p[class='p1'] a").text());
                    openTables.setArea(element.select("p[class='p2'] i").text());
                    openTables.setOpenTime(element.select("td").text());
                    openTables.setType(element.select("p[class='p2']").text());
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
