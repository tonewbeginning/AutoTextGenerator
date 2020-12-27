package com.my.project;
//https://www.youtube.com/watch?v=g4ELT0pBEao
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.InputStream;
import java.lang.*;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.util.*;

public class ftlUsage {
    public static String getFreemarkerString() throws IOException, TemplateException, URISyntaxException {
        // Create config
        freemarker.template.Configuration cfg =
                new freemarker.template.Configuration();
        cfg.setDirectoryForTemplateLoading(
                new File(ftlUsage.class.getResource("/templates").toURI()));
        // Create dynamic data
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("fruit","apple");
        tempMap.put("fruitCount",10);
        tempMap.put("color","blue");
        List userList = Arrays.asList("Krab","Kilamanjaro");
        System.out.println(userList.toString());
        tempMap.put("users",userList);

        Template template = cfg.getTemplate("/dummyTemplate.ftl");

        //Process template
        StringWriter stringWriter = new StringWriter();
        template.process(tempMap, stringWriter);
        return stringWriter.toString();
    }
}
