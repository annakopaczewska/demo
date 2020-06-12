package com.example.checkConfig;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConfigReader {

    @Value("${myConfigReader.exampleString}")
    public String exampleString;

    @Value("${myConfigReader.exampleNumber}")
    public int exampleNumber;

    @Value("${myConfigReader.exampleTrueOrFalse}")
    public boolean exampleTrueOrFalse;

    @RequestMapping("/checkConfig")
    public String checkConfig() {
        return "String from config: " + exampleString +
                " Number from config: " + exampleNumber +
                " Boolean from config: " + exampleTrueOrFalse;
    }
}
