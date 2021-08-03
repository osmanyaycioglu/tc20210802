package com.training.spring.configuration;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "laguage.prop")
public class MyConfigProp {

    private int                   helloLanguage;
    private double                multiplier;
    private String                desc;
    private List<String>          strList;
    private Map<String, Language> langMap;
    private Language              language;


    public Map<String, Language> getLangMap() {
        return this.langMap;
    }


    public void setLangMap(final Map<String, Language> langMapParam) {
        this.langMap = langMapParam;
    }


    public Language getLanguage() {
        return this.language;
    }


    public void setLanguage(final Language languageParam) {
        this.language = languageParam;
    }


    public int getHelloLanguage() {
        return this.helloLanguage;
    }


    public void setHelloLanguage(final int helloLanguageParam) {
        this.helloLanguage = helloLanguageParam;
    }


    public double getMultiplier() {
        return this.multiplier;
    }


    public void setMultiplier(final double multiplierParam) {
        this.multiplier = multiplierParam;
    }


    public List<String> getStrList() {
        return this.strList;
    }


    public void setStrList(final List<String> strListParam) {
        this.strList = strListParam;
    }


    public String getDesc() {
        return this.desc;
    }


    public void setDesc(final String descParam) {
        this.desc = descParam;
    }


    @Override
    public String toString() {
        return "MyConfigProp [helloLanguage="
               + this.helloLanguage
               + ", multiplier="
               + this.multiplier
               + ", desc="
               + this.desc
               + ", strList="
               + this.strList
               + ", langMap="
               + this.langMap
               + ", language="
               + this.language
               + "]";
    }


}
