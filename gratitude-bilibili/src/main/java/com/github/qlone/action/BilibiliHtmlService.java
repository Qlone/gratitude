package com.github.qlone.action;

import com.github.qlone.Call;
import com.github.qlone.Response;
import com.github.qlone.RetrofitCrawler;
import com.github.qlone.rules.KichiGuideData;
import com.github.qlone.selenium.SeleniumDriver;
import com.github.qlone.util.Util;

/**
 * @author heweinan
 * @date 2020-12-03 15:46
 */
public class BilibiliHtmlService{

    private final BilibiliHtml bilibiliHtml;

    public BilibiliHtmlService() {
        RetrofitCrawler crawler = new RetrofitCrawler.Builder()
                .baseUrl("https://www.bilibili.com/")
                .seleniumDirver(SeleniumDriver.Phantomjs)
                .seleniumDirverPath("/Users/heweinan/Documents/software/webdriver/phantomjs")
//                .seleniumDirver(SeleniumDriver.Chrome)
//                .seleniumDirverPath("/Users/heweinan/Documents/software/webdriver/chromedriver")
                .build();
        bilibiliHtml = crawler.create(BilibiliHtml.class);
    }


    public KichiGuideData kichiku() {
        return bilibiliHtml.kichiku().body();
    }
}
