//https://www.youtube.com/watch?v=BywIOD_Y3CE
//https://developers.google.com/protocol-buffers/docs/proto3
package com.my.project;


import com.my.protoproject.proto.SamplePayload;
import com.my.project.ftlUsage;
import freemarker.template.TemplateException;
import com.my.project.yamlUsage;
import java.io.IOException;
import java.net.URISyntaxException;

public class protoUsage {

    public static void main(String[] args) throws IOException, TemplateException, URISyntaxException {
	// write your code here
        SamplePayload.Builder sampleLoad = SamplePayload.newBuilder();
        sampleLoad.setName("this");
        sampleLoad.build();
        System.out.println("hi");
        System.out.println("hi");
        System.out.println(ftlUsage.getFreemarkerString());
        yamlUsage yml = new yamlUsage();
        yml.readYaml();
    }
}
