package com.github.qlone;

import com.alibaba.fastjson.JSONObject;
import com.github.qlone.action.BilibiliHtml;
import com.github.qlone.action.BilibiliHtmlService;
import com.github.qlone.rules.KichiGuideData;
import com.github.qlone.selenium.SeleniumDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import java.io.IOException;

/**
 * @author heweinan
 * @date 2020-11-27 15:52
 */
public class Bilibili {
    public static void main(String[] args) throws IOException {
        BilibiliHtmlService service = new BilibiliHtmlService();

        System.out.println("导航-----------");
        KichiGuideData kichiku = service.kichiku();
        for(KichiGuideData.GuideVideo video: kichiku.getGuideVideos()){
            System.out.println(JSONObject.toJSONString(video));
        }
        System.out.println("音mad-----------");
        for(KichiGuideData.GuideVideo video: kichiku.getMadVideos()){
            System.out.println(JSONObject.toJSONString(video));
        }
        System.out.println("人力-----------");
        for(KichiGuideData.GuideVideo video: kichiku.getMvVideos()){
            System.out.println(JSONObject.toJSONString(video));
        }
        System.out.println("鬼畜剧场-----------");
        for(KichiGuideData.GuideVideo video: kichiku.getTheatreVideos()){
            System.out.println(JSONObject.toJSONString(video));
        }
        System.out.println("教程-----------");
        for(KichiGuideData.GuideVideo video: kichiku.getCourseVideos()){
            System.out.println(JSONObject.toJSONString(video));
        }
        System.out.println("finished");

    }
}
