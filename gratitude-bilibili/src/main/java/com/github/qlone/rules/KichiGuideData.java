package com.github.qlone.rules;

import com.github.qlone.parse.annotation.Attr;
import com.github.qlone.parse.annotation.Html;
import com.github.qlone.parse.annotation.Select;
import com.github.qlone.parse.annotation.Text;
import lombok.Data;

import java.util.List;

/**
 * @author heweinan
 * @date 2020-11-27 15:38
 */
@Data
public class KichiGuideData {

    //导航
    @Select("div#app div#kichiku_guide div.spread-module")
    private List<GuideVideo> guideVideos;

    //音mad
    @Select("div#app div#kichiku_mad div.spread-module")
    private List<GuideVideo> madVideos;

    //人力
    @Select("div#app div#kichiku_manual_vocaloid div.spread-module")
    private List<GuideVideo> mvVideos;

    //鬼畜剧场kichiku_theatre
    @Select("div#app div#kichiku_theatre div.spread-module")
    private List<GuideVideo> theatreVideos;

    //教程kichiku_course
    @Select("div#app div#kichiku_course div.spread-module")
    private List<GuideVideo> courseVideos;

    @Data
    public static class GuideVideo{

        @Text(value = "a p.t")
        private String title;

        @Attr(value = "a",attr = "href")
        private String url;

        @Attr(value = "a img",attr = "src")
        private String pic;

        @Text("a p.num span.play")
        private String play;

        @Text("a p.num span.danmu")
        private String danmu;
    }
}
