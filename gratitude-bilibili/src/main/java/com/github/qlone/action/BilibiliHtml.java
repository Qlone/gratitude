package com.github.qlone.action;

import com.github.qlone.Call;
import com.github.qlone.Response;
import com.github.qlone.http.GET;
import com.github.qlone.http.Javascript;
import com.github.qlone.http.Javascripts;
import com.github.qlone.http.Selenium;
import com.github.qlone.rules.KichiGuideData;

/**
 * 鬼畜页面
 * @author heweinan
 * @date 2020-11-27 15:34
 */
public interface BilibiliHtml {

    //需要停留200毫秒才会加载
    @Selenium
    @Javascripts({
            @Javascript(value = "document.getElementById(arguments[0]).scrollIntoView();"
                    ,argument = {"kichiku_guide"},blockTime = 200),
            @Javascript(value = "document.getElementById(arguments[0]).scrollIntoView();"
                    ,argument = {"kichiku_mad"}
                    ,blockTime = 300),
            @Javascript(value = "document.getElementById(arguments[0]).scrollIntoView();"
                    ,argument = {"kichiku_manual_vocaloid"}
                    ,blockTime = 300),
            @Javascript(value = "document.getElementById(arguments[0]).scrollIntoView();"
                    ,argument = {"kichiku_theatre"}
                    ,blockTime = 300),
            @Javascript(value = "document.getElementById(arguments[0]).scrollIntoView();"
                    ,argument = {"kichiku_course"}
                    ,blockTime = 300)
    })
    @GET("v/kichiku/")
    Response<KichiGuideData> kichiku();
}
