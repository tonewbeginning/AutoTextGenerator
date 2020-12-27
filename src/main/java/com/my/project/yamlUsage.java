package com.my.project;


import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public class yamlUsage {
    public void readYaml() throws FileNotFoundException {
        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("trial.yaml");
        Map<String, Object> map =
                (Map<String, Object>) yaml.load(inputStream);
        System.out.println(map.get("oneObject"));

    }
}
